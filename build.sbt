name := "example-pdal-scala"

version := "0.1"

scalaVersion := "2.12.7"

javaOptions += "-Djava.library.path=/usr/local/lib"

libraryDependencies ++= Seq(
  "io.pdal" %% "pdal-scala" % "1.7.0-RC3", // scala core library
  "io.pdal" %  "pdal-native" % "1.7.0-RC3" // jni bindings
)
