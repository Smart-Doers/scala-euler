package com.learn.scala.s99.problem5

import com.learn.scala.s99.Utility

import scala.annotation.tailrec

/**
  * Created by grijesh on 6/12/15.
  */
object Reverse extends App{

  val list = (1L to 10000L).toList
  println(Utility.time(reverse(list)))
  println(Utility.time(reverseUsingOperator(list)))
  println(Utility.time(reverseRecursive(list)))
  println(Utility.time(reverseUsingFoldLeft(list)))
  println(Utility.time(reverseUsingFoldLeft2(list)))


  def reverse[T](list:List[T]) = {
    list.reverse
  }

  def reverseUsingOperator[T](list:List[T]) = {
    var newList:List[T] = Nil
    var these = list
    while(these.nonEmpty){
      newList = newList .:: (these.head)
      these = these.tail
    }
    newList
  }

  def reverseRecursive[T](list:List[T]) = {
    @tailrec
    def loop(newList:List[T],origList:List[T]):List[T] = origList match {
      case Nil => newList
      case h::tail => loop( newList .:: (h),tail)
    }
    loop(Nil,list)

  }

  def reverseUsingFoldLeft[T](list:List[T]) = {
    list.foldLeft(List[T]())((newList,listElement) => newList .:: (listElement))
  }

  def reverseUsingFoldLeft2[T](list:List[T]) = {
    list.foldLeft(List[T]())((r,h) => h :: r)
  }

}
