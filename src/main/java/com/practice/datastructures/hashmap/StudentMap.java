package com.practice.datastructures.hashmap;

import com.practice.dataobjects.Student;

/**
 * A HashMap that maps Names to student records. Unfinished
 *
 * @author Alex
 */
public class StudentMap {

    private Student[] students;

    private StudentMap() {
    }

    public StudentMap(int initialSize) {
        students = new Student[initialSize];

    }

    public boolean put(Student student) {
        return put(student.getName(), student);
    }

    public boolean put(String name, Student student) {
        if (name == null || student == null) {
            return false;
        }
        int hash = calculateHash(name, students.length);

        return false;
    }

    private int calculateHash(String name, int mapSize) {
        char[] nameArray = name.toCharArray();
        int arraySize = nameArray.length;

        int hash = 0;
        for (int ii = 0; ii < arraySize; ii++) {
            hash += Math.pow(nameArray[ii], ii);
        }

        return hash % mapSize;
    }

}
