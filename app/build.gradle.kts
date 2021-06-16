plugins {
    java
    kotlin("jvm")
    idea
    `java-library`
}

dependencies {
    api(project(":api"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}
