-- USERS
INSERT INTO users(id, name) VALUES (1, 'John');
INSERT INTO users(id, name) VALUES (2, 'Alice');

-- ORDERS
INSERT INTO orders(id, amount, user_id) VALUES (1, 250.00, 1);
INSERT INTO orders(id, amount, user_id) VALUES (2, 400.00, 1);
INSERT INTO orders(id, amount, user_id) VALUES (3, 150.00, 2);

-- CUSTOMERS
INSERT INTO customer(id, name) VALUES (1, 'Rahul');
INSERT INTO customer(id, name) VALUES (2, 'Neha');

-- ADDRESSES
INSERT INTO address(id, city, customer_id) VALUES (1, 'Mumbai', 1);
INSERT INTO address(id, city, customer_id) VALUES (2, 'Pune', 1);
INSERT INTO address(id, city, customer_id) VALUES (3, 'Delhi', 2);