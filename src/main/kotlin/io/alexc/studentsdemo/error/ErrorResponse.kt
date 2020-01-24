package io.alexc.studentsdemo.error

data class ErrorResponse(
        val status: Int,
        val message: String,
        val timeStamp: Long
)