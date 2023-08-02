package com.seismicconsulting.tvet.trainer

import com.seismicconsulting.tvet.course.Course
import com.seismicconsulting.tvet.enums.const
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TrainerRepository : JpaRepository<Trainer, Long> {

    // Find trainers by their qualification
    fun findByTrainerQualification(trainerQualification: const.Qualification): List<Trainer>

    // Find trainers by their specialization
    fun findByTrainerSpecialization(trainerSpecialization: const.Specialization): List<Trainer>

    // Find trainers by their years of experience (greater than or equal to the given experience)
    fun findByTrainerYearsOfExperienceGreaterThanEqual(yearsOfExperience: Int): List<Trainer>

    // Find trainers by their fluent language
    fun findByTrainerFluentLanguage(trainerFluentLanguage: const.Language): List<Trainer>

    // Find trainers by their email (case-insensitive search)
    fun findByTrainerEmailIgnoreCase(trainerEmail: String): List<Trainer>

    // Find trainers by their phone number
    fun findByTrainerPhoneNumber(trainerPhoneNumber: String): List<Trainer>

    // Find trainers by their address (case-insensitive search)
    fun findByTrainerAddressIgnoreCase(trainerAddress: String): List<Trainer>

    // Find trainers by their qualification and specialization
    fun findByTrainerQualificationAndTrainerSpecialization(
        trainerQualification: const.Qualification,
        trainerSpecialization: const.Specialization
    ): List<Trainer>

    // Find trainers by their qualification and years of experience (greater than or equal to the given experience)
    fun findByTrainerQualificationAndTrainerYearsOfExperienceGreaterThanEqual(
        trainerQualification: const.Qualification,
        yearsOfExperience: Int
    ): List<Trainer>

    // Find trainers by their qualification and fluent language
    fun findByTrainerQualificationAndTrainerFluentLanguage(
        trainerQualification: const.Qualification,
        trainerFluentLanguage: const.Language
    ): List<Trainer>

    // Find trainers by their qualification and email (case-insensitive search)
    fun findByTrainerQualificationAndTrainerEmailIgnoreCase(
        trainerQualification: const.Qualification,
        trainerEmail: String
    ): List<Trainer>

    // Find trainers by their qualification and phone number
    fun findByTrainerQualificationAndTrainerPhoneNumber(
        trainerQualification: const.Qualification,
        trainerPhoneNumber: String
    ): List<Trainer>

    // Find trainers by their qualification and address (case-insensitive search)
    fun findByTrainerQualificationAndTrainerAddressIgnoreCase(
        trainerQualification: const.Qualification,
        trainerAddress: String
    ): List<Trainer>

    // Find trainers by their specialization and years of experience (greater than or equal to the given experience)
    fun findByTrainerSpecializationAndTrainerYearsOfExperienceGreaterThanEqual(
        trainerSpecialization: const.Specialization,
        yearsOfExperience: Int
    ): List<Trainer>

    // Find trainers by their specialization and fluent language
    fun findByTrainerSpecializationAndTrainerFluentLanguage(
        trainerSpecialization: const.Specialization,
        trainerFluentLanguage: const.Language
    ): List<Trainer>

    // Find trainers by their specialization and email (case-insensitive search)
    fun findByTrainerSpecializationAndTrainerEmailIgnoreCase(
        trainerSpecialization: const.Specialization,
        trainerEmail: String
    ): List<Trainer>

    // Find trainers by their specialization and phone number
    fun findByTrainerSpecializationAndTrainerPhoneNumber(
        trainerSpecialization: const.Specialization,
        trainerPhoneNumber: String
    ): List<Trainer>

    // Find trainers by their specialization and address (case-insensitive search)
    fun findByTrainerSpecializationAndTrainerAddressIgnoreCase(
        trainerSpecialization: const.Specialization,
        trainerAddress: String
    ): List<Trainer>

    // Find trainers by their years of experience and fluent language
    fun findByTrainerYearsOfExperienceAndTrainerFluentLanguage(
        yearsOfExperience: Int,
        trainerFluentLanguage: const.Language
    ): List<Trainer>

    // Find trainers by their years of experience and email (case-insensitive search)
    fun findByTrainerYearsOfExperienceAndTrainerEmailIgnoreCase(
        yearsOfExperience: Int,
        trainerEmail: String
    ): List<Trainer>

    // Find trainers by their years of experience and phone number
    fun findByTrainerYearsOfExperienceAndTrainerPhoneNumber(
        yearsOfExperience: Int,
        trainerPhoneNumber: String
    ): List<Trainer>

    // Find trainers by their years of experience and address (case-insensitive search)
    fun findByTrainerYearsOfExperienceAndTrainerAddressIgnoreCase(
        yearsOfExperience: Int,
        trainerAddress: String
    ): List<Trainer>

    // Find trainers by their fluent language and email (case-insensitive search)
    fun findByTrainerFluentLanguageAndTrainerEmailIgnoreCase(
        trainerFluentLanguage: const.Language,
        trainerEmail: String
    ): List<Trainer>

    // Find trainers by their fluent language and phone number
    fun findByTrainerFluentLanguageAndTrainerPhoneNumber(
        trainerFluentLanguage: const.Language,
        trainerPhoneNumber: String
    ): List<Trainer>

    // Find trainers by their fluent language and address (case-insensitive search)
    fun findByTrainerFluentLanguageAndTrainerAddressIgnoreCase(
        trainerFluentLanguage: const.Language,
        trainerAddress: String
    ): List<Trainer>

    // Find trainers by their qualification, specialization, and years of experience (greater than or equal to the given experience)
    fun findByTrainerQualificationAndTrainerSpecializationAndTrainerYearsOfExperienceGreaterThanEqual(
        trainerQualification: const.Qualification,
        trainerSpecialization: const.Specialization,
        yearsOfExperience: Int
    ): List<Trainer>

    // Find trainers by their qualification, specialization, and fluent language
    fun findByTrainerQualificationAndTrainerSpecializationAndTrainerFluentLanguage(
        trainerQualification: const.Qualification,
        trainerSpecialization: const.Specialization,
        trainerFluentLanguage: const.Language
    ): List<Trainer>

    // Find trainers by their qualification, specialization, and email (case-insensitive search)
    fun findByTrainerQualificationAndTrainerSpecializationAndTrainerEmailIgnoreCase(
        trainerQualification: const.Qualification,
        trainerSpecialization: const.Specialization,
        trainerEmail: String
    )
}