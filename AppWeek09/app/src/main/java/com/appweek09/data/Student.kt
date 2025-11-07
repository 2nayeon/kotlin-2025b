package com.appweek09.data

import java.util.Date
import java.util.UUID

data class Student(
    val name: String,
    val id: String = UUID.randomUUID().toString(),
    val department: String = "Computer Science",
    val grade: String = "2nd Year",
    val email: String = "",
    val addedDate: Date = Date()
) {
    override fun toString(): String = name
//    아래 코드와 동일
//    override fun toString(): String {
//        return name
//    }
}