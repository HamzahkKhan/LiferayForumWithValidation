create table asif_Employee (
	employeeId LONG not null primary key,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	age LONG
);

create table asif_Employer (
	employerId LONG not null primary key,
	name VARCHAR(75) null,
	surname VARCHAR(75) null,
	age LONG
);

create table asif_StudentInfo (
	studentId LONG not null primary key,
	firstname VARCHAR(75) null,
	lastname VARCHAR(75) null,
	gender VARCHAR(75) null,
	dateofbirth VARCHAR(75) null,
	course VARCHAR(75) null,
	intake VARCHAR(75) null,
	address VARCHAR(75) null,
	city VARCHAR(75) null,
	postcode VARCHAR(75) null,
	country VARCHAR(75) null,
	email VARCHAR(75) null,
	mobile VARCHAR(75) null
);