package com.example.Test.model.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket


@Configuration
class SwaggerConfig {
    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.Test.controller"))
            .paths(PathSelectors.any())
            .build()
            .groupName("Swagger")
            .apiInfo(apiInfo())
    }
    private fun apiInfo(): ApiInfo? {
        return ApiInfoBuilder()
            .title("test")
            .description("Test")
            .version("1.0.0")
            .license("vvv")
            .build()
    }
}