package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.service.CourseService
import org.springframework.stereotype.Service

@Service
class CourseServiceImpl : CourseService {

	override fun getCourses(): List<Course> {
		return listOf(Course(1, "SENG 371", "Software Evolution", "Shuja Mughal"))
	}

	override fun getCourse(id: Int): Course? {
		TODO("Not yet implemented")
	}

}
