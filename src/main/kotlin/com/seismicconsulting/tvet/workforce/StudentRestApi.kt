package com.seismicconsulting.tvet.workforce

import com.seismicconsulting.tvet.workforce.payload.StudentRequest
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api-v1/students")
class StudentRestApi(private val studentService: StudentService) {

    @PostMapping("/create")
    fun createStudent(@RequestBody @Valid studentRequest: StudentRequest): ResponseEntity<out Any> {
        return try {
            val responseStudent = studentService.createStudent(studentRequest)
            ResponseEntity.ok(responseStudent)
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @GetMapping("/{studentId}")
    fun getStudentById(@PathVariable studentId: Long): ResponseEntity<out Any> {
        return try {
            val student = studentService.getStudentById(studentId)
            if (student != null) {
                ResponseEntity.ok(student)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @PutMapping("/{studentId}")
    fun updateStudent(@PathVariable studentId: Long, @RequestBody @Valid updatedStudent: StudentRequest): ResponseEntity<out Any> {
        return try {
            val student = studentService.updateStudent(studentId, updatedStudent)
            if (student != null) {
                ResponseEntity.ok(student)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @DeleteMapping("/{studentId}")
    fun deleteStudentById(@PathVariable studentId: Long): ResponseEntity<out Any> {
        return try {
            studentService.deleteStudentById(studentId)
            ResponseEntity.noContent().build()
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }
}