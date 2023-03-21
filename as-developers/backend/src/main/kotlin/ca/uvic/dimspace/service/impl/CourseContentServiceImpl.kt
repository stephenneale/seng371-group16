package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.model.CourseContent
import ca.uvic.dimspace.service.CourseContentService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CourseContentServiceImpl : CourseContentService {

	val sampleCourseContent = listOf(
		CourseContent(
			courseId = 1,
			id = 5,
			author = "Prof. Kafka",
			message = "Here's your first assignment for the class. It's due Sept 23."
		),
		CourseContent(
			courseId = 1,
			id = 4,
			author = "Prof. Kafka",
			message = "In the coming weeks, we'll be covering topics such as AC and DC circuits, Boolean algebra and logic gates, and Fourier analysis. These are fundamental concepts that you'll encounter throughout your career in Electrical Engineering, so it's important to develop a strong foundation now.",
		),
		CourseContent(
			courseId = 1,
			id = 3,
			author = "Prof. Kafka",
			message = "If you ever feel stuck or unsure about a particular topic, please don't hesitate to reach out to me or to your classmates for help. We'll be using online discussion forums and office hours to provide additional support and answer your questions.",
		),
		CourseContent(
			courseId = 1,
			id = 2,
			author = "Prof. Kafka",
			message = "As we begin the semester, please make sure to review the syllabus carefully and note the upcoming deadlines and exams. Our first assignment will be due on Sep 23, so be sure to start early and ask for help if you need it.",
		),
		CourseContent(
			courseId = 1,
			id = 1,
			author = "Prof. Kafka",
			message = "Welcome to EE 120! I'm thrilled to be your instructor this semester, and I can't wait to dive into the exciting and ever-evolving world of electrical systems and circuits.",
		),
	)

	var recentItems = ArrayList<RecentItemIndex>()

	override fun viewContent(courseId: Int, contentId: Int) {
		val index = recentItems.indexOfFirst { it.courseId == courseId && it.contentId == contentId }

		if (index == -1) {
			recentItems.add(0, RecentItemIndex(courseId, contentId))
		} else {
			recentItems.add(0, recentItems.removeAt(index))
		}
	}

	override fun getRecentItems(): List<CourseContent> {
		return recentItems.stream()
			.map { index -> sampleCourseContent.first { it.courseId == index.courseId && it.id == index.contentId } }
			.toList()
	}

	override fun getContentForCourse(id: Int): List<CourseContent> {
		return sampleCourseContent
	}

}

data class RecentItemIndex(val courseId: Int, val contentId: Int)
