package com.example.kataandroid

import org.junit.Assert
import org.junit.Test
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

class MagicNumberGeneratorTest {

    private val magicNumberGenerator = MagicNumberGenerator()

    @Test
    fun `Given timestamp When passed to magic number generated Then correct magic number generated`() {
        val timestamp = 103L
        val time = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneOffset.UTC)

        val magicNumber = magicNumberGenerator.getMagicNumberForDate(time)

        Assert.assertEquals(3, magicNumber)
    }
}