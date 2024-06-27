pluginManagement {
	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven("https://repo.stellardrift.ca/repository/snapshots/")
		maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
		maven("https://repo.mizule.dev/testing") // remove
		maven("https://repo.jpenilla.xyz/snapshots")
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "commandapi-parent"

sequenceOf(
	"platforms",
	"kotlin",
	"core",
	"annotations",
	"preprocessor",
	"codecov",
).forEach {
	include("commandapi-$it")
//	project(":commandapi-$it").projectDir = file(it)
}