scalaVersion := "2.11.8"

resolvers += Resolver.sbtPluginRepo("releases")

testNGSettings

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.bouncycastle" % "bcprov-jdk15on" % "1.54",
  "commons-codec" % "commons-codec" % "1.6"
)
