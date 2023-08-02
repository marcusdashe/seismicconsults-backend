package com.seismicconsulting.tvet.course

import com.seismicconsulting.tvet.course.payload.CourseRequest
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@Controller
@RequestMapping("/api-v1/courses")
class CourseRestApi(private val courseService: CourseService) {


    @PostMapping("/create")
    fun createCourse(@RequestBody @Valid courseRequest: CourseRequest): ResponseEntity<out Any> {
        return try {
            val responseCourse = courseService.createCourse(courseRequest)
            ResponseEntity.ok(responseCourse)
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @GetMapping("/{courseId}")
    fun getCourseById(@PathVariable courseId: Long): ResponseEntity<out Any> {
        return try {
            val course = courseService.getCourseById(courseId)
            if (course != null) {
                ResponseEntity.ok(course)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @GetMapping("/all")
    fun getAllCourse(): ResponseEntity<List<Course>>{
        return ResponseEntity.ok().body(courseService.getAllCourses())
    }

    @PutMapping("/{courseId}")
    fun updateCourse(@PathVariable courseId: Long, @RequestBody @Valid updatedCourse: CourseRequest): ResponseEntity<out Any> {
        return try {
            val course = courseService.updateCourse(courseId, updatedCourse)
            if (course != null) {
                ResponseEntity.ok(course)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @DeleteMapping("/{courseId}")
    fun deleteCourseById(@PathVariable courseId: Long): ResponseEntity<out Any> {
        return try {
            courseService.deleteCourseById(courseId)
            ResponseEntity.noContent().build()
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

}