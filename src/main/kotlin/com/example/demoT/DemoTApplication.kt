package com.example.demoT

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoTemplate

@SpringBootApplication
class DemoTApplication {

}

fun main(args: Array<String>) {
    runApplication<DemoTApplication>(*args)
}
