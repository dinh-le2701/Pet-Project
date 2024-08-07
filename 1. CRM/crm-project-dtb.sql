create database crm;
use crm;
 
-- Employee 
create table Employee(
	id int primary key auto_increment not null,
    username varchar(50) not null,
    email varchar(100) not null,
    password varchar(100) not null, 
    phone varchar(15) not null,
    create_at datetime
);
insert into Employee(username, email, password, phone, create_at) values ("Lê Tất Định", "dinhprococoa@gmail.com", 222, "0943483739", "2024-08-05");
insert into Employee(username) values ("Định");

-- Role 
create table Role(
	id int auto_increment primary key,
    role_name varchar(100) not null unique,
    description text
);
insert into Role(role_name, description) values ("ADMIN", "Quản trị hệ thống");

-- Project
create table Project(
	id int primary key auto_increment not null,
    project_name varchar(100) not null,
    start_date datetime,
    end_date datetime
);
insert into Project(project_name, start_date, end_date) values ("CRM", "2024-06-04", "2024-08-08");
-- Bảng projects
INSERT INTO project (project_name, start_date, end_date) VALUES
('Project A', '2024-01-01 08:00:00', '2024-06-01 17:00:00'),
('Project B', '2024-02-01 08:00:00', '2024-07-01 17:00:00'),
('Project C', '2024-03-01 08:00:00', '2024-08-01 17:00:00');

create table Task(
	id int primary key auto_increment not null,
    task_name varchar(255) not null,
    start_date date,
    end_date date,
    create_at datetime,
    update_at datetime,
    status VARCHAR(50),
    employee_id int,
    project_id int,
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);
insert into Task(task_name, start_date, end_date, create_at, status) values ("UI", "2024-06-04", "2024-06-08", "2024-08-08", "2024-08-08", "ĐANG_THỰC_HIỆN");
-- Bảng tasks
INSERT INTO task (task_name, start_date, end_date, create_at, status) VALUES
('Task 1 for Project A', '2024-01-02', '2024-01-15', "2024-02-25" , 'Chưa Bắt Đầu'),
('Task 2 for Project A', '2024-01-16', '2024-02-15', "2024-02-26", 'Đang thực hiện'),
('Task 1 for Project B', '2024-02-02', '2024-03-01', "2024-04-13", 'Đã hoàn thành'),
('Task 2 for Project B', '2024-03-02', '2024-04-01', "2024-04-17", 'Chưa Bắt Đầu'),
('Task 1 for Project C', '2024-04-02', '2024-05-01', "2024-08-25", 'Đang thực hiện'),
('Task 2 for Project C', '2024-05-02', '2024-06-01', "2024-08-05", 'Đã hoàn thành');

CREATE TABLE Employee_Project (
    employee_id INT,
    project_id INT,
    PRIMARY KEY (employee_id, project_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (project_id) REFERENCES Project(id)
);

CREATE TABLE Employee_Role (
    employee_id INT,
    role_id INT,
    PRIMARY KEY (employee_id, role_id),
    FOREIGN KEY (employee_id) REFERENCES Employee(id),
    FOREIGN KEY (role_id) REFERENCES Role(id)
);




TRUNCATE TABLE roles;
-- Data Set --
-- Thêm dữ liệu vào bảng roles
-- Bảng employees
INSERT INTO employee (username, email, password, phone) VALUES
('Lê Tất Định', 'dinhlt2701@example.com', "123456", 0987654321),
('Tất Định', 'dinhvippro002@example.com', "123456", 0978645312),
('Định', 'dinh123456@example.com', "123456", 0123456789);

-- Bảng roles
INSERT INTO role (role_name, description) VALUES
('Developer', "Phát triển dự án");

-- Bảng employee_roles
INSERT INTO employee_role (employee_id, role_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(1, 3), -- user1 cũng có vai trò Developer
(2, 3); -- user2 cũng có vai trò Developer




