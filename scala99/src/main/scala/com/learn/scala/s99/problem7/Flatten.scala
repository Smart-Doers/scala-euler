package com.learn.scala.s99.problem7

import com.learn.scala.s99.Utility

/**
  * Created by grijesh.
  */
object Flatten extends App {

  val list = List(List(List(1, 1), 2, List(3, List(5, 8))))
  println(Utility.time(flatten(list)))

  //Copied from solution page
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

}
