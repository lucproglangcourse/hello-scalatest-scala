name := "hello-scalatest-scala"

version := "0.2"

scalaVersion := "3.0.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.9"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
)
