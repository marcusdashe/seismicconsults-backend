package com.seismicconsulting.tvet.trainer

import com.seismicconsulting.tvet.course.Course
import com.seismicconsulting.tvet.enums.const
import jakarta.persistence.*
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime


@Entity
@Table(name = "trainer")
class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotBlank
    @Size(max=50, min=3, message="Trainer Name should be in-between 3 to 50 characters")
    @Column(name="trainer_name")
    var trainerName: String? = null

    @Column(name="trainer_qualification")
    @Enumerated(EnumType.STRING)
    var trainerQualification: const.Qualification = const.Qualification.OLEVEL

    @Column(name="years_of_experience")
    var trainerYearsOfExperience: Int? = null

    @Column(name="trainer_specialization")
    @Enumerated(EnumType.STRING)
    var trainerSpecialization: const.Specialization = const.Specialization.UNKNOWN

    @Column(name="language_fluent_in")
    @Enumerated(EnumType.STRING)
    var trainerFluentLanguage: const.Language = const.Language.NONE

    @Email(message = "Please provide a valid email")
    @Column(name = "email", unique = true)
    var trainerEmail: String = ""

    @Column(name = "phone_number", unique = true)
    var trainerPhoneNumber: String = ""

    @Size(max=80, min=5, message="Training Provider Address should be in-betweeen 5 to 80 characters  ")
    @Column(name="trainer_address")
    var trainerAddress: String? = null

    @Column(name="created_date")
    @Temporal(TemporalType.TIMESTAMP)
    var created: LocalDateTime = LocalDateTime.now()

    // Many-to-One relationship with CourseModel
    @ManyToOne
    @JoinColumn(name = "course_id")
    var course: Course? = null
}