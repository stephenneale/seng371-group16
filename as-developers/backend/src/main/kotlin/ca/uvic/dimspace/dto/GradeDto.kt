package ca.uvic.dimspace.dto

data class GradeDto(
	val itemName: String,
	val markNumerator: Double?,
	val markDenominator: Double,
	val percentage: Double?,
	val comment: String?,
)
