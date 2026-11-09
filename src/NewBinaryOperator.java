import java.util.function.BinaryOperator;

public class NewBinaryOperator {

        public static void main(String[] args) {
            BinaryOperator<Integer> multiply = (numberOne, numberTwo) -> numberOne * numberTwo;

            System.out.println(multiply.apply(5, 5));
        }
    }

