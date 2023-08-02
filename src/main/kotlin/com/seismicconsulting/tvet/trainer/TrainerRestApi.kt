package com.seismicconsulting.tvet.trainer

import com.seismicconsulting.tvet.trainer.payload.TrainerRequest
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api-v1/trainers")
class TrainerRestApi(private val trainerService: TrainerService) {

    @PostMapping("/create")
    fun createTrainer(@RequestBody @Valid trainerRequest: TrainerRequest): ResponseEntity<out Any> {
        return try {
            val responseTrainer = trainerService.createTrainer(trainerRequest)
            ResponseEntity.ok(responseTrainer)
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @GetMapping("/{trainerId}")
    fun getTrainerById(@PathVariable trainerId: Long): ResponseEntity<out Any> {
        return try {
            val trainer = trainerService.getTrainerById(trainerId)
            if (trainer != null) {
                ResponseEntity.ok(trainer)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @PutMapping("/{trainerId}")
    fun updateTrainer(@PathVariable trainerId: Long, @RequestBody @Valid updatedTrainer: TrainerRequest): ResponseEntity<out Any> {
        return try {
            val trainer = trainerService.updateTrainer(trainerId, updatedTrainer)
            if (trainer != null) {
                ResponseEntity.ok(trainer)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @DeleteMapping("/{trainerId}")
    fun deleteTrainerById(@PathVariable trainerId: Long): ResponseEntity<out Any> {
        return try {
            trainerService.deleteTrainerById(trainerId)
            ResponseEntity.noContent().build()
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }
}