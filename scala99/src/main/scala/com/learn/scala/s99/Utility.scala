package com.learn.scala.s99

/**
 * Created by Grijesh Saini.
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
