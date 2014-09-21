libraryDependencies <+= (sbtVersion) { sv =>
  "org.scala-sbt" % "scripted-plugin" % sv
}

addSbtPlugin("org.scala-sbt.plugins" % "sbt-onejar" % "0.8")