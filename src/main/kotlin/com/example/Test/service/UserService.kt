package com.example.Test.service

import com.example.Test.Dto.UserDto


interface UserService {
    fun  getAll():List<UserDto>
    fun put(userDto: UserDto):Int
}