import java.util.function.BiPredicate;

public class NewBiPredicate {
        public static void main(String[] args) {
            BiPredicate<String, Integer> isLongerThan = (name, count) -> name.length() > count;

            System.out.println(isLongerThan.test("semicolon", 10));
            System.out.println(isLongerThan.test("java", 5));
        }
    }

