package com.enrol

class StudentController {

    def scaffold= Student
	def search(){

		}

def results(String name){
def students=Student.where{

		name=~name
	
	}.list()

	return [students:students,
		term:params.name,

		totalStudents: Student.count()]
		
}	

}




