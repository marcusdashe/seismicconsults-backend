package com.seismicconsulting.tvet.workforce

import com.seismicconsulting.tvet.course.Course
import com.seismicconsulting.tvet.enums.const
import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime


@Entity
@Table(name = "student")
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotBlank
    @Size(max=50, min=3, message="Student first name should be in-between 3 to 50 characters")
    @Column(name="student_first_name")
    var studentFirstName: String? = null

    @NotBlank
    @Size(max=50, min=3, message="Student last name should be in-between 3 to 50 characters")
    @Column(name="student_surename")
    var studentSurname: String? = null

    @Column(name="education_level")
    @Enumerated(EnumType.STRING)
    var studentEducationLevel: const.Qualification = const.Qualification.OLEVEL

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    var studentGender: const.Gender = const.Gender.ANONYMOUS

    @Column(name="language_fluent_in")
    @Enumerated(EnumType.STRING)
    var studentFluentLanguage: const.Language = const.Language.NONE

    @Email(message = "Please provide a valid email")
    @Column(name = "email", unique = true)
    var studentEmail: String? = null

    @Column(name = "phone_number", unique = true)
    var studentPhoneNumber: String? = null

    @Size(max=80, min=5, message="Student Address should be in-betweeen 5 to 80 characters  ")
    @Column(name="student_address")
    var studentAddress: String? = null

    @Column(name="created_date")
    @Temporal(TemporalType.TIMESTAMP)
    var created: LocalDateTime = LocalDateTime.now()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "training_course_id")
    var trainingCourse: Course? = null
}