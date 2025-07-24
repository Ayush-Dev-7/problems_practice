package p_03_Streams;

import pojo.Person;
import utils.PersonUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class C_0Y_SecondHighestSalary {

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

//Output :
//Person{firstName='Ayush', lastName='Kumar', age=27, salary=55000, employeeId=1}
//Person{firstName='Anurag', lastName='Ojha', age=27, salary=450000, employeeId=2}
//Person{firstName='Siva', lastName='Nagesh', age=27, salary=35000, employeeId=3}
//Person{firstName='Gaurav', lastName='pandey', age=27, salary=85000, employeeId=4}
//Person{firstName='Ranjith', lastName='R', age=27, salary=65000, employeeId=5}
//Person{firstName='Gagan', lastName='Raj', age=27, salary=35000, employeeId=6}
//Person{firstName='Raja', lastName='Chatterjee', age=27, salary=155000, employeeId=7}
//Person{firstName='Vikas', lastName='Singh', age=27, salary=355000, employeeId=8}
//==============================
//Optional[Person{firstName='Vikas', lastName='Singh', age=27, salary=355000, employeeId=8}]