package com.example.demoT.repository

import com.example.demoT.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String>
