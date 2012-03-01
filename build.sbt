name := "template"

version := "1.0"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= {
    val liftVersion = "2.4-M5"
    Seq(
        "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default",
        "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
        "javax.servlet" % "servlet-api" % "2.5" % "provided")
}