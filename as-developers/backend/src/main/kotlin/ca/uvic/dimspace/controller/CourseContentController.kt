package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.CourseContentDto
import ca.uvic.dimspace.dto.mapping.toDto
import ca.uvic.dimspace.service.CourseContentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/content")
class CourseContentController(
	@Autowired
	private val contentService: CourseContentService,
) {

	@GetMapping("/{courseId}")
	fun getCourseContent(@PathVariable courseId: Int): List<CourseContentDto> {
		return contentService.getContentForCourse(1).map { it.toDto() }
	}

}
