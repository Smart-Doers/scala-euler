package com.learn.scala.s99.problem2

import com.learn.scala.s99.Utility

/**
  * Created by grijesh.
  */
object LastButOneElement extends App{

  val list = (1L to 100000l).toList
  println(Utility.time(penultimate(list)))
  println(Utility.time(penultimateRecursive(list)))

  def penultimate[A](list:List[A]):A = {
    if (list.isEmpty) throw new NoSuchElementException
    var these = list
    var nx = list.tail
    while (nx.tail.nonEmpty) {
      these = nx
      nx = nx.tail
    }
    these.head
  }

  def penultimateRecursive[T](list:List[T]):T = list match {
    case h :: s :: Nil => h
    case _ :: tail => penultimateRecursive(tail)
    case _  => throw new NoSuchElementException
  }

}
