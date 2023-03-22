package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.CourseGradesDto
import ca.uvic.dimspace.dto.GradeDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradeController {

	@GetMapping
	fun getGrades(): CourseGradesDto {
		return CourseGradesDto(
			courseName = "EE 120",
			courseId = 1,
			grades = listOf(
				GradeDto(
					"Assignment 1",
					22.5,
					25.0
				),
				GradeDto(
					"Assignment 2",
					24.0,
					25.0,
				),
				GradeDto(
					"Assignment 3",
					null,
					25.0,
				),
				GradeDto(
					"Assignment 4",
					null,
					25.0,
				),
				GradeDto(
					"Midterm",
					48.5,
					50.0,
				),
				GradeDto(
					"Quiz 1",
					5.0,
					5.0,
				),
				GradeDto(
					"Quiz 2",
					null,
					5.0
				),
			)
		)
	}

}
