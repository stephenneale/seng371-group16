package ca.uvic.dimspace.dto

data class CourseGradesDto (
	val courseId: Int,
	val courseName: String,
	val grades: List<GradeDto>,
)
