import java.util.function.Predicate;

public class NewPredicate {
        public static void main(String[] args) {
            Predicate<Integer> isEven = (number) -> number % 5 == 0;

            System.out.println(isEven.test(20));
            System.out.println(isEven.test(56));
        }
    }

