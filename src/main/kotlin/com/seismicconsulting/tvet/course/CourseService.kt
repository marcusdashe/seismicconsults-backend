package com.seismicconsulting.tvet.course

import com.seismicconsulting.tvet.course.payload.CourseRequest
import org.springframework.stereotype.Service

@Service
class CourseService(private val courseRepository: CourseRepository) {

    fun createCourse(course: CourseRequest): Course {
        course.let{
            val newCourse = Course().apply{
                courseName = it.courseName
                courseDescription = it.courseDescription
                courseDuration = it.courseDuration
                learningOutcome = it.learningOutcome
            }
            return courseRepository.save(newCourse)
        }
    }

    fun getCourseById(courseId: Long): Course? {
        return courseRepository.findById(courseId).orElse(null)
    }

    fun getAllCourses(): List<Course>?{
        return courseRepository.findAll()
    }

    fun updateCourse(courseId: Long, updatedCourse: CourseRequest): Course? {
        val existingCourse = courseRepository.findById(courseId).orElse(null)
        return when (existingCourse) {
            null -> null
            else -> {
                // Update the fields of the existing course with the new values
                existingCourse.courseName = updatedCourse.courseName
                existingCourse.courseDescription = updatedCourse.courseDescription
                existingCourse.courseDuration = updatedCourse.courseDuration
                existingCourse.learningOutcome = updatedCourse.learningOutcome
                // Save the updated course
                courseRepository.save(existingCourse)
                existingCourse
            }
        }
    }

    fun deleteCourseById(courseId: Long) {
        courseRepository.deleteById(courseId)
    }

}