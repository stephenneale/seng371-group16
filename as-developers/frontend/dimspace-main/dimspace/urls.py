"""dimspace URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from dimapp.views import Home, CourseHome, CourseLectures, CourseAssignments, CourseLabs, Grades

urlpatterns = [
    path('admin/', admin.site.urls),
    path('dimspace/', Home.as_view()),
    path('dimspace/course/<int:course_id>/', CourseHome.as_view()),
    path('dimspace/course/<int:course_id>/lectures/', CourseLectures.as_view()),
    path('dimspace/course/<int:course_id>/assignments/', CourseAssignments.as_view()),
    path('dimspace/course/<int:course_id>/labs/', CourseLabs.as_view()),
    path('dimspace/grades/', Grades.as_view())
]
