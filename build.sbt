name := """facturacion"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
 "it.innove" % "play2-pdf" % "1.1.3",
 "de.deltatree.tools" % "qrsct" % "1.1.2",
 "org.mongodb.morphia" % "morphia" % "1.0.0-rc0"
)

val appDependencies = Seq(
  "postgresql" % "postgresql" % "9.1-1201.jdbc4"
)