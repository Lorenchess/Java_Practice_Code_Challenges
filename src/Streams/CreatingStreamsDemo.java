package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    /*  public static void show(){
        int[] numbers = {1,2,3,4,5};
         Arrays.stream(numbers)
                 .forEach(System.out::println);
         System.out.println("----------");

         Stream.of(10,20,30).forEach(e -> System.out.println(e));
         System.out.println("----------");

         var stream = Stream.generate(Math::random); //generates 3 random numbers
         stream.limit(3).forEach(System.out::println);
         System.out.println("----------");

         Stream.iterate(1, n -> n * 2).limit(5).forEach(System.out::println);
     }
    */
    public static void showMovies(){
        var movies = List.of(
                new Movies("a", 10),
                new Movies("b", 20),
                new Movies("c", 30),
                new Movies("d", 40),
                new Movies("e", 50),
                new Movies("f", 10)
        );

       movies.stream().map(movie -> movie.getTitle()).forEach(System.out::println);
        System.out.println("--------------");

       movies.stream().mapToInt(movie -> movie.getLikes()).forEach(System.out::println);
        System.out.println("--------------");

       movies.stream().filter(movie -> movie.getLikes() > 10).forEach(System.out::println);
        System.out.println("--------------");

        //Some cases we have two string Objects...
        var stream = Stream.of(List.of(1,2,3), List.of(4,5,6));
        var stream1 = Stream.of(List.of(1,2,3), List.of(4,5,6));
            stream.forEach(list -> System.out.println(list)); //[1, 2, 3] [4, 5, 6] now to flat this list we use the flatMap

        stream1.flatMap(list -> list.stream()).forEach(System.out::print);
        System.out.println("\n-----------------");

        Predicate<Movies> isPopular = m -> m.getLikes() == 10;
        movies.stream().filter(isPopular).forEach(System.out::println);

        System.out.println("\n-----------------");

        movies.stream().takeWhile(movie -> movie.getLikes() < 40).forEach(System.out::println);
        //The difference between takeWhile and filter is that the filter loops over the entire collection
        // while takeWhile stops as soon as the condition is false.

        System.out.println("------------------------");
        movies.stream().sorted(Comparator.comparing(Movies::getTitle)).sorted();
    }
    public static void showNewMovies(){
        var newMovies = List.of(
                new NewMovies("Harry Potter", 50),
                new NewMovies("Beauty & Beast", 20),
                new NewMovies("Pegasus", 60),
                new NewMovies("Anaconda", 40)
        );
        System.out.println("Another method call ...");
        newMovies.stream().sorted(Comparator.comparing(NewMovies::getName)).forEach(System.out::println);
        System.out.println("------------------");

        newMovies.stream().sorted(Comparator.comparing(NewMovies::getName).reversed()).forEach(System.out::println);
        System.out.println("------------------");

        var result = newMovies.stream()
                .max(Comparator.comparing(NewMovies::getLikes))
                .get();
        System.out.println("New Movie with max number of likes: " + result.getName());
        System.out.println("============");

        Optional<Integer> sum = newMovies.stream()
                .map(NewMovies::getLikes)
                .reduce(Integer::sum);
                //.reduce((current, accumulator) -> current + accumulator);
        System.out.println(sum.orElse(0)); //170 the sum of all likes, we used orElse to supply a default value.
        System.out.println("---------");

        Integer sum1 = newMovies.stream()
                .map(NewMovies::getLikes).reduce(0,Integer::sum);
        System.out.println(sum1); //170
        System.out.println("---------------");

        var resMap = newMovies.stream()
                                                .filter(m -> m.getLikes() > 40)
                .collect(Collectors.toMap(NewMovies::getName, NewMovies::getLikes));
        System.out.println(resMap);
        System.out.println("-------------");

        IntStream.rangeClosed(1,5).forEach(System.out::println);

    }
}
