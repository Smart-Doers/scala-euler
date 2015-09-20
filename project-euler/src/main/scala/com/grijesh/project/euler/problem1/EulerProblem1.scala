package com.grijesh.project.euler.problem1

/**
 * Created by Grijesh Saini on 9/21/2015.
 */
object EulerProblem1 extends App{

    val rangeTo1000 = Range.apply(1,1000)
    val total = rangeTo1000.filter(item => item%3==0 || item%5==0).sum
    print(total)

}
