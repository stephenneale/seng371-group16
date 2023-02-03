package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.HelloWorldDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

	@GetMapping("/hello/{name}")
	fun helloWorld(@PathVariable("name") name: String?): HelloWorldDto {
		return HelloWorldDto(message = "Hello, ${name ?: "world"}!")
	}

	@GetMapping("/hello")
	fun helloWorldNoName(): HelloWorldDto {
		return helloWorld(null)
	}

}
