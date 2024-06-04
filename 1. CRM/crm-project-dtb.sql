create database crm;
use crm;
 
create table Employees(
	id int primary key auto_increment not null,
    username varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    phone int not null,
    create_at timestamp default current_timestamp
);

create table Roles(
	id int auto_increment primary key,
    role_name varchar(255) not null unique
);

create table Employee_roles(
	employee_id int,
    role_id int,
    PRIMARY KEY (employee_id, role_id),
    FOREIGN KEY (employee_id) REFERENCES employees(id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES roles(id) ON DELETE CASCADE
);

create table Projects(
	id int primary key auto_increment not null,
    project_name varchar(255) not null,
    start_date datetime,
    end_date datetime
);

create table Tasks(
	task_id int primary key auto_increment not null,
    project_id int,
    employee_id int,
    task_name varchar(255) not null,
    start_date date,
    end_date date,
    create_at timestamp default current_timestamp,
    update_at timestamp default current_timestamp,
    status ENUM('Đã hoàn thành', 'Đang thực hiện', 'Chưa Bắt Đầu') DEFAULT 'Chưa Bắt Đầu',
    FOREIGN KEY (project_id) REFERENCES projects(id) ON DELETE CASCADE,
    FOREIGN KEY (employee_id) REFERENCES employees(id) ON DELETE SET NULL
);


TRUNCATE TABLE roles;
-- Data Set --
-- Thêm dữ liệu vào bảng roles
-- Bảng employees
INSERT INTO employees (username, email, password, phone) VALUES
('Lê Tất Định', 'dinhlt2701@example.com', "123456", 0987654321),
('Tất Định', 'dinhvippro002@example.com', "123456", 0978645312),
('Định', 'dinh123456@example.com', "123456", 0123456789);

-- Bảng roles
INSERT INTO roles (role_name) VALUES
('Admin'),
('Manager'),
('Developer');

-- Bảng employee_roles
INSERT INTO employee_roles (employee_id, role_id) VALUES
(1, 1),
(2, 2),
(3, 3),
(1, 3), -- user1 cũng có vai trò Developer
(2, 3); -- user2 cũng có vai trò Developer

-- Bảng projects
INSERT INTO projects (project_name, start_date, end_date) VALUES
('Project A', '2024-01-01 08:00:00', '2024-06-01 17:00:00'),
('Project B', '2024-02-01 08:00:00', '2024-07-01 17:00:00'),
('Project C', '2024-03-01 08:00:00', '2024-08-01 17:00:00');

-- Bảng tasks
INSERT INTO tasks (project_id, employee_id, task_name, start_date, end_date, status) VALUES
(1, 1, 'Task 1 for Project A', '2024-01-02', '2024-01-15', 'Chưa Bắt Đầu'),
(1, 2, 'Task 2 for Project A', '2024-01-16', '2024-02-15', 'Đang thực hiện'),
(2, 1, 'Task 1 for Project B', '2024-02-02', '2024-03-01', 'Đã hoàn thành'),
(2, 3, 'Task 2 for Project B', '2024-03-02', '2024-04-01', 'Chưa Bắt Đầu'),
(3, 3, 'Task 1 for Project C', '2024-04-02', '2024-05-01', 'Đang thực hiện'),
(3, 2, 'Task 2 for Project C', '2024-05-02', '2024-06-01', 'Đã hoàn thành');
