/**
 * Константы с названиями групп библиотек.
 */
object Groups {
    // Spring
    const val SPRING_BOOT = "org.springframework.boot"

    // Базы данных
    const val POSTGRES = "org.postgresql"
    const val LIQUIBASE = "org.liquibase"

    // Reactor
    const val NETTY = "io.netty"

    // Discord
    const val KORD = "dev.kord"

    // Сериализация
    const val JACKSON = "com.fasterxml.jackson.module"

    // Kotlin
    private const val JET_BRAINS = "org.jetbrains"
    const val KTX = "$JET_BRAINS.kotlinx"
    const val KT = "$JET_BRAINS.kotlin"
    const val REACTOR_KT = "io.projectreactor.kotlin"
}

/**
 * Константы с названиями артефактов библиотек.
 */
object Artifacts {
    // Spring
    const val SPRING_BOOT = "spring-boot"
    const val SPRING_BOOT_STARTER = "${SPRING_BOOT}-starter"
    const val SPRING_BOOT_DATA_R2DBC = "${SPRING_BOOT}-starter-data-r2dbc"
    const val SPRING_BOOT_STARTER_WEBFLUX = "${SPRING_BOOT}-starter-webflux"

    // Базы данных
    const val POSTGRES = "postgresql"
    const val LIQUIBASE = "liquibase-core"
    const val PG_R2DBC = "r2dbc-postgresql"

    // Reactor
    const val NETTY_CODEC = "netty-codec-http"

    // Discord
    const val KORD_CORE = "kord-core"

    // Kotlin
    const val KTX_REACTOR = "kotlinx-coroutines-reactor"
    const val JACKSON_KT = "jackson-module-kotlin"
    const val REACTOR_KT_EXT = "reactor-kotlin-extensions"
    const val KT_REFLECT = "kotlin-reflect"
}

/**
 * Константы с версиями библиотек.
 */
object Versions {
    // Spring
    const val SPRING_BOOT = "3.3.1"

    // Базы данных
    const val PG_R2DBC = "1.0.5.RELEASE"

    // Reactor
    const val NETTY_CODEC = "4.1.111.Final"

    // Discord
    const val KORD_CORE = "0.14.0"

    // Kotlin
    const val KT = "1.9.22"
    const val KT_LINT = "12.1.1"

    // Sonar
    const val SONAR = "5.0.0.4638"
}

/**
 * Константы с полным именем подключаемой библиотеки.
 */
object Libs {
    // Spring
    const val SPRING_BOOT = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT}"
    const val SPRING_BOOT_STARTER = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_STARTER}"
    const val SPRING_BOOT_DATA_R2DBC = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_DATA_R2DBC}"
    const val SPRING_BOOT_STARTER_WEBFLUX = "${Groups.SPRING_BOOT}:${Artifacts.SPRING_BOOT_STARTER_WEBFLUX}"

    // Базы данных
    const val PG_R2DBC = "${Groups.POSTGRES}:${Artifacts.PG_R2DBC}:${Versions.PG_R2DBC}"
    const val POSTGRES = "${Groups.POSTGRES}:${Artifacts.POSTGRES}"
    const val LIQUIBASE = "${Groups.LIQUIBASE}:${Artifacts.LIQUIBASE}"

    // Discord
    const val KORD_CORE = "${Groups.KORD}:${Artifacts.KORD_CORE}:${Versions.KORD_CORE}"

    // Reactor
    const val NETTY_CODEC = "${Groups.NETTY}:${Artifacts.NETTY_CODEC}:${Versions.NETTY_CODEC}"

    // Kotlin
    const val KOTLINX_REACTOR = "${Groups.KTX}:${Artifacts.KTX_REACTOR}"
    const val JACKSON_KT = "${Groups.JACKSON}:${Artifacts.JACKSON_KT}"
    const val REACTOR_KT_EXT = "${Groups.REACTOR_KT}:${Artifacts.REACTOR_KT_EXT}"
    const val KT_REFLECT = "${Groups.KT}:${Artifacts.KT_REFLECT}"
}

/**
 * Константы с названиями плагинов.
 */
object Plugins {
    // Spring
    const val SPRING_ALIAS = "plugin.spring"
    const val SPRING = "${Groups.KT}.${SPRING_ALIAS}"
    const val SPRING_BOOT = Groups.SPRING_BOOT
    const val SPRING_DEPS = "io.spring.dependency-management"

    // Kotlin
    const val JVM = "jvm"
    const val KT = "kotlin"
    const val KT_LINT = "org.jlleitschuh.gradle.ktlint"

    // Sonar
    const val SONAR = "org.sonarqube"
}

/**
 * Остальные полезные константы.
 */
object Common {
    const val PROJECT_GROUP = "io.github.hogwartsschoolofmagic"
    const val PROJECT_VERSION = "0.0.1-SNAPSHOT"
    const val JDK_VERSION = "21"
    const val JSR305 = "-Xjsr305=strict"
}
