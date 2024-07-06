package com.epam.mjc;

import java.lang.IllegalArgumentException;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    Student student;
    try {  
      student = Student.getValueOf(studentID);
    } catch(IllegalArgumentException illegalArgumentException) {
        throw new CustomException(studentID);
    }
    return student;
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      Student student = manager.find(IDs[i]);
      System.out.println("Student name " + student.getName());
    }

  }
}
