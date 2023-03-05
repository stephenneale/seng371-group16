"""View classes for dimspace"""
from django.views.generic import TemplateView
import requests

API_LINK = "https://stephenneale-zany-eureka-64r7p9xqgx9fxrjq-8080.preview.app.github.dev/"

class Home(TemplateView):
    """Home page class"""
    template_name = "home.html"

    def get_context_data(self, **kwargs):

        try:
            courses = requests.get(API_LINK+"courses", timeout=5).json()
        except ValueError:
            courses = []

        context = super().get_context_data(**kwargs)
        context['courses'] = courses
        return context

class CourseHome(TemplateView):
    """Course home page class"""
    template_name = "coursehome.html"

    def get_context_data(self, **kwargs):

        course_id = kwargs.get('course_id', -1)
        try:
            course = requests.get(API_LINK+f"courses/{course_id}", timeout=5).json()
        except ValueError:
            course = []
        try:
            content = requests.get(API_LINK+f"content/{course_id}", timeout=5).json()
        except ValueError:
            content = []

        context = super().get_context_data(**kwargs)
        context['course'] = course
        context['content'] = content
        return context
