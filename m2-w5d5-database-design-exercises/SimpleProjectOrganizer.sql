CREATE TABLE department (
	
	department_id serial not null,
	department_name varchar(64) not null,
	employee_id int not null,
	
	constraint pk_department_deparment_id primary key (department_id),
	constraint fk_department_employee_id foreign key (employee_id) references employee(employee_id)
	
);

CREATE TABLE employee (
	
	employee_id serial not null,
	job_title varchar(64) not null,
	first_name varchar(64) not null,
	last_name varchar(100) not null,
	gender varchar(6) not null,
	birth_date varchar(8) not null,
	hire_date timestamp without time zone NOT NULL,
	department_id int NOT NULL,
	
	constraint pk_employee_employee_id primary key (employee_id),
	constraint fk_employee_department_id foreign key (department_id) references department(department_id)

);

CREATE TABLE project (
	
	project_id serial not null,
	project_name varchar(100) not null,
	start_date timestamp without time zone NOT NULL,
	employee_id int not null,
		
	constraint pk_project_project_id primary key (project_id),
	constraint fk_project_employee_id foreign key (employee_id) references employee(employee_id)
	
);

INSERT INTO department (department_name, employee_id) VALUES ('Parking', 1);
INSERT INTO department (department_name, employee_id) VALUES ('Shipping', 2);
INSERT INTO department (department_name, employee_id) VALUES ('Sales', 3);
INSERT INTO department (department_name, employee_id) VALUES ('Parking', 4);
INSERT INTO department (department_name, employee_id) VALUES ('Shipping', 5);
INSERT INTO department (department_name, employee_id) VALUES ('Admin', 6);
INSERT INTO department (department_name, employee_id) VALUES ('Sales', 7);
INSERT INTO department (department_name, employee_id) VALUES ('Admin', 8);

INSERT INTO project (project_name, start_date, employee_id) VALUES ('New driveway','2006-08-09 05:00:58', 1);
INSERT INTO project (project_name, start_date, employee_id) VALUES ('Upgrade','2005-07-09 07:51:58', 2);
INSERT INTO project (project_name, start_date, employee_id) VALUES ('Promotion release','2008-11-19 12:51:58', 3);
INSERT INTO project (project_name, start_date, employee_id) VALUES ('Blacktop','2004-06-09 09:51:58', 4);
INSERT INTO project (project_name, start_date, employee_id) VALUES ('Upgrade','2009-07-09 12:51:58', 8);
INSERT INTO project (project_name, start_date, employee_id) VALUES ('Career Finder', '2005-07-09 05:51:58', 7);

INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Superviser', 'James', 'Guy', 'Male', 11191992,'20010-07-09 07:11:58' ,2);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Labor', 'Anya', 'Smith', 'Female', 08251980, '2002-07-09 05:01:08',1);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Sales', 'Jeff', 'Hovator', 'Male', 07121972, '2003-12-04 05:51:58' ,3);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Sales', 'Becca', 'Long', 'Female', 08201990, '2003-07-09 05:11:58',3);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Manager', 'Tim', 'Awesome', 'Male', 11111911, '2004-07-09 05:51:58' ,2);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Desk', 'Lizzy','Cars', 'Female', 04281989, '2005-07-09 05:51:58', 2);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('Labor', 'Candy', 'McCarthy', 'Female', 05051985, '2005-12-09 05:51:58',1);
INSERT INTO employee (job_title, first_name, last_name, gender, birth_date, hire_date, department_id) VALUES ('CEO', 'Terra', 'Decktal', 'Female', 01021900, '2006-07-09 05:51:58' ,3);
	
	





