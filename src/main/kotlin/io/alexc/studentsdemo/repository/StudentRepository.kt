package io.alexc.studentsdemo.repository

import io.alexc.studentsdemo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<Student, Int> {

    override fun findAll(): MutableList<Student>

    override fun <S : Student?> save(student: S): S

    override fun delete(student: Student)

    fun getById(id: Int): Student?

}