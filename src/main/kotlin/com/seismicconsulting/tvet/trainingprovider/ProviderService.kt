package com.seismicconsulting.tvet.trainingprovider

import com.seismicconsulting.tvet.trainer.Trainer
import com.seismicconsulting.tvet.trainingprovider.payload.ProviderRequest
import org.springframework.stereotype.Service

@Service
class ProviderService(private val providerRepository: ProviderRepository) {

    fun createProvider(provider: ProviderRequest): Provider {

        provider.let{
            val newProvider = Provider().apply{
                trainingProviderName = it.trainingProviderName
                trainingProviderEmail = it.trainingProviderEmail
                trainingProviderPhoneNumber = it.trainingProviderPhoneNumber
                trainingProviderAddress = it.trainingProviderAddress
                trainingProviderWebsite = it.trainingProviderWebsite
            }
            return providerRepository.save(newProvider)
        }
    }

    fun getProviderById(providerId: Long): Provider? {
        return providerRepository.findById(providerId).orElse(null)
    }

    fun updateProvider(providerId: Long, updatedProvider: ProviderRequest): Provider? {
        val existingProvider = providerRepository.findById(providerId).orElse(null)
        if (existingProvider != null) {
            // Update the fields of the existing provider with the new values
            existingProvider.trainingProviderName = updatedProvider.trainingProviderName
            existingProvider.trainingProviderAddress = updatedProvider.trainingProviderAddress
            existingProvider.trainingProviderEmail = updatedProvider.trainingProviderEmail
            existingProvider.trainingProviderPhoneNumber = updatedProvider.trainingProviderPhoneNumber
            existingProvider.trainingProviderWebsite = updatedProvider.trainingProviderWebsite

            // Save the updated provider
            return providerRepository.save(existingProvider)
        }
        return null
    }

    fun deleteProviderById(providerId: Long) {
        providerRepository.deleteById(providerId)
    }
}