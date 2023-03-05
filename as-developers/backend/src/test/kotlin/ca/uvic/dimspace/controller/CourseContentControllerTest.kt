package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.mapping.toDto
import ca.uvic.dimspace.model.CourseContent
import ca.uvic.dimspace.service.CourseContentService
import com.fasterxml.jackson.databind.ObjectMapper
import com.ninjasquad.springmockk.MockkBean
import io.mockk.every
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest
@ContextConfiguration(classes = [CourseContentController::class])
class CourseContentControllerTest(
	@Autowired
	val mvc: MockMvc,
	@Autowired
	val objectMapper: ObjectMapper,
) {

	@MockkBean
	lateinit var courseContentService: CourseContentService

	lateinit var sampleCourseContent1: CourseContent

	@BeforeEach
	fun setup() {
		sampleCourseContent1 = CourseContent(
			courseId = 1,
			id = 1,
			author = "Lin Cai",
			message = "Midterm 2 will not be quite so simple!",
		)
	}

	@Test
	fun getContentForCourse() {
		every { courseContentService.getContentForCourse(1) } returns listOf(sampleCourseContent1)
		val expectedValue = objectMapper.writeValueAsString(listOf(sampleCourseContent1.toDto()))

		mvc.perform(get("/content/1"))
			.andExpect(status().isOk)
			.andExpect(content().json(expectedValue))
	}

}
