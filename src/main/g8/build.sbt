ThisBuild / scalaVersion := "2.12.7"
ThisBuild / crossScalaVersions := Seq("2.11.12", "2.12.7")
ThisBuild / organization := "$organization$"
ThisBuild / scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfatal-warnings")
ThisBuild / javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")


lazy val root = (project in file("."))
  .settings(
    name := "$name;format="norm"$",
    version := "0.0.0",

    // Option Parsing:
    libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.0",

    // Configuration:
    libraryDependencies += "com.github.pureconfig" %% "pureconfig" % "0.9.2",

    // Logging:
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
    libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.25",                                 // slf4j as logging interface
    libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.11.1" % Runtime, // bridge: slf4j -> log4j
    libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.11.1" % Runtime,        // log4j as logging mechanism
    libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.11.1" % Runtime,       // log4j as logging mechanism

    // Testing:
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  )
