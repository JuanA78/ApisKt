package com.example.demoT.service

import com.example.demoT.model.User
import com.example.demoT.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun findAll(): List<User> = userRepository.findAll()

    fun findById(id: String): User? = userRepository.findById(id).orElse(null)

    fun save(user: User): User = userRepository.save(user)

    fun deleteById(id: String) = userRepository.deleteById(id)
}
