<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sreda Enrolment System - Simple Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
	<asset:stylesheet src="home.css"/>
<body>

<div class="row">
	<h1>Sreda Student Enrolment</h1>
<h3 Search Results</h3>

<p>
	Searched ${totalStudents} records
	
	for items matching <em>${term}</em>.

	Found <strong>${students.size()}</strong>students.
</p>

<ul>

	<g:each var="student" in="${students}">

	<li><g:link controller="student" action="show"
id="${student.id}">${student.name}</g:link></li>
	
	</g:each>

	</ul>

<button type="button" class="btn btn-success">
	
	<g:link action='search'>Search Again</g:link>

</button>

</div>

</body>

</html>
