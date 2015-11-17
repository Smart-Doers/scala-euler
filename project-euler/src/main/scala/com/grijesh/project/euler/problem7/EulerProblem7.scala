package com.grijesh.project.euler.problem7

import java.lang.Math._

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh .
 */
// todo Refactor Not a proper solution need to check again after doing some more exercise
object EulerProblem7 extends App {
  //var result:Long = 0
  var counter: Long = 0L
  val result = naturals.takeWhile(_ <= 1000000).filter(item => isPrime(item))

  result.drop(10000).take(1).print()

  lazy val naturals: Stream[Long] = Stream.cons(2, naturals.map {
    _ + 1
  })

  def isPrime(num: Long): Boolean = {
    !(2L to sqrt(num).toLong by 1).exists(num % _ == 0)
  }

  case class LessThen(x: Long) extends Function[Long, Boolean] {
    def apply(arg: Long) = counter < x
  }

  /* def from(n: Int): Stream[Int] =
     Stream.cons(n, from(n + 1))

   def sieve(s: Stream[Int]): Stream[Int] =
     Stream.cons(s.head, sieve(s.tail filter { _ % s.head != 0 }))

   def primes = sieve(from(2))

   primes take 10000 print*/
}



