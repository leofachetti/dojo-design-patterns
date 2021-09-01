package com.mercadolibre.si

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun appHasAGreeting() {
        val classUnderTest = Main()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }
}
