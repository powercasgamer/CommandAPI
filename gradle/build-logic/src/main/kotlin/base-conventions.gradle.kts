
plugins {
//	id("net.kyori.indra")
//	id("org.jetbrains.gradle.plugin.idea-ext")
	id("idea")
	id("eclipse")
	id("visual-studio")
}

val libs = extensions.getByType(org.gradle.accessors.dm.LibrariesForLibs::class)

group = rootProject.group
version = rootProject.version
description = rootProject.description

repositories {
	mavenCentral()
//	sonatype.s01Snapshots()
//	sonatype.ossSnapshots()
	maven("https://repo.papermc.io/repository/maven-public/")
	maven("https://maven.mizule.dev/")
	maven {
		name = "reposiliteRepositorySnapshots"
		url = uri("https://repo.jpenilla.xyz/snapshots")
	}
}

//extensions.configure(IndraExtension::class) {
//	gpl3OnlyLicense()
//	github(providers.gradleProperty("githubOrg").get(), providers.gradleProperty("githubRepo").get()) {
//		ci(true)
//		issues(true)
//		scm(true)
//	}
//
//	configurePublications {
//		pom {
//			developers {
//				developer {
//					id.set("powercas_gamer")
//					name.set("Cas")
//					url.set("https://mizule.dev")
//					email.set("cas [at] mizule [dot] dev")
//					timezone.set("Europe/Amsterdam")
//				}
//			}
//		}
//	}
//}

//idea {
//	module {
//		isDownloadJavadoc = true
//		isDownloadSources = true
//	}
//}