package ru.vood.githubdowload

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties
class GithubDownloadApplication

fun main(args: Array<String>) {
    runApplication<GithubDownloadApplication>(*args)
}
