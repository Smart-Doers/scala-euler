package com.grijesh.project.euler

import java.lang.Math._

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


  def findPrimeFactors(inputNumber: Long): List[Long] = {
    var input: Long = inputNumber
    var primeFactors: List[Long] = List()

    while (input % 2 == 0) {
      primeFactors = primeFactors :+ 2L
      input = input / 2
    }

    primeFactors = primeFactors ::: primeFactor(input)
    primeFactors
  }

  def primeFactor(input: Long): List[Long] = {
    val tempOutput = (3L to sqrt(input).toLong by 2).find(input % _ == 0)
    tempOutput match {
      case Some(num) => num :: primeFactor(input / num)
      case None => List(input)
    }
  }
}
