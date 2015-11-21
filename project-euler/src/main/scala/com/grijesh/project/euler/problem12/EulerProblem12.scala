package com.grijesh.project.euler.problem12

import com.grijesh.project.euler.Utility

import scala.util.control.Breaks._

/**
 * Created by grijesh on 22/11/15.
 */
object EulerProblem12 extends App {


  lazy val naturals: Stream[Long] = Stream.cons(1, naturals.map {
    _ + 1
  })

  def findTriangularNumberHaveDivisors(num: Long) = {

    var counter = 1L
    var result = 0L
    breakable(while (true) {
      result = triangularNum(counter)
      val number = numberOfDivisor(result)
      if (number >= num)
        break

      counter = counter + 1
    })
    result
  }

  def triangularNum(num: Long) = {
    naturals.takeWhile(_ <= num).sum
  }

  def numberOfDivisor(num: Long) = {

    val end = Math.sqrt(num).toLong
    var count = naturals.takeWhile(_ < end).count(num % _ == 0) * 2
    if (end * end == num)
      count = count + 1

    count
  }

  //println(numberOfDivisor(21))
  println(Utility.time(findTriangularNumberHaveDivisors(501)))

}
