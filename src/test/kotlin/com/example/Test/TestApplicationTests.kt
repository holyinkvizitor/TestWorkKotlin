package com.example.Test

import com.example.Test.Dto.UserDto
import com.example.Test.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.postForObject

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PricingServiceTest(@Autowired(required = true) val client: TestRestTemplate) {


    @Test
    fun testGet() {
        val entity = client.getForEntity<String>("/")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
    }

    @Test
    fun testPost() {
        val user: UserDto = UserDto(
            name = "testName",
            surname = "testSurname",
            patronymic = "testPatronymic",
            mail = "test@mail.ru",
            number = 89354766543L,
        )
        val id = client.postForObject<Int>("/", user)
        assertThat(id).isNotNull()
    }

}
