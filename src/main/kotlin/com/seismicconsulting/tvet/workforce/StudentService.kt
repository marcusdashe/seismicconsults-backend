package com.seismicconsulting.tvet.workforce

import com.seismicconsulting.tvet.enums.const
import com.seismicconsulting.tvet.trainingprovider.Provider
import com.seismicconsulting.tvet.workforce.payload.StudentRequest
import org.springframework.stereotype.Service

@Service
class StudentService(private val studentRepository: StudentRepository) {

    fun createStudent(student: StudentRequest): Student {
        student.let{
            val newStudent = Student().apply {
                studentFirstName = it.studentFirstName
                studentSurname = it.studentSurname
                studentGender =  const.Gender.valueOf(it.studentGender)
                studentEmail = it.studentEmail
                studentPhoneNumber = it.studentPhoneNumber
                studentAddress = it.studentAddress
            }

            return studentRepository.save(newStudent)
        }
    }

    fun getStudentById(studentId: Long): Student? {
        return studentRepository.findById(studentId).orElse(null)
    }

    fun updateStudent(studentId: Long, updatedStudent: StudentRequest): Student? {
        val existingStudent = studentRepository.findById(studentId).orElse(null)
        if (existingStudent != null) {
            // Update the fields of the existing student with the new values
            existingStudent.studentFirstName = updatedStudent.studentFirstName
            existingStudent.studentSurname = updatedStudent.studentSurname
            existingStudent.studentGender = const.Gender.valueOf(updatedStudent.studentGender)
            existingStudent.studentEmail = updatedStudent.studentEmail
            existingStudent.studentPhoneNumber = updatedStudent.studentPhoneNumber
            existingStudent.studentAddress = updatedStudent.studentAddress

            // Save the updated student
            return studentRepository.save(existingStudent)
        }
        return null
    }

    fun deleteStudentById(studentId: Long) {
        studentRepository.deleteById(studentId)
    }
}