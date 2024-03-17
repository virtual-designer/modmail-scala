ThisBuild / version := "1.0.0-dev"
ThisBuild / scalaVersion := "3.3.1"

val rootPackage = "org.onesoftnet.mailbot"
Compile / mainClass := Some(s"$rootPackage.Main")

lazy val root = (project in file("."))
  .settings(
    name := "mailbot-scala",
    idePackagePrefix := Some("")
  )
  
libraryDependencies ++= Seq(
    "net.dv8tion" % "JDA" % "5.0.0-beta.21",
    "io.github.cdimascio" % "dotenv-java" % "3.0.0"
)