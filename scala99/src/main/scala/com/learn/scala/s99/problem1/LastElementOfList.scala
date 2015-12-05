package com.learn.scala.s99.problem1

import com.learn.scala.s99.Utility

/**
  * Created by grijesh.
  */
object LastElementOfList extends App{
  val list = (1L to 100000L).toList
  println(Utility.time(last(list)))
  println(Utility.time(lastRecursive(list)))
  println(Utility.time(lastInternal(list)))

  def last[A](list:List[A]) = {
    list.last
  }

  def lastRecursive[T](list:List[T]):T = list match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _  => throw new NoSuchElementException
  }

  //(Fast in compare to recursive approach)
  def lastInternal[A](list:List[A]):A = {
    if (list.isEmpty) throw new NoSuchElementException
    var these = list
    var nx = list.tail
    while (nx.nonEmpty) {
      these = nx
      nx = nx.tail
    }
    these.head
  }
}
