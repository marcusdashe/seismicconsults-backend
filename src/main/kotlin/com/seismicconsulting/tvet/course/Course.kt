package com.seismicconsulting.tvet.course

import com.seismicconsulting.tvet.enums.const
import com.seismicconsulting.tvet.trainer.Trainer
import com.seismicconsulting.tvet.trainingprovider.Provider
import com.seismicconsulting.tvet.workforce.Student
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import java.time.LocalDateTime


@Entity
@Table(name = "course")
class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotBlank
    @Size(max=50, min=3, message="Course Name should be in-between 3 to 50 characters")
    @Column(name="course_name")
    var courseName: String? = null

    @Size(max=80, min=5, message="Course Description should be in-betweeen 5 to 80 characters  ")
    @Column(name="course_description")
    var courseDescription: String? = null

// Course Duration in Hour
    @Column(name="course_duration")
    var courseDuration: Int? = null

    @Column(name="course_level")
    @Enumerated(EnumType.STRING)
    var courseLevel: const.Course_level = const.Course_level.BEGINNER

    @Column(name="learning_outcome")
    var learningOutcome: String? = null

    @Column(name = "is_accredited", unique = true)
    var isAccredited: Boolean = false

    @Column(name="created_date")
    @Temporal(TemporalType.TIMESTAMP)
    var created: LocalDateTime = LocalDateTime.now()

    // One-to-Many relationship with TrainerModel
    @OneToMany(mappedBy = "course", cascade = [CascadeType.ALL], orphanRemoval = true)
    var trainers: MutableSet<Trainer> = mutableSetOf()

    // One-to-Many relationship with Student
    @OneToMany(mappedBy = "trainingCourse", cascade = [CascadeType.ALL], orphanRemoval = true)
    var students: MutableSet<Student> = mutableSetOf()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    var provider: Provider? = null

}