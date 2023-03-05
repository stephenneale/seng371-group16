package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.mapping.toDetailDto
import ca.uvic.dimspace.dto.mapping.toSummaryDto
import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.service.CourseService
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
@ContextConfiguration(classes = [CourseController::class])
class CourseControllerTest(
	@Autowired
	val mvc: MockMvc,
	@Autowired
	val objectMapper: ObjectMapper,
) {

	@MockkBean
	lateinit var courseService: CourseService

	lateinit var sampleCourse: Course

	@BeforeEach
	fun setup() {
		sampleCourse = Course(
			1,"ECE 360", "Control Systems", "Michael Adams"
		)
	}

	@Test
	fun getCoursesEmptyList() {
		every { courseService.getCourses() } returns emptyList()

		mvc.perform(get("/courses"))
			.andExpect(status().isOk)

	}

	@Test
	fun getCourses() {
		every { courseService.getCourses() } returns listOf(sampleCourse)
		val expectedValue = objectMapper.writeValueAsString(listOf(sampleCourse.toSummaryDto()))

		mvc.perform(get("/courses"))
			.andExpect(status().isOk)
			.andExpect(content().json(expectedValue))
	}

	@Test
	fun getSingleCourse() {
		every { courseService.getCourse(1) } returns sampleCourse
		val expectedValue = objectMapper.writeValueAsString(sampleCourse.toDetailDto())

		mvc.perform(get("/courses/1"))
			.andExpect(status().isOk)
			.andExpect(content().json(expectedValue))
	}

}
