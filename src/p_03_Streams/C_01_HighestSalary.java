package p_03_Streams;


import pojo.Person;
import utils.PersonUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C_01_HighestSalary {

    static PersonUtils utils = new PersonUtils();

    public static void main(String[] args) {
        utils.printPersonList();
        System.out.println("==============================");
        getHighestSalary(utils.getPersonList());
    }

    private static void getHighestSalary(List<Person> personList) {
        Optional<Person> person = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).findFirst();
        System.out.println(person.get());
    }

    private static void getHighestSalary_2(List<Person> personList) {
        Optional<Person> person = personList.stream().max(Comparator.comparing(Person::getSalary));
        System.out.println(person.get());
    }
}