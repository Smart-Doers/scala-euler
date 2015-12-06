package com.learn.scala.s99.problem3

import com.learn.scala.s99.Utility

import scala.annotation.tailrec

/**
  * Created by grijesh.
  */
object NthElement extends App {

  println(Utility.time(nth(999, (1 to 1000).toList)))
  println(Utility.time(nthRecursive(999, (1 to 1000).toList)))

  def nth[T](index: Int, list: List[T]): T = {
    list(index)
  }

  //Got help from solution given in problem
  @tailrec
  def nthRecursive[T](index: Int, list: List[T]): T = (index, list) match {
    case (0, h :: tail) => h
    case (_, _ :: tail) => nthRecursive(index - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}
