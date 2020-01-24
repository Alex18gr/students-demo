DROP TABLE IF EXISTS students;

CREATE TABLE students (
  student_id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  grade FLOAT(2),
  birth_date DATE NOT NULL
);
