package com.seismicconsulting.tvet.trainer

import com.seismicconsulting.tvet.course.Course
import com.seismicconsulting.tvet.trainer.payload.TrainerRequest
import org.springframework.stereotype.Service

@Service
class TrainerService(private val trainerRepository: TrainerRepository) {
    fun createTrainer(trainer: TrainerRequest): Trainer {

        trainer.let{
            val newTrainer = Trainer().apply{
                trainerName = it.trainerName
                trainerEmail = it.trainerEmail
                trainerYearsOfExperience = it.trainerYearsOfExperience
                trainerPhoneNumber = it.trainerPhoneNumber
                trainerAddress = it.trainerAddress
            }

            return trainerRepository.save(newTrainer)
        }
    }

    fun getTrainerById(trainerId: Long): Trainer? {
        return trainerRepository.findById(trainerId).orElse(null)
    }

    fun updateTrainer(trainerId: Long, updatedTrainer: TrainerRequest): Trainer? {
        val existingTrainer = trainerRepository.findById(trainerId).orElse(null)
        if (existingTrainer != null) {
            // Update the fields of the existing trainer with the new values
            existingTrainer.trainerName = updatedTrainer.trainerName
            existingTrainer.trainerYearsOfExperience = updatedTrainer.trainerYearsOfExperience
            existingTrainer.trainerEmail = updatedTrainer.trainerEmail
            existingTrainer.trainerPhoneNumber = updatedTrainer.trainerPhoneNumber
            existingTrainer.trainerAddress = updatedTrainer.trainerAddress

            // Save the updated trainer
            return trainerRepository.save(existingTrainer)
        }
        return null
    }

    fun deleteTrainerById(trainerId: Long) {
        trainerRepository.deleteById(trainerId)
    }

}