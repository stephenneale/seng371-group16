package ca.uvic.dimspace.controller.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class ExceptionHandler {

	@ExceptionHandler(CourseNotFoundException::class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	fun handleCourseNotFoundException(exception: CourseNotFoundException) {

	}

}
