import java.util.List;
import java.util.function.Function;

public class FunctionalProgrammingStudy {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Joao", Gender.MALE),
                new Person("Paulo", Gender.MALE),
                new Person("Almeida", Gender.MALE),
                new Person("Miranda", Gender.FEMALE)
        );

        /*people.stream()
        .filter(person -> Gender.MALE.equals(person.gender))
        .toList().forEach(System.out::println);*/

        Function<Integer, Integer> finalResult = incrementFunction.andThen(division);

        System.out.println(finalResult.apply(6));

    }

    static Function<Integer, Integer> incrementFunction = number -> number + 1;

    static Function<Integer, Integer> division = number -> number / 2;

    static class Person {
        private final String name;
        private final Gender gender;


        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String toString() {
            return name + " " + gender;
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}