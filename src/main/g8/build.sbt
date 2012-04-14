sbtPlugin := true

name := "$name$"

organization := "$organization$"

version := "$version$"

scalacOptions := Seq("-deprecation", "-unchecked")

seq(ScriptedPlugin.scriptedSettings: _*)

ScriptedPlugin.scriptedBufferLog := false
