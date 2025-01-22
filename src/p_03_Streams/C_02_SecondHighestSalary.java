package p_03_Streams;

import pojo.Person;
import utils.PersonUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C_02_SecondHighestSalary {

    static PersonUtils utils = new PersonUtils();

    public static void main(String[] args) {
        utils.printPersonList();
        System.out.println("==============================");
        getSecondHighestSalary(utils.getPersonList());
    }

    private static void getSecondHighestSalary(List<Person> personList) {
        Optional<Person> person = personList.stream().sorted(Comparator.comparing(Person::getSalary).reversed()).skip(1).findFirst();
        System.out.println(person);
    }

    private static void getSecondHighestSalary_2(List<Person> personList) {
        Optional<Person> person = personList.stream().max(Comparator.comparing(Person::getSalary));
        System.out.println(person);
    }
}
