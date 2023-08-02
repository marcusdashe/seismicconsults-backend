package com.seismicconsulting.tvet.enums

object const {

    enum class Course_level{
        BEGINNER,
        INTERMEDIATE,
        ADVANCE,
    }

    enum class Qualification {
                             PSLC,
        OLEVEL,
        NCE,
        ND,
        HND,
        DEGREE,
        MASTER_DEGREE,
        PHD
    }

    enum class Specialization {
        PAINTING,
        TILING,
        ELECTRICAL,
        PLUMBING,
        AC_REPAIRS,
        MASON,
        UNKNOWN
    }

    enum class Language {
        ENGLISH,
        HAUSA,
        YORUBA,
        IGBO,
        FRENCH,
        NONE
    }

    enum class Gender {
        MALE,
        FEMALE,
        ANONYMOUS
    }

    enum class Technical_Institute_Type{
        FEDERAL_GOVERNMENT,
        STATE_GOVERNMENT,
        PRIVATE,
        OTHERS
    }



}