package com.grijesh.project.euler

/**
 * Created by Grijesh Saini on 9/21/2015.
 */
object Utility {
  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block
    val t1 = System.currentTimeMillis()
    println("Time taken: " + (t1 - t0) + "ms")
    result
  }
}
