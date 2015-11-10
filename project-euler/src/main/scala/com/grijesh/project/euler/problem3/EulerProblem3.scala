package com.grijesh.project.euler.problem3

import java.lang.Math.sqrt

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 10/11/15.
 */
object EulerProblem3 extends App{

  val inputNumber:Long = 600851475143L

  println(Utility.time(findPrimeFactors(inputNumber).last))

  def findPrimeFactors(inputNumber:Long):List[Long] = {
    var input:Long = inputNumber
    var primeFactors:List[Long] = List()

    while (input % 2 == 0) {
      primeFactors = primeFactors :+ 2L
      input = input / 2
    }

    primeFactors = primeFactors :+ primeFactor(input).last
    primeFactors
  }

  def primeFactor(input:Long):List[Long] = {
    val tempOutput = (3L to sqrt(input).toLong by 2).find(input % _ ==0)
    tempOutput match {
      case Some(num) => num :: primeFactor(input/num)
      case None => List(input)
    }
  }
}



