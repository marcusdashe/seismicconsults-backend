package com.seismicconsulting.tvet.course.payload

import jakarta.validation.constraints.NotBlank

data class CourseRequest(
    @NotBlank
    var courseName: String = "",
    var courseDescription: String = "",
    var courseDuration: Int = 0,
    var learningOutcome: String = "",
)
