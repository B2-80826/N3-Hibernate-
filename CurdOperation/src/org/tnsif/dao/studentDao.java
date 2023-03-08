package org.tnsif.dao;

import org.tnsif.entities.Student;

public interface studentDao {
void addStudent(Student student);//creation

Student getStudent(int rollnumber);//retrive
Student getStudent(String studentname);//update
void removeStudent(Student student);//delete

}
