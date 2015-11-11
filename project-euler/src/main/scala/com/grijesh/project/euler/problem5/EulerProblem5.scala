package com.grijesh.project.euler.problem5

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 12/11/15
 * As per question we need to find out the Least Common Factor (LCM)
 * of numbers 1 to 20
 */
object EulerProblem5 extends App{

 println(Utility.time(Range.apply(1,20).foldLeft(1L)((a,b) => lcm(a,b))))


  //Euclid Algorithm
  def lcm(a:Long, b:Long):Long = a*b/gcf(a,b)

  def gcf(dividend:Long, divisor:Long):Long ={
    if(divisor == 0)
      return dividend

    gcf(divisor,dividend%divisor)
  }

}
