package com.grijesh.project.euler.problem10

import java.lang.Math._

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 21/11/15.
 */
object EulerProblem10 extends App {

  println(Utility.time(naturals.takeWhile(_ <= 2000000).filter(item => isPrime(item)).sum + 2))

  lazy val naturals: Stream[Long] = Stream.cons(3, naturals.map {
    _ + 2
  })

  def isPrime(num: Long): Boolean = {
    !(2L to sqrt(num).toLong by 1).exists(num % _ == 0)
  }
}
