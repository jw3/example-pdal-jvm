package com.github.jw3.pdal

import io.pdal
import io.pdal.pipeline._

object SimpleExample extends App {
  val pipeline = pdal.Pipeline(
    LasRead("/usr/local/data/red-rocks.laz") ~ LasWrite("/usr/local/data/red-rocks.out.laz")
  )
  pipeline.initialise()
  pipeline.execute()
  pipeline.dispose()
}
