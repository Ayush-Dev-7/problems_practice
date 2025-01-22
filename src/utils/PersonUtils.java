package utils;

import pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonUtils {

    List<Person> personList;

    public PersonUtils() {
        personList = new ArrayList<>();

        personList.add(new Person("Ayush", "Kumar", 27, 55000, 1));
        personList.add(new Person("Anurag", "Ojha", 27, 450000, 2));
        personList.add(new Person("Siva", "Nagesh", 27, 35000, 3));
        personList.add(new Person("Gaurav", "pandey", 27, 85000, 4));
        personList.add(new Person("Ranjith", "R", 27, 65000, 5));
        personList.add(new Person("Gagan", "Raj", 27, 35000, 6));
        personList.add(new Person("Raja", "Chatterjee", 27, 155000, 7));
        personList.add(new Person("Vikas", "Singh", 27, 355000, 8));
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void printPersonList(){
        for(Person p : personList){
            System.out.println(p);
        }
    }
}
