package com.seismicconsulting.tvet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TvetApplication

fun main(args: Array<String>) {
	runApplication<TvetApplication>(*args)
}
