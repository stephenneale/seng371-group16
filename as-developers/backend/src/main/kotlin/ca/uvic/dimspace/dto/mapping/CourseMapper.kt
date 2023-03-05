package ca.uvic.dimspace.dto.mapping

import ca.uvic.dimspace.dto.CourseDetailDto
import ca.uvic.dimspace.dto.CourseSummaryDto
import ca.uvic.dimspace.model.Course

fun Course.toSummaryDto(): CourseSummaryDto {
	return CourseSummaryDto(
		id = this.id,
		code = this.code,
	)
}

fun Course.toDetailDto(): CourseDetailDto {
	return CourseDetailDto(
		id = this.id,
		code = this.code,
		name = this.name,
		instructor = this.instructor,
	)
}
