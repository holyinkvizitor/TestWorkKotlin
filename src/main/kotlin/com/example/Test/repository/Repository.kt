package com.example.Test.repository
import com.example.Test.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface Repository: CrudRepository<User, Int> {
}