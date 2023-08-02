package com.seismicconsulting.tvet.trainingprovider

import com.seismicconsulting.tvet.trainingprovider.payload.ProviderRequest
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api-v1/providers")
class ProviderRestApi(private val providerService: ProviderService) {

    @PostMapping("/create")
    fun createProvider(@RequestBody @Valid providerRequest: ProviderRequest): ResponseEntity<out Any> {
        return try {
            val responseProvider = providerService.createProvider(providerRequest)
            ResponseEntity.ok(responseProvider)
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @GetMapping("/{providerId}")
    fun getProviderById(@PathVariable providerId: Long): ResponseEntity<out Any> {
        return try {
            val provider = providerService.getProviderById(providerId)
            if (provider != null) {
                ResponseEntity.ok(provider)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @PutMapping("/{providerId}")
    fun updateProvider(@PathVariable providerId: Long, @RequestBody @Valid updatedProvider: ProviderRequest): ResponseEntity<out Any> {
        return try {
            val provider = providerService.updateProvider(providerId, updatedProvider)
            if (provider != null) {
                ResponseEntity.ok(provider)
            } else {
                ResponseEntity.notFound().build()
            }
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }

    @DeleteMapping("/{providerId}")
    fun deleteProviderById(@PathVariable providerId: Long): ResponseEntity<out Any> {
        return try {
            providerService.deleteProviderById(providerId)
            ResponseEntity.noContent().build()
        } catch (e: Exception) {
            ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.message)
        }
    }


}