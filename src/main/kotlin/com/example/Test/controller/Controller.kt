package com.example.Test.controller

import com.example.Test.Dto.UserDto
import com.example.Test.service.UserService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
@Api(description = "Контроллер")
class Controller(
   private val userService: UserService) {
    @GetMapping
    @ApiOperation("Получения списком всех пользователей")
    fun getAll():List<UserDto> = userService.getAll()

    @PostMapping
    @ApiOperation("Добавление пользователя")
    fun post(@RequestBody userDto: UserDto) :Int = userService.put(userDto)



}