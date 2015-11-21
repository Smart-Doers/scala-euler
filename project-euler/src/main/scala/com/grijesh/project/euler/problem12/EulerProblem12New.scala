package com.grijesh.project.euler.problem12

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 22/11/15.
 * Solution I found on net and suggested by Project Euler Community
 *
 * Any integer N can be expressed as follows:
 * N = p1^a1 * p2^a2 * p3 ^^a3 ( ...
 * where pn is a distinct prime number, and an is its exponent.
 * For example, 28 = 2^^2 * 7^^1
 * Furthermore, the number of divisors D(N) of any integer N can be computed from:
 * D(N) = (a1+1) * (a2+1) * (a3+1) * ...
 * an being the exponents of the distinct prime numbers which are factors of N
 * For example, the number of divisors of 28 would thus be:
 * D(28) = (2+1)*(1+1) = 3*2 = 6
 */
object EulerProblem12New extends App {

  val triangleNumbers = Iterator.from(1).map(triangleNumber)

  def factorCounts(num: Long): Long = {
    Utility.findPrimeFactors(num).groupBy(identity).map(_._2.length + 1).product
  }

  def triangleNumber(x: Int): Int = {
    if (x == 0) 0
    else x + triangleNumber(x - 1)
  }

  println(Utility.time(triangleNumbers.find(factorCounts(_) > 500).get))

  /*println(Utility.findPrimeFactors(48))
  println(Utility.findPrimeFactors(48).groupBy(identity))
  println(Utility.findPrimeFactors(48).groupBy(identity).map(_._2.length + 1))
  println(Utility.findPrimeFactors(48).groupBy(identity).map(_._2.length + 1).product)*/

}
