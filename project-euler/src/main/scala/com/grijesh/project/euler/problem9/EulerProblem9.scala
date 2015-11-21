package com.grijesh.project.euler.problem9

import com.grijesh.project.euler.Utility

import scala.util.control.Breaks._

/**
 * Created by grijesh on 21/11/15.
 */
object EulerProblem9 extends App {

  println(Utility.time(execute()))

  def execute() = {
    var result = 0L
    breakable(
      for (a <- 1 to 1000; b <- a + 1 to 1000) {
        val c = 1000 - a - b
        if (isTriplet(a, b, c)) {
          //println(a+" "+b+" "+c)
          result = a * b * c
          break
        }
      }
    )
    result
  }

  def isTriplet(a: Int, b: Int, c: Int) = {
    (a * a) + (b * b) == (c * c)
  }

}
