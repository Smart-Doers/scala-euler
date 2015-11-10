package com.grijesh.project.euler.problem4

import com.grijesh.project.euler.Utility

/**
 * Created by grijesh on 11/11/15.
 */
object EulerProblem4 extends App{

  println(Utility.time(findLargestPalindrome()))

  def findLargestPalindrome(): Long ={
    val palindromeList = for(a <- 999 to 100 by -1;b <- 999 to 100 by -1 if isPalindrome(a*b)) yield a*b
    palindromeList.max
  }


  def isPalindrome(input:Long):Boolean = {
    val temp = findReverse(input)
    temp == input
  }

  def findReverse(input:Long):Long ={
    input.toString.reverse.toLong
  }

}
