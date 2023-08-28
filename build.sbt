name := "hello-scalatest-scala"

version := "0.2"

scalaVersion := "3.3.0"

scalacOptions += "@.scalacOptions.txt"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.16"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
)
