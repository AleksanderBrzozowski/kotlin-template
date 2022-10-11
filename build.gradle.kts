plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jmailen.kotlinter") version "3.12.0"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

group = "pl.brzozowski"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("ch.qos.logback:logback-core:1.4.3")
    implementation("ch.qos.logback:logback-classic:1.4.3")
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.23")

    testImplementation(platform("io.kotest:kotest-bom:5.5.0"))

    testImplementation("io.kotest:kotest-runner-junit5")
}

tasks.test {
    useJUnitPlatform()
}
