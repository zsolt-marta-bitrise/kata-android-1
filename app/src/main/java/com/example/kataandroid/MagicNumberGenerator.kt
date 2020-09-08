package com.example.kataandroid

import java.time.LocalDateTime
import java.time.ZoneOffset

class MagicNumberGenerator {
    fun getMagicNumberForDate(time: LocalDateTime) = time.toInstant(ZoneOffset.UTC).epochSecond.rem(10)
}