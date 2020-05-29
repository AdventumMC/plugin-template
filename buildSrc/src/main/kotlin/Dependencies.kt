/**
 * Every libraries provided here are shaded inside of Odin, you don't need to shade
 * them.
 */
object Dependencies {

    /**
     * Bukkit's API, we don't use Spigot's API (it sucks), we'll rather use external libraries.
     */
    const val BUKKIT         = "org.bukkit:bukkit:1.15.2-R0.1-SNAPSHOT"

    /**
     * Coroutines used by the plugin to schedule tasks instead of Bukkit's trashy scheduler.
     */
    const val COROUTINES     = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.3.5-1.4-M1"

    /**
     * Requery (used to communicate with database easily!)
     */
    const val REQUERY        = "io.requery:requery:1.6.1"

    /**
     * Requery (used to communicate with database easily!)
     */
    const val REQUERY_KOTLIN = "io.requery:requery-kotlin:1.6.1"

}