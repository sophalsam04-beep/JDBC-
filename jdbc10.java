    // ===================================
    //          Store Function
    // ===================================
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class jdbc10{
    public static void main(String[] args) {
            // 1. store function as variable
        // ===================
        // Function<T, R>
        // ===================
        Function<Integer, Integer> square = (n) -> n * n;

                // call it later
            System.out.println(square.apply(5));


            // ================
            // 2. Consumer<T>
            // ================

        Consumer<String> printer = (name) -> System.out.println("Hello : "+name);
        Consumer<Integer> result = (number) -> System.out.println("Result : "+number);

        // object to applying
            printer.accept("Sophal");
            printer.accept("Sopheak");
            result.accept(10);
            result.accept(20);
            result.accept(100);


                // ==================
                //      Supplier
                // ==================

        Supplier<String> greeting = () -> "Greeting welcome...!";
        Supplier<Integer> caculating = ()-> 10+10;
            System.out.println("Greeting : "+greeting.get());
            
            System.out.println("Caculating result : "+caculating.toString());




            // ==================
            //     predicate
            // ==================
        
            Predicate<Integer> isEven = (a) -> a % 2 == 0;
            Predicate<Integer> isOdd = (b) -> b % 2 ==0;
        System.out.println("is Even : "+isEven.test(4));
        System.out.println("is odd : "+isOdd.test(5));

    
        


    }
}
