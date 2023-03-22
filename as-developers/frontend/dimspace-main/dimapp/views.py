"""View classes for dimspace"""
from django.views.generic import TemplateView
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
        return context


class CourseHome(TemplateView):
    """Course home page class"""
    template_name = "coursehome.html"

    def get_context_data(self, **kwargs):
        """Get context for course main page"""

        course_id = kwargs.get('course_id', -1)
        course = get_from_api(f"courses/{course_id}")
        content = get_from_api(f"content/{course_id}")

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = course
        context['content'] = content
        return context

class CourseLectures(TemplateView):
    """Course lectures page class"""
    template_name="courselectures.html"

    def get_context_data(self, **kwargs):
        """Get context for course lectures page"""
        course_id = kwargs.get('course_id', -1)
        course = get_from_api(f"courses/{course_id}")

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = course
        return context


class CourseAssignments(TemplateView):
    """Course assignments page class"""
    template_name="courseassignments.html"

    def get_context_data(self, **kwargs):
        """Get context for course assignments page"""
        course_id = kwargs.get('course_id', -1)
        course = get_from_api(f"courses/{course_id}")

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = course
        return context


class CourseLabs(TemplateView):
    """Course labs page class"""
    template_name="courselabs.html"

    def get_context_data(self, **kwargs):
        """Get context for course labs page"""
        course_id = kwargs.get('course_id', -1)
        course = get_from_api(f"courses/{course_id}")

        # Set context
        context = super().get_context_data(**kwargs)
        context['course'] = course
        return context
