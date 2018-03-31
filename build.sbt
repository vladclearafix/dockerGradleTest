lazy val dockerGradleTest = (project in file("."))
  .aggregate(superapp, supermonitor)

lazy val superapp = (project in file("superapp"))
lazy val supermonitor = (project in file ("supermonitor"))