package io.github.hogwartsschoolofmagic

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Клас для запуска Discord бота.
 */
@SpringBootApplication
class LeoBotApp

fun main() {
    runApplication<LeoBotApp> {
        // Исправление ошибки "NativePRNGNonBlocking is not found, fallback to SHA1PRNG".
        System.setProperty("io.ktor.random.secure.random.provider", "DRBG")

        // Удаление при старте из логов баннер Spring Boot приложения.
        setBannerMode(Banner.Mode.OFF)
    }
}
