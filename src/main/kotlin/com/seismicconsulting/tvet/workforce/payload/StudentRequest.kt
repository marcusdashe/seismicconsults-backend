package com.seismicconsulting.tvet.workforce.payload

data class StudentRequest(
    var studentFirstName: String = "",
    var studentSurname: String = "",
    var studentGender: String = "",
    var studentEmail: String = "",
    var studentPhoneNumber: String = "",
    var studentAddress: String = "",
)
