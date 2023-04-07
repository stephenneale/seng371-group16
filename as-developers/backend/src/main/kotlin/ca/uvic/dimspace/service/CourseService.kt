package ca.uvic.dimspace.service

import ca.uvic.dimspace.dto.CourseDetailDto
import ca.uvic.dimspace.model.Course

interface CourseService {
	fun getCourses(): List<Course>
	fun getCourse(id: Int): Course?
	fun addCourse(code: String, name: String, instructor: String): CourseDetailDto
}
