lazy val root = (project in file(".")).
  settings(
    name := "Reversi",
    version := "2023.0",
    scalaVersion := "3.1.0"
  )

run / fork := true

libraryDependencies += "org.scalafx" %% "scalafx" % "20.0.0-R31"
libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
testFrameworks += new TestFramework("munit.Framework")
