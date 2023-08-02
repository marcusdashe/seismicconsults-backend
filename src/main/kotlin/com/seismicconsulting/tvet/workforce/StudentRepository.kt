package com.seismicconsulting.tvet.workforce


import com.seismicconsulting.tvet.enums.const
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Long> {

    // Find students by their education level
    fun findByStudentEducationLevel(studentEducationLevel: const.Qualification): List<Student>

    // Find students by their gender
    fun findByStudentGender(studentGender: const.Gender): List<Student>

    // Find students by their fluent language
    fun findByStudentFluentLanguage(studentFluentLanguage: const.Language): List<Student>

    // Find students by their email (case-insensitive search)
    fun findByStudentEmailIgnoreCase(studentEmail: String): List<Student>

    // Find students by their phone number
    fun findByStudentPhoneNumber(studentPhoneNumber: String): List<Student>

    // Find students by their address (case-insensitive search)
    fun findByStudentAddressIgnoreCase(studentAddress: String): List<Student>

    // Find students by their education level and gender
    fun findByStudentEducationLevelAndStudentGender(
        studentEducationLevel: const.Qualification,
        studentGender: const.Gender
    ): List<Student>

    // Find students by their education level and fluent language
    fun findByStudentEducationLevelAndStudentFluentLanguage(
        studentEducationLevel: const.Qualification,
        studentFluentLanguage: const.Language
    ): List<Student>

    // Find students by their education level and email (case-insensitive search)
    fun findByStudentEducationLevelAndStudentEmailIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentEmail: String
    ): List<Student>

    // Find students by their education level and phone number
    fun findByStudentEducationLevelAndStudentPhoneNumber(
        studentEducationLevel: const.Qualification,
        studentPhoneNumber: String
    ): List<Student>

    // Find students by their education level and address (case-insensitive search)
    fun findByStudentEducationLevelAndStudentAddressIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentAddress: String
    ): List<Student>

    // Find students by their gender and fluent language
    fun findByStudentGenderAndStudentFluentLanguage(
        studentGender: const.Gender,
        studentFluentLanguage: const.Language
    ): List<Student>

    // Find students by their gender and email (case-insensitive search)
    fun findByStudentGenderAndStudentEmailIgnoreCase(studentGender: const.Gender, studentEmail: String): List<Student>

    // Find students by their gender and phone number
    fun findByStudentGenderAndStudentPhoneNumber(studentGender: const.Gender, studentPhoneNumber: String): List<Student>

    // Find students by their gender and address (case-insensitive search)
    fun findByStudentGenderAndStudentAddressIgnoreCase(
        studentGender: const.Gender,
        studentAddress: String
    ): List<Student>

    // Find students by their fluent language and email (case-insensitive search)
    fun findByStudentFluentLanguageAndStudentEmailIgnoreCase(
        studentFluentLanguage: const.Language,
        studentEmail: String
    ): List<Student>

    // Find students by their fluent language and phone number
    fun findByStudentFluentLanguageAndStudentPhoneNumber(
        studentFluentLanguage: const.Language,
        studentPhoneNumber: String
    ): List<Student>

    // Find students by their fluent language and address (case-insensitive search)
    fun findByStudentFluentLanguageAndStudentAddressIgnoreCase(
        studentFluentLanguage: const.Language,
        studentAddress: String
    ): List<Student>

    // Find students by their education level, gender, and fluent language
    fun findByStudentEducationLevelAndStudentGenderAndStudentFluentLanguage(
        studentEducationLevel: const.Qualification,
        studentGender: const.Gender,
        studentFluentLanguage: const.Language
    ): List<Student>

    // Find students by their education level, gender, and email (case-insensitive search)
    fun findByStudentEducationLevelAndStudentGenderAndStudentEmailIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentGender: const.Gender,
        studentEmail: String
    ): List<Student>

    // Find students by their education level, gender, and phone number
    fun findByStudentEducationLevelAndStudentGenderAndStudentPhoneNumber(
        studentEducationLevel: const.Qualification,
        studentGender: const.Gender,
        studentPhoneNumber: String
    ): List<Student>

    // Find students by their education level, gender, and address (case-insensitive search)
    fun findByStudentEducationLevelAndStudentGenderAndStudentAddressIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentGender: const.Gender,
        studentAddress: String
    ): List<Student>

    // Find students by their education level, fluent language, and email (case-insensitive search)
    fun findByStudentEducationLevelAndStudentFluentLanguageAndStudentEmailIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentFluentLanguage: const.Language,
        studentEmail: String
    ): List<Student>

    // Find students by their education level, fluent language, and phone number
    fun findByStudentEducationLevelAndStudentFluentLanguageAndStudentPhoneNumber(
        studentEducationLevel: const.Qualification,
        studentFluentLanguage: const.Language,
        studentPhoneNumber: String
    ): List<Student>

    // Find students by their education level, fluent language, and address (case-insensitive search)
    fun findByStudentEducationLevelAndStudentFluentLanguageAndStudentAddressIgnoreCase(
        studentEducationLevel: const.Qualification,
        studentFluentLanguage: const.Language,
        studentAddress: String
    ): List<Student>

}
