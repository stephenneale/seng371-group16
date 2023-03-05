package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.model.Course
import ca.uvic.dimspace.model.CourseContent
import ca.uvic.dimspace.service.CourseContentService
import org.springframework.stereotype.Service

@Service
class CourseContentServiceImpl : CourseContentService {

	val sampleCourseContent = listOf(
		CourseContent(
			courseId = 1,
			id = 1,
			author = "Prof. Kafka",
			message = "Welcome to EE 120! I'm thrilled to be your instructor this semester, and I can't wait to dive into the exciting and ever-evolving world of electrical systems and circuits.",
		),
		CourseContent(
			courseId = 1,
			id = 2,
			author = "Prof. Kafka",
			message = "As we begin the semester, please make sure to review the syllabus carefully and note the upcoming deadlines and exams. Our first assignment will be due on Sep 23, so be sure to start early and ask for help if you need it.",
		),
		CourseContent(
			courseId = 1,
			id = 3,
			author = "Prof. Kafka",
			message = "If you ever feel stuck or unsure about a particular topic, please don't hesitate to reach out to me or to your classmates for help. We'll be using online discussion forums and office hours to provide additional support and answer your questions.",
		),
		CourseContent(
			courseId = 1,
			id = 4,
			author = "Prof. Kafka",
			message = "In the coming weeks, we'll be covering topics such as AC and DC circuits, Boolean algebra and logic gates, and Fourier analysis. These are fundamental concepts that you'll encounter throughout your career in Electrical Engineering, so it's important to develop a strong foundation now.",
		),
	)

	override fun getContentForCourse(id: Int): List<CourseContent> {
		return sampleCourseContent
	}

}
