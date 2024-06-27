plugins {
	id("base-conventions")
//	id("net.kyori.indra")
//	id("net.kyori.indra.publishing")
//	id("net.kyori.indra.git")
//	id("io.github.goooler.shadow")
	id("java-library")
}

val libs = extensions.getByType(org.gradle.accessors.dm.LibrariesForLibs::class)

java {
	withSourcesJar()
	withJavadocJar()
}

tasks {

}