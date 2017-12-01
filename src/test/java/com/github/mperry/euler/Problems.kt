package com.github.mperry.euler

//import com.github.aneveux.euler.common.sequences.primes
import com.github.mperry.Problem1
import org.assertj.core.api.Assertions.assertThat
//import org.junit.Test
import org.junit.jupiter.api.Test


class Problems {


    @Test
    fun testProblem1Example() {
        assertThat(Problem1().sumMultiples(3, 5, 10)).isEqualTo(23)
        val n = Problem1().sumMultiples(3, 5, 1000)
        println(n)
        assertThat(n).isEqualTo(233168)
    }

}