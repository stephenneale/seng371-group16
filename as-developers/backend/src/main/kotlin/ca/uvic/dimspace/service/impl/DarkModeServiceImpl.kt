package ca.uvic.dimspace.service.impl

import ca.uvic.dimspace.service.DarkModeService
import org.springframework.stereotype.Service

@Service
class DarkModeServiceImpl: DarkModeService {

	var currentSetting = false

	override fun getDarkModeState(): Boolean {
		return currentSetting
	}

	override fun setDarkModeState(to: Boolean) {
		currentSetting = to
	}
}
