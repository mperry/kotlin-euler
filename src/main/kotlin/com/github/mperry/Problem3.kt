package com.github.mperry

import fj.data.Stream

/**
 * The prime factors of 13195 are 5, 7, 13 and 29
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class Problem3 {

    fun sieve(s: Stream<Int>): Stream<Int> = Stream.cons(s.head(), { sieve(s.tail()._1().filter{it % s.head() != 0})})

    fun primes(): Stream<Int> = sieve(Stream.range(2))

    fun sieveLong(s: Stream<Long>): Stream<Long> = Stream.cons(s.head(), {
        sieveLong(s.tail()._1().filter{it % s.head() != 0L})
    })

    fun primesLong(): Stream<Long> = sieveLong(Stream.iterate({a: Long -> a + 1}, 2L))

    fun factors(n: Long): Stream<Long> {
//        val ls = Stream.iterate({a: Long -> a + 1}, 2L)
//        val stop = Math.round(Math.sqrt(n.toDouble()))
        val s = primesLong().find{l -> n % l == 0L}.map{l -> Stream.cons(l, {factors(n / l)})}.orSome{Stream.single(n)}

//        val s2 = primesLong().takeWhile {
//            it <= n
//        }.filter {
//            n / it * it == n
//        }
        return s
    }

}