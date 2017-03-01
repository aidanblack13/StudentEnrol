package com.enrol

class StudentController {

    def scaffold= Student
}

def search(){

}

def students=Students.where{

		name=~name
	
	}.list()

return[students:students,
	term:params.name,
	
	totalStudents: Student.count()]

}
