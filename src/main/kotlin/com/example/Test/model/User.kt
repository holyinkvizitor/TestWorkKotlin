package com.example.Test.model
import javax.persistence.*
import com.fasterxml.jackson.annotation.*
@Entity
@Table(name = "User")
data class User (

        @JsonProperty("name")
        @Column(name = "name")
        val name: String = "",

        @JsonProperty("surname")
        @Column(name = "surname")
        val surname: String = "",

        @JsonProperty("patronymic")
        @Column(name = "patronymic")
        val patronymic: String = "",

        @JsonProperty("mail")
        @Column(name = "mail")
        val mail: String = "",

        @JsonProperty("number")
        @Column(name = "number")
        val number: Long = 0L,

        @Id
        @JsonProperty("id")
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0
)
