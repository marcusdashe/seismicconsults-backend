package com.seismicconsulting.tvet.course

import com.seismicconsulting.tvet.enums.const
import org.springframework.data.jpa.repository.JpaRepository

interface CourseRepository: JpaRepository<Course, Long>  {

    // For example, let's create a function to find courses by their accreditation status
    fun findByIsAccredited(isAccredited: Boolean): List<Course>

    // Find courses by their course level
    fun findByCourseLevel(courseLevel: const.Course_level): List<Course>

    // Find courses by their course name (case-insensitive search)
    fun findByCourseNameIgnoreCase(courseName: String): List<Course>

    // Find courses by their duration (greater than or equal to the given duration)
    fun findByCourseDurationGreaterThanEqual(duration: Int): List<Course>

    // Find courses by their duration within a given range
    fun findByCourseDurationBetween(minDuration: Int, maxDuration: Int): List<Course>

    // Find courses by their learning outcome (case-insensitive search)
    fun findByLearningOutcomeContainingIgnoreCase(keyword: String): List<Course>

    // Find courses by their accreditation status and course level
    fun findByIsAccreditedAndCourseLevel(isAccredited: Boolean, courseLevel: const.Course_level): List<Course>

    // Find courses by their accreditation status and course duration within a given range
    fun findByIsAccreditedAndCourseDurationBetween(isAccredited: Boolean, minDuration: Int, maxDuration: Int): List<Course>

    // Find courses by their accreditation status and learning outcome (case-insensitive search)
    fun findByIsAccreditedAndLearningOutcomeContainingIgnoreCase(isAccredited: Boolean, keyword: String): List<Course>

    // Find courses by their course level and course duration (greater than or equal to the given duration)
    fun findByCourseLevelAndCourseDurationGreaterThanEqual(courseLevel: const.Course_level, duration: Int): List<Course>

    // Find courses by their course level and learning outcome (case-insensitive search)
    fun findByCourseLevelAndLearningOutcomeContainingIgnoreCase(courseLevel: const.Course_level, keyword: String): List<Course>

    // Find courses by their course name and course level
    fun findByCourseNameIgnoreCaseAndCourseLevel(courseName: String, courseLevel: const.Course_level): List<Course>

    // Find courses by their course name and accreditation status
    fun findByCourseNameIgnoreCaseAndIsAccredited(courseName: String, isAccredited: Boolean): List<Course>

    // Find courses by their course name and course duration within a given range
    fun findByCourseNameIgnoreCaseAndCourseDurationBetween(courseName: String, minDuration: Int, maxDuration: Int): List<Course>

    // Find courses by their course name and learning outcome (case-insensitive search)
    fun findByCourseNameIgnoreCaseAndLearningOutcomeContainingIgnoreCase(courseName: String, keyword: String): List<Course>

    // Find courses by their course name, course level, and accreditation status
    fun findByCourseNameIgnoreCaseAndCourseLevelAndIsAccredited(courseName: String, courseLevel: const.Course_level, isAccredited: Boolean): List<Course>

    // Find courses by their course name, course level, and course duration (greater than or equal to the given duration)
    fun findByCourseNameIgnoreCaseAndCourseLevelAndCourseDurationGreaterThanEqual(courseName: String, courseLevel: const.Course_level, duration: Int): List<Course>

    // Find courses by their course name, course level, and learning outcome (case-insensitive search)
    fun findByCourseNameIgnoreCaseAndCourseLevelAndLearningOutcomeContainingIgnoreCase(courseName: String, courseLevel: const.Course_level, keyword: String): List<Course>

    // Find courses by their course name, accreditation status, and course duration within a given range
    fun findByCourseNameIgnoreCaseAndIsAccreditedAndCourseDurationBetween(courseName: String, isAccredited: Boolean, minDuration: Int, maxDuration: Int): List<Course>

    // Find courses by their course name, accreditation status, and learning outcome (case-insensitive search)
    fun findByCourseNameIgnoreCaseAndIsAccreditedAndLearningOutcomeContainingIgnoreCase(courseName: String, isAccredited: Boolean, keyword: String): List<Course>

    // Find courses by their course name, course duration within a given range, and learning outcome (case-insensitive search)
    fun findByCourseNameIgnoreCaseAndCourseDurationBetweenAndLearningOutcomeContainingIgnoreCase(courseName: String, minDuration: Int, maxDuration: Int, keyword: String): List<Course>

    // Find courses by their course name, course level, accreditation status, and course duration within a given range
    fun findByCourseNameIgnoreCaseAndCourseLevelAndIsAccreditedAndCourseDurationBetween(courseName: String, courseLevel: const.Course_level, isAccredited: Boolean, minDuration: Int, maxDuration: Int)

}