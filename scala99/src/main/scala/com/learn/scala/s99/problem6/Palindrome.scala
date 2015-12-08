package com.learn.scala.s99.problem6

import com.learn.scala.s99.Utility

/**
  * Created by grijesh.
  */
object Palindrome extends App{

  val list = List(1,2,3,2,1)
  println(Utility.time(palindrome(list)))

  def palindrome[T](list:List[T]) = {
    list == list.reverse
  }

}
