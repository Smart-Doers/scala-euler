package com.learn.scala.s99.problem4

import com.learn.scala.s99.Utility

import scala.annotation.tailrec

/**
  * Created by grijesh.
  */
object Length extends App {

  val list = (1L to 100000L).toList
  println(Utility.time(length(list)))
  println(Utility.time(lengthOfList(list)))
  println(Utility.time(lengthRecursive(list)))

  def length[T](list: List[T]) = {
    list.length
  }

  def lengthOfList[T](list: List[T]) = {
    if (list.isEmpty) throw new NoSuchElementException
    var length = 0
    var these = list
    while (these.nonEmpty) {
      these = these.tail
      length = length + 1
    }
    length
  }

  def lengthRecursive[T](list: List[T]) = {
    @tailrec
    def loop(length: Long, internalList: List[T]): Long = internalList match {
      case Nil => 0
      case h :: Nil => length
      case _ :: tail => loop(length + 1, tail)
    }
    loop(1, list)
  }


}
