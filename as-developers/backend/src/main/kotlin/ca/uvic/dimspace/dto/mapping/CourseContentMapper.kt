package ca.uvic.dimspace.dto.mapping

import ca.uvic.dimspace.dto.CourseContentDto
import ca.uvic.dimspace.model.CourseContent

fun CourseContent.toDto(): CourseContentDto {
	return CourseContentDto(
		id, author, message
	)
}
