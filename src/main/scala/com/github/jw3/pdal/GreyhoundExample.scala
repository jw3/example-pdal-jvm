package com.github.jw3.pdal

import io.pdal
import io.pdal.pipeline.{CropFilter, GreyhoundRead, LasWrite}

object GreyhoundExample extends App {
  val pipeline = pdal.Pipeline(
    GreyhoundRead("http://localhost:9000/resource/red-rocks") ~
      LasWrite("/usr/local/data/gh.out.laz")
  )

  pipeline.initialise()
  pipeline.execute()
  pipeline.dispose()
}
