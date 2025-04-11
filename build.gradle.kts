plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "com.github.azimsh3r.breakpointtrackeride"
version = "1.0-SNAPSHOT"

application {
    mainClass = "com.github.azimsh3r.cli.StdLibSuggesterCLIKt"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("com.github.ajalt.clikt:clikt:5.0.3")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
