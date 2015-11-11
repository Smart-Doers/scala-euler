package com.grijesh.project.euler.problem6

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 12/11/15.
 */
object EulerProblem6 extends App{

  println(Utility.time(problem6()))

  def problem6():Long= {
    val sumOfSquare = (1 to 100).foldLeft(0)((a, b) => a + (b * b))
    val sumOfNumbers = (1 to 100).sum
    val squareOfSum = sumOfNumbers * sumOfNumbers
    squareOfSum - sumOfSquare
  }

}
