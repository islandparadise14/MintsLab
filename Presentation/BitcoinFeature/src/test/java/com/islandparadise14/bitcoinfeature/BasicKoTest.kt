package com.islandparadise14.bitcoinfeature

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BasicKoTest : FunSpec({
    context("KoTest 기본 기능 테스트") {
        test("1 + 1") {
            1 + 1 shouldBe 2
        }

        test("2 + 5") {
            2 + 5 shouldBe 7
        }
    }
})