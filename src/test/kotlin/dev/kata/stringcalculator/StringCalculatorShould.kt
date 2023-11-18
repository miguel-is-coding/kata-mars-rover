package dev.kata.stringcalculator

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test

internal class StringCalculatorShould {
    @Test
    fun `throw not implemented`() {
        val stringCalculatorDependency = mockk<StringCalculatorDependency>()
        every { stringCalculatorDependency.doSomething() } throws NotImplementedError("Time to do some TDD...")

        val exception = shouldThrow<NotImplementedError> {
            StringCalculator(stringCalculatorDependency).execute()
        }

        exception.message shouldBe "Time to do some TDD..."
    }
}
