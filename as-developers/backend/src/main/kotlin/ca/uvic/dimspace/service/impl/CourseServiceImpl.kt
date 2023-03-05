package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.service.CourseService
import org.springframework.stereotype.Service

@Service
class CourseServiceImpl : CourseService {

	val sampleCourse = Course(1, "EE 120", "Intro to Electrical Engineering", "Franz Kafka")

	override fun getCourses(): List<Course> {
		return listOf(sampleCourse)
	}

	override fun getCourse(id: Int): Course? {
		return sampleCourse
	}

}
