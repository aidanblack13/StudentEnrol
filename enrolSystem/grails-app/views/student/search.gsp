<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sreda Enrolment System</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
	<asset:stylesheet src="home.css"/>
<body>

<div class="row">

<h1>Sreda Student Enrolment System</h1>

<formset>

			<legend>Searchfor Students(Simple)</legend>

			<g:form action="results">

			<label for="name">Student Name</label>
		<g:textField name="name"/>
		<g:submitButton name="search" value="Search" />
		</g:form>
</formset>

</div>

</body>

</html>
	
   
