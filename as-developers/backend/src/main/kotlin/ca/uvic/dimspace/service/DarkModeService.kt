package ca.uvic.dimspace.service

interface DarkModeService {
	fun getDarkModeState(): Boolean
	fun setDarkModeState(to: Boolean)
}
