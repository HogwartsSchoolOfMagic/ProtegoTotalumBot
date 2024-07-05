plugins {
    id(Plugins.SPRING_BOOT)
}

tasks.findByName("bootJar")?.apply {
    enabled = false
}

dependencies {
    // Зависимости, используемые при запуске приложения.
    // Spring.
    runtimeOnly(Libs.SPRING_BOOT_STARTER)

    // Базы данных.
    runtimeOnly(Libs.POSTGRES)
    runtimeOnly(Libs.LIQUIBASE)
    runtimeOnly(Libs.PG_R2DBC) {
        exclude(group = Groups.NETTY, module = Artifacts.NETTY_CODEC)
    }
    runtimeOnly(Libs.NETTY_CODEC)

    // Зависимости, используемые при компиляции приложения.
    // База данных.
    implementation(Libs.SPRING_BOOT_DATA_R2DBC)

    // Kotlin.
    implementation(Libs.KOTLINX_REACTOR)

    // Проектные модули.
    implementation(project(":pt-common"))
}
