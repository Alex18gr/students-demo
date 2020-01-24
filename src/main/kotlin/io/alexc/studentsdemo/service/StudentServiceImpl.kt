package io.alexc.studentsdemo.service

import io.alexc.studentsdemo.entity.Student
import io.alexc.studentsdemo.repository.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl(private val studentRepository: StudentRepository) : StudentService {
    override fun findAll(): MutableList<Student> {
        return studentRepository.findAll()
    }

    override fun <S : Student?> save(student: S): S {
        return studentRepository.save(student)
    }

    override fun delete(student: Student) {
        studentRepository.delete(student)
    }

    override fun getById(id: Int): Student? {
        return studentRepository.getById(id)
    }
}