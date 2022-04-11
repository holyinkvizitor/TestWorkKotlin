 package com.example.Test.service.Impl

import com.example.Test.Dto.UserDto
import com.example.Test.model.User
import com.example.Test.repository.Repository
import com.example.Test.service.UserService
import org.springframework.stereotype.Service

 @Service
class UserServiceImpl(
     private val repository: Repository
) : UserService{
    override fun getAll(): List<UserDto> {
       return repository.findAll().map{
            it.toDto()
        }
    }
     private fun User.toDto():UserDto =
         UserDto(
             id=this.id,
             name = this.name,
             surname = this.surname,
             patronymic = this.patronymic,
             mail = this.mail,
             number = this.number,
         )
     private fun UserDto.fromDto():User =
         User(
             id=0,
             name = this.name,
             surname = this.surname,
             patronymic = this.patronymic,
             mail = this.mail,
             number = this.number,
         )

    override fun put(userDto: UserDto) : Int {
      return  repository.save(userDto.fromDto()).id
    }
}
