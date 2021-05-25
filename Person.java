import java.util.Date;
import java.util.Objects;

public class Person {


    private  int age;
    private String name;
    private Date dob;

    private static int count;

    public static final int SOME_VALUE = 12;

    private Address address;

    public Person(String name, int age) {
    count++;
        this.age = age;
        this.name = name;
    }


    public Person(String name) {
        count++;
        this.name = name;
    }


    public Person() {
        count++;
        this.name = "dummy name";
    }


    private void updateName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return  String.format("%s is %s old asdfs %s kefbs %s", this.name, this.age, "defd", "asddjdkah");
    }


    public int getAge() {
        return age;
    }

    public int getAge(Date date) {
        //calculate age from given date
        return age;
    }


    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        updateName(name + "bla");
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    public static Person createAdult(String name) {
        return new Person(name, 18);

    }

    public  Person createTeenager(String name) {
        return new Person(name, 13);

    }

}
