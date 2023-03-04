import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(Plugins.JVM) version Versions.KT apply false
    kotlin(Plugins.SPRING_ALIAS) version Versions.KT apply false
    id(Plugins.SPRING_BOOT) version Versions.SPRING_BOOT apply false
    id(Plugins.KT_LINT) version Versions.KT_LINT apply false
    id(Plugins.SONAR) version Versions.SONAR
}

sonarqube {
    properties {
        property("sonar.projectKey", "HogwartsSchoolOfMagic_DiscordLeoBot")
        property("sonar.organization", "hogwarts-school-of-magic")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

allprojects {
    group = Common.PROJECT_GROUP
    version = Common.PROJECT_VERSION

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf(Common.JSR305)
            jvmTarget = Common.JDK_VERSION
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin(Plugins.KT)
        plugin(Plugins.SPRING)
        plugin(Plugins.SPRING_DEPS)
        plugin(Plugins.KT_LINT)
    }
    // Optionally configure plugin
    configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
        debug.set(true)
    }
}