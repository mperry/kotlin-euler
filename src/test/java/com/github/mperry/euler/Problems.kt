package com.github.mperry.euler

//import com.github.aneveux.euler.common.sequences.primes
import com.github.mperry.Problem1
import com.github.mperry.Problem2
import com.github.mperry.Problem3
import org.assertj.core.api.Assertions.assertThat
//import org.junit.Test
import org.junit.jupiter.api.Test


class Problems {


    @Test
    fun problem1() {
        assertThat(Problem1().sumMultiples(3, 5, 10)).isEqualTo(23)
        val n = Problem1().sumMultiples(3, 5, 1000)
        println(n)
        assertThat(n).isEqualTo(233168)
    }

    @Test
    fun problem2() {
        val n = Problem2().fibs(1, 2).filter{it % 2 == 0}.takeWhile{it <= 4000000}.sum()
        println(n)
    }


    @Test
    fun problem3() {
        val p = Problem3()
        println(p.primes().take(10).toList())
        val s1 = p.factors(20)
        val s2 = p.factors(13195)
        println(s2.toList())
        val s3 = p.factors(600851475143)
        println(s3.toList())

        // 600851475143

    }

}