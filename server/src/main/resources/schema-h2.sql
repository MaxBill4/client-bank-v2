DROP TABLE IF EXISTS employers, accounts, customers;

CREATE TABLE public.accounts (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               number VARCHAR(250) NOT NULL,
                               currency VARCHAR(250) NOT NULL,
                               balance DOUBLE NOT NULL,
                               customer_id INT
);

CREATE TABLE public.customers (
                                 id INT AUTO_INCREMENT  PRIMARY KEY,
                                 name VARCHAR(250) NOT NULL,
                                 email VARCHAR(250) NOT NULL,
                                 age INT NOT NULL,
                                 employer_id INT,
                                 account_id INT
);

CREATE TABLE public.employers (
                                  id INT AUTO_INCREMENT  PRIMARY KEY,
                                  name VARCHAR(250) NOT NULL,
                                  address VARCHAR(250) NOT NULL,
                                  customer_id INT
);