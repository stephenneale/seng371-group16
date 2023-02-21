package ca.uvic.dimspace.service

import ca.uvic.dimspace.model.Course
import org.springframework.stereotype.Service

@Service
class CourseService {

	fun getCourses(): List<Course> {
		return listOf(Course(1, "SENG 371", "Software Evolution", "Shuja Mughal"))
	}

	fun getCourse(id: Int): Course? {
		TODO("Not yet implemented")
	}

}
