package com.github.mperry

import fj.data.Stream

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The
 * sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class Problem1 {

    fun sumMultiples(first: Int, second: Int, below: Int): Int {
        return Stream.range(1, below.toLong()).filter{(it % first == 0 || it % second == 0)}.sum()
    }

}
