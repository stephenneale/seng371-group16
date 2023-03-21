package ca.uvic.dimspace.service

import ca.uvic.dimspace.model.CourseContent

interface CourseContentService {
	fun getContentForCourse(id: Int): List<CourseContent>
	fun viewContent(courseId: Int, contentId: Int)
	fun getRecentItems(): List<CourseContent>
}
