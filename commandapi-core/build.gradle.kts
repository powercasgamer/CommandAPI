plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    compileOnly(libs.com.mojang.brigadier)
    compileOnly(libs.com.mojang.authlib)
    compileOnly(libs.org.apache.logging.log4j.log4j.api)
    providedCompile(project(":commandapi-preprocessor"))
}

description = "commandapi-core"

java {
    withJavadocJar()
}
