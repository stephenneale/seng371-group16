from django.test import TestCase, Client

class ViewsTestCase(TestCase):
    """Test cases for view classes"""
    client = None

    def setUp(self):
        self.client = Client()

    def test_home(self):
        """Tests GET and template for home view page"""
        response = self.client.get("/dimspace/", follow=True)
        self.assertTemplateUsed(response, "home.html")
        self.assertEqual(response.status_code, 200)

    def test_course_home(self):
        """Tests GET and template for course home view page"""
        response = self.client.get("/dimspace/course/1", follow=True)
        self.assertTemplateUsed(response, "coursehome.html")
        self.assertEqual(response.status_code, 200)

    def test_course_lectures(self):
        """Tests GET and template for course lectures view page"""
        response = self.client.get("/dimspace/course/1/lectures", follow=True)
        self.assertTemplateUsed(response, "courselectures.html")
        self.assertEqual(response.status_code, 200)

    def test_course_assignments(self):
        """Tests GET and template for course assignments view page"""
        response = self.client.get("/dimspace/course/1/assignments", follow=True)
        self.assertTemplateUsed(response, "courseassignments.html")
        self.assertEqual(response.status_code, 200)

    def test_course_labs(self):
        """Tests GET and template for course labs view page"""
        response = self.client.get("/dimspace/course/1/labs", follow=True)
        self.assertTemplateUsed(response, "courselabs.html")
        self.assertEqual(response.status_code, 200)
