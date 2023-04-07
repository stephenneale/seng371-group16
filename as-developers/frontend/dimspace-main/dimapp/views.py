"""View classes for dimspace"""
import json
from django.views.generic import TemplateView
from django.views.decorators.csrf import csrf_exempt
from django.utils.decorators import method_decorator
from django.shortcuts import redirect
import requests


# Change this link to your own deployment of the Spring backend
# For development and CI, the springboot backend is being hosted at the URL below
API_LINK = "http://159.223.198.2:8080/"


def get_from_api(endpoint: str):
    """Attempts to get json from the specified API endpoint"""
    try:
        result = requests.get(API_LINK + endpoint, timeout=5).json()
    except ValueError:
        print(f"Error trying to reach {API_LINK}{endpoint}")
        result = []
    return result


class Home(TemplateView):
    """Home page class"""
    template_name = "home.html"

    def get_context_data(self, **kwargs):
        """Get context for home page"""

        courses = get_from_api("courses")
        course_info = []

        for course in courses:
            info = get_from_api(f"courses/{course['id']}")
            course_info.append(info)

        # Set context
        context = super().get_context_data(**kwargs)
        context['courses'] = courses
        context['course_info'] = course_info
        context['recent'] = get_from_api("content/recent")
        return context


class Grades(TemplateView):
    """Grades page class"""
    template_name = "grades.html"

    def get_context_data(self, **kwargs):
        """Get context for grades page"""

        courses = []
        courses.append(get_from_api("grades"))

        all_cumulative_grades = []
        for course in courses:
            cumulative_grade = 0
            for grade in course['grades']:
                if grade['percentage']:
                    # Add weighted grade to cumulative_grade
                    cumulative_grade += (grade['percentage'] * grade['weight'])
                    # Convert decimal grade to percentage string for displaying
                    grade['percentage'] = str(f"%{grade['percentage']*100}")
            # Convert decimal cumulative grade to percentage string
            cumulative_grade = str(f"%{cumulative_grade*100}")
            all_cumulative_grades.append(cumulative_grade)

        # Set context
        context = super().get_context_data(**kwargs)
        context['courses'] = courses
        context['all_cumulative_grades'] = all_cumulative_grades
        return context


class CourseHome(TemplateView):
    """Course home page class"""
    template_name = "coursehome.html"

    def get_context_data(self, **kwargs):
        """Get context for course main page"""

        course_id = kwargs.get('course_id', -1)
        content = get_from_api(f"content/{course_id}")
        if content == []:
            content = [{
                "author":"DimSpace",
                "message":"Nothing found here, check back later!",
            }]

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = get_from_api(f"courses/{course_id}")
        context['content'] = content
        return context

class CourseLectures(TemplateView):
    """Course lectures page class"""
    template_name="courselectures.html"

    def get_context_data(self, **kwargs):
        """Get context for course lectures page"""

        course_id = kwargs.get('course_id', -1)

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = get_from_api(f"courses/{course_id}")
        return context


class CourseAssignments(TemplateView):
    """Course assignments page class"""
    template_name="courseassignments.html"

    def get_context_data(self, **kwargs):
        """Get context for course assignments page"""

        course_id = kwargs.get('course_id', -1)

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = get_from_api(f"courses/{course_id}")
        return context


class CourseLabs(TemplateView):
    """Course labs page class"""
    template_name="courselabs.html"

    def get_context_data(self, **kwargs):
        """Get context for course labs page"""

        course_id = kwargs.get('course_id', -1)

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = get_from_api(f"courses/{course_id}")
        return context


class ViewAnnouncement(TemplateView):
    """Course announcement view class"""
    template_name="viewannouncement.html"

    def get_context_data(self, **kwargs):
        """Get context for announcement view"""

        course_id = kwargs.get('course_id', -1)
        content_id = kwargs.get('content_id', -1)
        content = get_from_api(f"content/{course_id}")
        for item in content:
            if item['id'] == content_id:
                announcement = item

        # Add content to recently viewed post endpoint
        requests.post(API_LINK+f"content/{course_id}/{content_id}/view", timeout=5)

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = get_from_api(f"courses/{course_id}")
        context['announcement'] = announcement
        return context


@method_decorator(csrf_exempt, name='dispatch')
class AddCourse(TemplateView):
    """Add new course class"""
    template_name="addcourse.html"

    def post(self, request):
        """Posts new course to API"""
        payload = request.POST.dict()
        headers = {'content-type': 'application/json'}

        requests.post(API_LINK+'courses', data=json.dumps(payload), headers=headers, timeout=10)

        return redirect('/dimspace/addcourse/success')


class AddCourseSuccess(TemplateView):
    """Success message for add course"""
    template_name="addcourse_success.html"
