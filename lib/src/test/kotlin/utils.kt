package com.lantopia.utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class UtilsTest {
    @Test
    fun testEcho() {
        val out = echo("test");

        assertThat(out).isEqualTo("test");
    }
}
