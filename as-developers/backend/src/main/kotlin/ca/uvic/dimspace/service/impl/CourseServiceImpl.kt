package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.dto.CourseDetailDto
import ca.uvic.dimspace.dto.mapping.toDetailDto
import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.service.CourseService
import org.springframework.stereotype.Service

@Service
class CourseServiceImpl : CourseService {

	private val sampleCourse = Course(1, "EE 120", "Intro to Electrical Engineering", "Franz Kafka")

	private val courses = mutableListOf(sampleCourse)

	override fun getCourses(): List<Course> {
		return courses.toList()
	}

	override fun getCourse(id: Int): Course? {
		return courses.find { it.id == id }
	}

	override fun addCourse(code: String, name: String, instructor: String): CourseDetailDto {
		val newId = courses.size + 1
		val newCourse = Course(newId, code, name, instructor)
		courses.add(newCourse)

		return getCourse(newId)!!.toDetailDto()
	}


}
