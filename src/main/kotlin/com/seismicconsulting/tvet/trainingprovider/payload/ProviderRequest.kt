package com.seismicconsulting.tvet.trainingprovider.payload

data class ProviderRequest(
    var trainingProviderName: String = "",
    var trainingProviderEmail: String = "",
    var trainingProviderPhoneNumber: String = "",
    var trainingProviderAddress: String = "",
    var trainingProviderWebsite: String = "",
)
