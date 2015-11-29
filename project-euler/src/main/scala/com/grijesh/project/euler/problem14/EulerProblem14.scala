package com.grijesh.project.euler.problem14

import com.grijesh.project.euler.Utility

import scala.annotation.tailrec

/**
 * Created by grijesh on 29/11/15.
 */
object EulerProblem14 extends App {


  // Proper way found on internet
  //Good link about http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
  // http://stackoverflow.com/questions/17319412/how-does-tailrec-work
  def findCollatzSeriesLength(start: Long): Long = {
    @tailrec
    //This annotation lets you mark specific methods that you hope the compiler will optimise.
    // You will then get a warning if they are not optimised by the compiler.
    def loop(n: Long, length: Long): Long = {
      if (n == 1) length + 1
      else if (n % 2 == 0) loop(n / 2, length + 1)
      else loop(3 * n + 1, length + 1)
    }
    loop(start, 0)
  }

  print(Utility.time((1L to 1000000).par.maxBy(findCollatzSeriesLength)))

  // A very bad attempt to solve the problem
  /*print(Utility.time(problem14()))

  def problem14():Long = {
    def findCollatzSeriesCount(num: Long): Stream[Long] = {
      var number = num
      if (number != 1) {
        if (number % 2 == 0)
          number = number / 2
        else
          number = number * 3 + 1
      }

      number #:: findCollatzSeriesCount(number)
    }

    var num = 1000000L
    var counter = 0L
    var answer = 0L
    while (num > 1L) {
      val temp = findCollatzSeriesCount(num).takeWhile(_ != 1).count(_ != 1) + 2
      if (temp > counter) {
        counter = temp
        answer = num
      }
      num = num - 1
    }
   answer
  }*/
}
