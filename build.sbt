name := "hello-scalatest-scala"

version := "0.2"

scalaVersion := "3.1.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-language:strictEquality")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.13"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.16.0" % Test
)

scalacOptions ++= Seq("-rewrite", "-new-syntax")
