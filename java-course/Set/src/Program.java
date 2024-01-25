import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Number> course = new HashSet<>();
        System.out.print("How many students for course A? ");
        int optionA = sc.nextInt();
        inputCourse(sc, optionA, course);
        System.out.print("How many students for course B? ");
        int optionB = sc.nextInt();
        inputCourse(sc, optionB, course);
        System.out.print("How many students for course C? ");
        int optionC = sc.nextInt();
        inputCourse(sc, optionC, course);

        

    }

    public static void inputCourse(Scanner sc, int option, Set<Number> set) {
        for (int i = 0; i < option; i++) {
            set.add(sc.nextInt());
        }
    }



}