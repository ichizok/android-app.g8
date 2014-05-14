import android.Keys._

android.Plugin.androidBuild

name := "$name$"

version := "0.1-SNAPSHOT"

scalaVersion := "$scala_version$"

proguardCache in Android ++= Seq(
  ProguardCache("org.scaloid") % "org.scaloid"
)

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize", "-dontwarn scala.collection.mutable.**")

libraryDependencies += "org.scaloid" %% "scaloid" % "3.4-10"

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
