package Course.Course1.Lessons.AddLesson;

import java.util.Random;

public class PersonApp {
    public static void main(String[] args) {
        Random random = new Random();

        Person person = Person.builder().withName("Person").withAge(random.nextInt(70)).build();
        person.info();
        System.out.println();

        Person[] persons = new Person[10];

        for (int i = 0; i < persons.length; i++) {
            Person.Builder builder = new Person.Builder();
            builder.withName("Person" + i).withAge(random.nextInt(70));
            if (i % 3 == 0) {
                builder.withSalary(random.nextInt(1000));
            }
            persons[i] = builder.build();
        }
        for (Person person1 : persons) {
            if (person1.getAge() < 40) {
                continue;
            }
            person1.info();
        }
    }
}
