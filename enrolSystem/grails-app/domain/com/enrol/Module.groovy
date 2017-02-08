package com.enrol

class Module {

Lecturer lecturer

String title

String code

int credits

String course

String description

static hasMany=[courses:Course,student:Student]

static belongsTo=[Course,Student]

    static constraints = {

	title blank:false, nullable:false

	code blank:false, nullable:false

	credits blank:false, nullable:false, minSize: 20, maxSize: 120

	lecturer blank:false, nullable:false

	description blank:false, nullable:false, maxSize: 5000, widget:'textarea'
    }
}
