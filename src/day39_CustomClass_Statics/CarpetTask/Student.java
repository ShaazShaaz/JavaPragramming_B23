package day39_CustomClass_Statics.CarpetTask;

import java.time.LocalDate;

public class Student {
    /*
    StudentTask
    1. create a class named Student that has the followings features:
                Attributes:
                    name, gender, dateOfBirth, age, studentID, grade
            Methods:
                setInfo(): sets all the attributes of the student object
                toString(): returns the full info of student Object
        2. Create a classNamed CybertekSchool
                1. create an Array of students that contains 10 Student objects
                2. print the name of the students who have a grade of B or A
                3. create two ArrayLists: femaleStudents, maleStudents
     */


    public String name;
    public char gender,grade;
    public LocalDate dateOfBirth; // we dont need age argument, cn be calculated frm dob
    public int age;
    public int studentID;

    public void setInfo(String name, char gender, char grade, LocalDate dateOfBirth, int studentID) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
        age=LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}
