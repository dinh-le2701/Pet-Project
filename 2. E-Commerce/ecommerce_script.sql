create database ecommerce;
use ecommerce;

create table Categories (
	categories_id int primary key auto_increment,
    category_name varchar(255) not null unique
);
create table Products(
	id int primary key auto_increment not null,
    product_name varchar(255) not null,
    images varchar(100) ,
    price double,
    description TEXT not null,
    quantity int,
    categories_id int,
    CONSTRAINT fk_categories
        FOREIGN KEY (categories_id)
        REFERENCES Categories(categories_id)
);
truncate table products;

-- thêm dữ liệu mẫu -- 
INSERT INTO Categories (category_name) VALUES ('Pastries'), ('Cookies'), ('Doughnuts');
INSERT INTO Products (product_name, images, price, description, quantity, categories_id) VALUES 
-- Pastries
('Croissant', 'images/croissant.jpg', 2.50, 'Buttery and flaky croissant', 30, (SELECT categories_id FROM Categories WHERE category_name = 'Pastries')),
('Danish Pastry', 'images/danish_pastry.jpg', 3.00, 'Sweet and soft Danish pastry', 20, (SELECT categories_id FROM Categories WHERE category_name = 'Pastries')),
('Eclair', 'images/eclair.jpg', 4.00, 'Chocolate-filled eclair', 15, (SELECT categories_id FROM Categories WHERE category_name = 'Pastries')),

-- Cookies
('Chocolate Chip Cookie', 'images/chocolate_chip_cookie.jpg', 1.50, 'Classic chocolate chip cookie', 50, (SELECT categories_id FROM Categories WHERE category_name = 'Cookies')),
('Oatmeal Raisin Cookie', 'images/oatmeal_raisin_cookie.jpg', 1.75, 'Oatmeal cookie with raisins', 40, (SELECT categories_id FROM Categories WHERE category_name = 'Cookies')),
('Peanut Butter Cookie', 'images/peanut_butter_cookie.jpg', 2.00, 'Soft peanut butter cookie', 35, (SELECT categories_id FROM Categories WHERE category_name = 'Cookies')),

-- Doughnuts
('Glazed Doughnut', 'images/glazed_doughnut.jpg', 2.00, 'Classic glazed doughnut', 25, (SELECT categories_id FROM Categories WHERE category_name = 'Doughnuts')),
('Chocolate Doughnut', 'images/chocolate_doughnut.jpg', 2.50, 'Doughnut topped with chocolate', 20, (SELECT categories_id FROM Categories WHERE category_name = 'Doughnuts')),
('Sugar Doughnut', 'images/sugar_doughnut.jpg', 1.75, 'Doughnut coated with sugar', 30, (SELECT categories_id FROM Categories WHERE category_name = 'Doughnuts'));
