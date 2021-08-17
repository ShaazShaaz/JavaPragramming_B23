package day44_Recap;

import day33_Methods.Str;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    /*
    PersonTask:
    private variables:
        name (String)
        gender (char and constant)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)
        public variables:
        isHuman (static boolean & constant)
        planet (static boolean & constant)
    Encapsulate all the fields (instances)
        (age cannot be set to negative)
    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)
     Extra methods:
         eat(), sleep(), drink(), toString()
ScrumTask:
    re-do the scrum task by making all the fields private
    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)
    Avoid any duplicated code fragments in each class
     */

private String name;
private char gender;
private final int age;
private final LocalDate dob;
private final String countryOfBirth;
private final String language;

    public Person(String name, char gender, LocalDate dob, String countryOfBirth, String language) {
        setName(name);
        setGender(gender);
        if (dob.isBefore(LocalDate.now())){
            this.dob = dob;
        }else {
            this.dob=null;
        }

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age=LocalDate.now().getYear()-this.dob.getYear();
    }

public static final boolean isHuman;
public static final String planet;
static {
    isHuman=true;
    planet="Earth";
}

public String getName(){
    return name;
}
public char getGender(){
    return gender;
}
public int getAge(){
    return age;
}
public LocalDate getDob(){
    return dob;
}
public String getLanguage(){
    return language;
}
public String getCountryOfBirth(){
    return countryOfBirth;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
    if (!(gender=='M' || gender=='F' || gender=='m' || gender=='f')){
        return;
    }
        this.gender = gender;
    }

public void eat(String food){
    System.out.println(name+" is eating "+food);
}
public void drink(String drink){
    System.out.println(name+" is drinking "+drink );
}
public void sleep(int hours){
    System.out.println(name+" sleeps "+hours+" hours a day");
}

    public String toString() {
        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dob=" + dob.format(df) +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
