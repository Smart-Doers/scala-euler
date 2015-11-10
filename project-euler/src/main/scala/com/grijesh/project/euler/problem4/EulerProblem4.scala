package com.grijesh.project.euler.problem4

import com.grijesh.project.euler.Utility
import util.control.Breaks._

/**
 * Created by grijesh on 11/11/15.
 */
object EulerProblem4 extends App {

  println(Utility.time(findLargestPalindrome()))

  println(Utility.time(findLargestPalindrome2()))

  // One Way
  def findLargestPalindrome(): Long = {
    val palindromeList = for (a <- 999 to 100 by -1; b <- 999 to 100 by -1 if isPalindrome(a * b)) yield a * b
    println(palindromeList)
    palindromeList.max
  }

  //Other way
  def findLargestPalindrome2(): Long = {
    var palindromeList: List[Long] = List()
    var bRange = 100
      for (a <- 999 to 100 by -1) {
        breakable( for (b <- a to bRange by -1) {
          if (isPalindrome(a * b)) {
            palindromeList = palindromeList :+ (a * b).toLong
            bRange = b
            break
          }
        })
      }
    palindromeList.max
  }

  def isPalindrome(input: Long): Boolean = {
    val temp = findReverse(input)
    temp == input
  }

  def findReverse(input: Long): Long = {
    input.toString.reverse.toLong
  }

}
