package ru.vood.githubdowload.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate


@Configuration
class RestTemplateConfiguration {

    @Bean
    fun restTemplate(b: RestTemplateBuilder): RestTemplate {
        return b.build()
    }
}