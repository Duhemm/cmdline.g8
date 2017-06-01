// Currently, Scala Native support Scala 2.11.8 and 2.11.11
scalaVersion := "2.11.11"

// Notice the `%%%`: we're using a library that is cross built to Native
libraryDependencies += "com.github.scopt" %%% "scopt" % "3.6.0"

enablePlugins(ScalaNativePlugin)
