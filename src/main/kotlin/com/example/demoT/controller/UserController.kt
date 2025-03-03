package com.example.demoT.controller

import com.example.demoT.model.User
import com.example.demoT.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> = userService.findAll()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: String): ResponseEntity<User> {
        val user = userService.findById(id)
        return if (user != null) ResponseEntity.ok(user) else ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> {
        val savedUser = userService.save(user)
        return ResponseEntity.ok(savedUser)
    }

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: String, @RequestBody user: User): ResponseEntity<User> {
        val existingUser = userService.findById(id)
        return if (existingUser != null) {
            val updatedUser = userService.save(user.copy(id = id))  
            ResponseEntity.ok(updatedUser)
        } else {
            ResponseEntity.notFound().build()
        }
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<Void> {
        return if (userService.findById(id) != null) {
            userService.deleteById(id)
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
