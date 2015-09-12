package com.lantopia

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MainTest {
    @Test
    fun testMain() {
        assertThat(showMessage("test")).isTrue()
    }
}
