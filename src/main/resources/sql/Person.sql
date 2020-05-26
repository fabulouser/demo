
-- auto Generated on 2019-11-28
-- DROP TABLE IF EXISTS person;
CREATE TABLE person(
	person_id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'personId',
	phone BIGINT (15) COMMENT 'phone',
	`name` VARCHAR (50) COMMENT 'name',
	age INT (11) COMMENT 'age',
	flag TINYINT (3) COMMENT 'flag',
	created DATETIME COMMENT 'created',
	modified DATETIME COMMENT 'modifie',
	salary DECIMAL (13,4) COMMENT '薪水',
	PRIMARY KEY (person_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'person';
