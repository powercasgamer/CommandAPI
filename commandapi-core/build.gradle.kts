dependencies {
    compileOnly(libs.com.mojang.brigadier)
    compileOnly(libs.com.mojang.authlib)
    compileOnly(libs.org.apache.logging.log4j.log4j.api)
	compileOnly(project(":commandapi-preprocessor"))
}

description = "commandapi-core"

java {
    withJavadocJar()
}
