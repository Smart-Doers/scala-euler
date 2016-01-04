package com.learn.scala.s99.problem8

import com.learn.scala.s99.Utility

/**
  * Created by grijesh.
  */
object Compress extends App {

  println(Utility.time(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))))

  def compress[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]())((newList, listElement) => {

      if (newList.nonEmpty) {
        newList.last match {
          case `listElement` => newList
          case _ => newList :+ listElement
        }
      }
      else
        newList :+ listElement
    }
    )
  }

}
