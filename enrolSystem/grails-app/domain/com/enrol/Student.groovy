package com.enrol

class Student {

Course course

String name

String studentID

Date dob

Boolean isFundingAvailable

String email

String username

String password

static hasMany=[modules:Module]

    static constraints = {
	
	name blank:false, nullable:false

	studentID blank:false, nullable:false
	
	dob blank:false, nullable:false
	
	email blank:false, nullable:false, email:true

	username blank:false, nullable:false
	
	password blank:false, nullable:false

	isFundingAvailable blank:false, nullable:false

	course blank:false, nullable:false
    }

String toString(){
return name

}

}
