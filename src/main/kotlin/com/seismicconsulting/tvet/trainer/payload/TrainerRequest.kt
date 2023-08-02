package com.seismicconsulting.tvet.trainer.payload

data class TrainerRequest(
    var trainerName: String = "",
    var trainerEmail: String = "",
    var trainerYearsOfExperience: Int = 0,
    var trainerPhoneNumber: String = "",
    var trainerAddress: String = "",
)
