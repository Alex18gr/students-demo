package io.alexc.studentsdemo.error

import java.lang.RuntimeException

class StudentNotFoundException : RuntimeException {

    constructor() : super() {

    }

    constructor(id: Int) : super("Student with id = $id not found.") {

    }
}