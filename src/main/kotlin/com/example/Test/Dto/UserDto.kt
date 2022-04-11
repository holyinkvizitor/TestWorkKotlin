package com.example.Test.Dto

data class UserDto (
    val name: String ,
    val surname: String,
    val patronymic: String,
    val mail: String ,
    val number: Long,
    val id: Int?=null,
)
