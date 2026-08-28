name := "hello-scalatest-scala"

version := "0.3"

libraryDependencies ++= Seq(
  "org.apache.commons" %  "commons-collections4" % "4.5.0",
  "org.scalatest"  %% "scalatest"  % "3.2.20"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.20.0" % Test
)

enablePlugins(JavaAppPackaging)
