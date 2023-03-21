package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.CourseContentDto
import ca.uvic.dimspace.dto.CourseContentPreviewDto
import ca.uvic.dimspace.dto.mapping.toDto
import ca.uvic.dimspace.dto.mapping.toPreviewDto
import ca.uvic.dimspace.service.CourseContentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

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

	@PostMapping("/{courseId}/{contentId}/view")
	fun viewCourseContent(@PathVariable courseId: Int, @PathVariable contentId: Int) {
		contentService.viewContent(courseId, contentId)
	}

	@GetMapping("/recent")
	fun getRecentItems(): List<CourseContentPreviewDto> {
		return contentService.getRecentItems().take(5).map { it.toPreviewDto() }
	}

}
