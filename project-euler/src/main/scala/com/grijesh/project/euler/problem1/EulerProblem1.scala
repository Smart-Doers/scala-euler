package com.grijesh.project.euler.problem1

import com.grijesh.project.euler.Utility

/**
 * Created by Grijesh Saini on 9/21/2015.
 */
object EulerProblem1 extends App{

    val total = Utility.time(Range.apply(1,1000).filter(item => item%3==0 || item%5==0).sum)
    print(total)

}
