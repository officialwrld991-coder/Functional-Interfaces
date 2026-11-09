import java.util.function.UnaryOperator;

public class NewUnaryOperator {

        public static void main(String[] args) {
            UnaryOperator<String> shout = (name) -> name.toLowerCase() + "!!";

            System.out.println(shout.apply("BRWNBOI"));
        }
    }

