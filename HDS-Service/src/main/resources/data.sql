DROP TABLE IF EXISTS billionaires;
 
CREATE TABLE employee_info (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO employee_info (id, first_name, last_name, career) VALUES
  (1, 'Naveen', 'Selvaraj', 'Development Manager'),
  (2, 'Vignesh', 'V', 'Developer');