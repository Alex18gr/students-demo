package io.alexc.studentsdemo.controller

import io.alexc.studentsdemo.entity.Student
import io.alexc.studentsdemo.error.StudentNotFoundException
import io.alexc.studentsdemo.service.StudentService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["students"])
class StudentController(private val studentService: StudentService) {

    @RequestMapping(value = [""])
    fun getStudents() :List<Student> {
        return studentService.findAll()
    }

    @RequestMapping(value = ["{id}"])
    fun getStudent(@PathVariable id: Int) : Student {
        return studentService.getById(id) ?: throw StudentNotFoundException(id)
    }

    @RequestMapping(value = [""], method = [RequestMethod.POST])
    fun postStudent(@RequestBody student: Student) : Student {
        return studentService.save(student)
    }

    @RequestMapping(value = ["{id}"], method = [RequestMethod.PUT])
    fun putStudent(@RequestBody student: Student, @PathVariable id: Int) : Student {
        val s = studentService.getById(id) ?: throw StudentNotFoundException(id)
        s.birthDate = student.birthDate
        s.firstName = student.firstName
        s.lastName = student.lastName
        s.grade = student.grade
        return studentService.save(s)
    }

    @RequestMapping(value = ["{id}"], method = [RequestMethod.DELETE])
    fun deleteStudent(@PathVariable id: Int) {
        studentService.delete(studentService.getById(id) ?: throw StudentNotFoundException(id))
    }



}