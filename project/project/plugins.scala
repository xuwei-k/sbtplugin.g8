import sbt._
object PluginDef extends Build {
  lazy val root = Project("plugins", file(".")) dependsOn(
    ProjectRef(uri("git://github.com/n8han/giter8#0.4.5"), "giter8-plugin")
  )
}
