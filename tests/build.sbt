lazy val root = (project in file("."))
  .enablePlugins(GatlingPlugin)
  .settings(
    name := "tests",
    version := "1.0",
    scalaVersion := "2.11.8"
  )

libraryDependencies ++= Seq(
	"io.gatling" % "gatling-test-framework" % "2.1.7"
)
