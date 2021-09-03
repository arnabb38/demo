DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    	id varchar(128) NOT NULL,
    	name varchar(128) NOT NULL,
    	date_of_birth date NOT NULL,
    	email varchar(128),
    	password varchar(128)
);

INSERT INTO employee VALUES (1, 'arnab1234', '2021-01-01',  'AJDSI@DJSAI.COM', 'ASDF1234'),
(2, 'arnab1234', '2021-01-01',  'AJDSI@DJSAI.COM', 'ASDF1234'),
(3, 'arnab1234', '2021-01-01',  'AJDSI@DJSAI.COM', 'ASDF1234');