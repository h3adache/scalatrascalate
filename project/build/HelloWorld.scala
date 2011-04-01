import sbt._

class HelloWorld(info: ProjectInfo) extends DefaultWebProject(info)
{
    val jettyVersion = "6.1.22"
    val servletVersion = "2.5"
    val slf4jVersion = "1.6.0"
    val logbackVersion = "0.9.24"
    val scalatraVersion = "2.0.0.M1"
    val scalateVersion = "1.2"
    val scalaTestVersion = "1.2-for-scala-2.8.0.final-SNAPSHOT"

    val jetty6 = "org.mortbay.jetty" % "jetty" % jettyVersion % "test"
    val servletApi = "javax.servlet" % "servlet-api" % servletVersion % "provided"

    // scalaTest
    val scalaTest = "org.scalatest" % "scalatest" % scalaTestVersion % "test"

    // scalatra
    val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion

    // scalate
    val scalate = "org.fusesource.scalate" % "scalate-core" % scalateVersion
    val scalatraScalate = "org.scalatra" %% "scalatra-scalate" % scalatraVersion

    val sfl4japi = "org.slf4j" % "slf4j-api" % slf4jVersion
    val sfl4jnop = "org.slf4j" % "slf4j-nop" % slf4jVersion % "runtime"

    // repositories
    val scalaToolsSnapshots = "Scala Tools Repository" at "http://nexus.scala-tools.org/content/repositories/snapshots/"
    val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
    val sonatypeNexusReleases = "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"
    val fuseSourceSnapshots = "FuseSource Snapshot Repository" at "http://repo.fusesource.com/nexus/content/repositories/snapshots"
}
