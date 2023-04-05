package ca.uvic.dimspace.controller

import ca.uvic.dimspace.dto.DarkModeDto
import ca.uvic.dimspace.service.DarkModeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/darkmode")
class DarkModeController(
	@Autowired
	private val darkModeService: DarkModeService,
) {

	@GetMapping
	fun getDarkMode(): DarkModeDto {
		return DarkModeDto(
			darkModeService.getDarkModeState()
		)
	}

	@PostMapping
	fun setDarkMode(@RequestBody setting: DarkModeDto) {
		darkModeService.setDarkModeState(setting.enabled)
	}

}
