package ca.uvic.dimspace.dto.mapping

import ca.uvic.dimspace.dto.CourseContentDto
import ca.uvic.dimspace.dto.CourseContentPreviewDto
import ca.uvic.dimspace.model.CourseContent

fun CourseContent.toDto(): CourseContentDto {
	return CourseContentDto(
		id, author, message
	)
}

fun CourseContent.toPreviewDto(): CourseContentPreviewDto {
	return CourseContentPreviewDto(
		courseId,
		id,
		messagePreview = if ( message.length > 33) {
			message.substring(0, 30).plus("...")
		} else message
	)
}
