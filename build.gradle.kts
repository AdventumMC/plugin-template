/**
 * The build script is not made to be touched, take a look at the
 * buildSrc directory to change stuff.
 */
import net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.STARTUP

plugins {
    java
    kotlin("jvm") version "1.4-M1"
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = Plugin.GROUP
version = Plugin.VERSION

repositories {
    maven(Repositories.KOTLIN_DEVELOPMENT)
    maven(Repositories.KOTLINX)
    maven(Repositories.SPIGOT)
    mavenCentral()
    jcenter()
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly(Dependencies.BUKKIT)
    compileOnly(Dependencies.COROUTINES)
    compileOnly(Dependencies.REQUERY)
    compileOnly(Dependencies.REQUERY_KOTLIN)
    compileOnly(Dependencies.HIKARI)
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

bukkit {
    name         = Plugin.NAME
    description  = Plugin.DESCRIPTION
    version      = Plugin.VERSION
    authors      = Plugin.AUTHORS
    depend       = Plugin.DEPENDENCIES
    load         = STARTUP
}