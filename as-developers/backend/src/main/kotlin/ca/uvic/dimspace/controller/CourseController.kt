package ca.uvic.dimspace.controller

import ca.uvic.dimspace.controller.exception.CourseNotFoundException
import ca.uvic.dimspace.dto.CourseDetailDto
import ca.uvic.dimspace.dto.CourseSummaryDto
import ca.uvic.dimspace.dto.NewCourseDto
import ca.uvic.dimspace.dto.mapping.toDetailDto
import ca.uvic.dimspace.dto.mapping.toSummaryDto
import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.service.CourseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/courses")
@RestController
class CourseController(
	private val courseService: CourseService,
) {

	@GetMapping("")
	fun getCourses(): List<CourseSummaryDto> {
		return courseService.getCourses().map { it.toSummaryDto() }
	}

	@GetMapping("/{id}")
	fun getCourseInfo(@PathVariable id: Int): CourseDetailDto {
		val detailDto = courseService.getCourse(id)?.toDetailDto()

		return detailDto ?: throw CourseNotFoundException()
	}

	@PostMapping("")
	fun addCourse(@RequestBody course: NewCourseDto): CourseDetailDto {
		return courseService.addCourse(course.code, course.name, course.instructor)
	}

}
