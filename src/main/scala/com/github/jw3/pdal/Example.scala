package com.github.jw3.pdal

import io.pdal.pipeline._

object Example extends App {
  GreyhoundRead("http://localhost:9000", spatialreference = Some("EPSG:4326")) ~
    CropFilter() ~
    LasWrite("/path/to/new/las")
}
