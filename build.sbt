name := "hello-scalatest-scala"

version := "0.3"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.19"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.18.0" % Test
)

enablePlugins(JavaAppPackaging)
