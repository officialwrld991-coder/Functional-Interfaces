import java.util.function.BiFunction;

public class NewBiFunction {

        public static void main(String[] args) {
            BiFunction<Integer, Integer, Integer> subtract = (numberOne, numberTwo) -> numberOne -  numberTwo;

            System.out.println(subtract.apply(20, 5));
        }
    }
