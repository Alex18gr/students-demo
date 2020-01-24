package io.alexc.studentsdemo.service

import io.alexc.studentsdemo.entity.Student
import org.springframework.stereotype.Service

interface StudentService {

    fun findAll(): MutableList<Student>

    fun <S : Student?> save(student: S): S

    fun delete(student: Student)

    fun getById(id: Int): Student?

}