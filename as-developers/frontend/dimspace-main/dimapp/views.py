"""View classes for dimspace"""
from django.views.generic import TemplateView
import requests

# Change this link to your own deployment of the Spring backend
API_LINK = "https://stephenneale-super-goggles-5x4p9g77wq4f4vj7-8080.preview.app.github.dev/"


class Home(TemplateView):
    """Home page class"""
    template_name = "home.html"

    def get_context_data(self, **kwargs):

        try:
            courses = requests.get(API_LINK + "courses", timeout=5).json()
        except ValueError:
            print(f"Error trying to reach {API_LINK}courses")
            courses = []

        course_info = []
        for course in courses:
            try:
                info = requests.get(API_LINK + f"courses/{course['id']}").json()
                course_info.append(info)
            except ValueError:
                print(f"Error tyring to reach {API_LINK}courses/{course['id']}")

        context = super().get_context_data(**kwargs)
        context['courses'] = courses
        context['course_info'] = course_info
        return context


class CourseHome(TemplateView):
    """Course home page class"""
    template_name = "coursehome.html"

    def get_context_data(self, **kwargs):

        course_id = kwargs.get('course_id', -1)
        try:
            course = requests.get(API_LINK + f"courses/{course_id}", timeout=5).json()
        except ValueError:
            print(f"Error trying to reach {API_LINK}courses/{course_id}")
            course = []
        try:
            content = requests.get(API_LINK + f"content/{course_id}", timeout=5).json()
        except ValueError:
            print(f"Error trying to reach {API_LINK}content/{course_id}")
            content = []

        context = super().get_context_data(**kwargs)
        context['course'] = course
        context['content'] = content
        return context
