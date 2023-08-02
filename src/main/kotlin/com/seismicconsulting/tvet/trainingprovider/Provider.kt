                package com.seismicconsulting.tvet.trainingprovider

                import com.seismicconsulting.tvet.course.Course
                import com.seismicconsulting.tvet.enums.const
                import com.seismicconsulting.tvet.workforce.Student
                import jakarta.persistence.*
                import jakarta.validation.constraints.Email
                import jakarta.validation.constraints.NotBlank
                import jakarta.validation.constraints.Size
                import java.time.LocalDateTime

                @Entity
                @Table(name = "training_provider")
                class Provider {

                    @Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    var id: Long? = null

                    @NotBlank
                    @Size(max=50, min=3, message="Training Provider Name should be in-between 3 to 50 characters")
                    @Column(name="training_provider_name")
                    var trainingProviderName: String? = null

                    @Size(max=80, min=5, message="Training Provider Address should be in-betweeen 5 to 80 characters  ")
                    @Column(name="training_provider_address")
                    var trainingProviderAddress: String? = null

                    @Email(message = "Please provide a valid email")
                    @Column(name = "email", unique = true)
                    var trainingProviderEmail: String = ""

                    @Column(name = "phone_number", unique = true)
                    var trainingProviderPhoneNumber: String? = null

                    @Column(name = "is_accredited", unique = true)
                    var isAccredited: Boolean = false

                    @Column(name = "website_link", unique = true)
                    var trainingProviderWebsite: String? = null

                    @Column(name="training_center_type")
                    @Enumerated(EnumType.STRING)
                    var trainingCenterType: const.Technical_Institute_Type = const.Technical_Institute_Type.OTHERS

                    @Column(name="created_date")
                    @Temporal(TemporalType.TIMESTAMP)
                    var created: LocalDateTime = LocalDateTime.now()

                    @OneToMany(mappedBy = "provider", cascade = [CascadeType.ALL], orphanRemoval = true)
                    var courses: MutableSet<Course> = mutableSetOf()
                }