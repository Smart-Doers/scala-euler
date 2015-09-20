package com.grijesh.project.euler.problem2

import com.grijesh.project.euler.Utility

/**
 * Created by Grijesh Saini on 9/21/2015.
 */
object EulerProblem2 extends App{

  def series = findNextFibNumber(1,1)

  //series.takeWhile(_<=100).print()
  val total = Utility.time(series.takeWhile(_<=4000000).filter(_ % 2 == 0).sum)

  print(total)

  def findNextFibNumber(first:Int,second:Int):Stream[Int] = {
    first #:: findNextFibNumber(second,first+second)
  }

}
