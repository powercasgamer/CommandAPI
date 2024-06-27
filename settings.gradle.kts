pluginManagement {
	includeBuild("gradle/build-logic")
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
	project(":commandapi-$it").projectDir = file(it)
}