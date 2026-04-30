import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

  
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 22));
        persons.add(new Person("Charlie", 30));
        System.out.println("Original ArrayList: " + persons);

      
        Collections.sort(persons);
        System.out.println("\nArrayList after sorting by age (Comparable): " + persons);

        
        Collections.sort(persons, new PersonNameComparator());
        System.out.println("\nArrayList after sorting by name (Comparator): " + persons);
    }
}
