package com.seismicconsulting.tvet.trainingprovider

import com.seismicconsulting.tvet.course.Course
import com.seismicconsulting.tvet.enums.const
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProviderRepository : JpaRepository<Provider, Long> {

    // Find providers by their accreditation status
    fun findByIsAccredited(isAccredited: Boolean): List<Provider>

    // Find providers by their training center type
    fun findByTrainingCenterType(trainingCenterType: const.Technical_Institute_Type): List<Provider>

    // Find providers by their website link
    fun findByTrainingProviderWebsite(trainingProviderWebsite: String): List<Provider>

    // Find providers by their email (case-insensitive search)
    fun findByTrainingProviderEmailIgnoreCase(trainingProviderEmail: String): List<Provider>

    // Find providers by their phone number
    fun findByTrainingProviderPhoneNumber(trainingProviderPhoneNumber: String): List<Provider>

    // Find providers by their address (case-insensitive search)
    fun findByTrainingProviderAddressIgnoreCase(trainingProviderAddress: String): List<Provider>

    // Find providers by their training center type and accreditation status
    fun findByTrainingCenterTypeAndIsAccredited(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean
    ): List<Provider>

    // Find providers by their training center type and website link
    fun findByTrainingCenterTypeAndTrainingProviderWebsite(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderWebsite: String
    ): List<Provider>

    // Find providers by their training center type and email (case-insensitive search)
    fun findByTrainingCenterTypeAndTrainingProviderEmailIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their training center type and phone number
    fun findByTrainingCenterTypeAndTrainingProviderPhoneNumber(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their training center type and address (case-insensitive search)
    fun findByTrainingCenterTypeAndTrainingProviderAddressIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their accreditation status and website link
    fun findByIsAccreditedAndTrainingProviderWebsite(
        isAccredited: Boolean,
        trainingProviderWebsite: String
    ): List<Provider>

    // Find providers by their accreditation status and email (case-insensitive search)
    fun findByIsAccreditedAndTrainingProviderEmailIgnoreCase(
        isAccredited: Boolean,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their accreditation status and phone number
    fun findByIsAccreditedAndTrainingProviderPhoneNumber(
        isAccredited: Boolean,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their accreditation status and address (case-insensitive search)
    fun findByIsAccreditedAndTrainingProviderAddressIgnoreCase(
        isAccredited: Boolean,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their website link and email (case-insensitive search)
    fun findByTrainingProviderWebsiteAndTrainingProviderEmailIgnoreCase(
        trainingProviderWebsite: String,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their website link and phone number
    fun findByTrainingProviderWebsiteAndTrainingProviderPhoneNumber(
        trainingProviderWebsite: String,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their website link and address (case-insensitive search)
    fun findByTrainingProviderWebsiteAndTrainingProviderAddressIgnoreCase(
        trainingProviderWebsite: String,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their training center type, accreditation status, and website link
    fun findByTrainingCenterTypeAndIsAccreditedAndTrainingProviderWebsite(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean,
        trainingProviderWebsite: String
    ): List<Provider>

    // Find providers by their training center type, accreditation status, and email (case-insensitive search)
    fun findByTrainingCenterTypeAndIsAccreditedAndTrainingProviderEmailIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their training center type, accreditation status, and phone number
    fun findByTrainingCenterTypeAndIsAccreditedAndTrainingProviderPhoneNumber(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their training center type, accreditation status, and address (case-insensitive search)
    fun findByTrainingCenterTypeAndIsAccreditedAndTrainingProviderAddressIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their training center type, website link, and email (case-insensitive search)
    fun findByTrainingCenterTypeAndTrainingProviderWebsiteAndTrainingProviderEmailIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderWebsite: String,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their training center type, website link, and phone number
    fun findByTrainingCenterTypeAndTrainingProviderWebsiteAndTrainingProviderPhoneNumber(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderWebsite: String,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their training center type, website link, and address (case-insensitive search)
    fun findByTrainingCenterTypeAndTrainingProviderWebsiteAndTrainingProviderAddressIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        trainingProviderWebsite: String,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their accreditation status, website link, and email (case-insensitive search)
    fun findByIsAccreditedAndTrainingProviderWebsiteAndTrainingProviderEmailIgnoreCase(
        isAccredited: Boolean,
        trainingProviderWebsite: String,
        trainingProviderEmail: String
    ): List<Provider>

    // Find providers by their accreditation status, website link, and phone number
    fun findByIsAccreditedAndTrainingProviderWebsiteAndTrainingProviderPhoneNumber(
        isAccredited: Boolean,
        trainingProviderWebsite: String,
        trainingProviderPhoneNumber: String
    ): List<Provider>

    // Find providers by their accreditation status, website link, and address (case-insensitive search)
    fun findByIsAccreditedAndTrainingProviderWebsiteAndTrainingProviderAddressIgnoreCase(
        isAccredited: Boolean,
        trainingProviderWebsite: String,
        trainingProviderAddress: String
    ): List<Provider>

    // Find providers by their training center type, accreditation status, website link, and email (case-insensitive search)
    fun findByTrainingCenterTypeAndIsAccreditedAndTrainingProviderWebsiteAndTrainingProviderEmailIgnoreCase(
        trainingCenterType: const.Technical_Institute_Type,
        isAccredited: Boolean,
        trainingProviderWebsite: String,
        trainingProviderEmail: String
    ): List<Provider>

}