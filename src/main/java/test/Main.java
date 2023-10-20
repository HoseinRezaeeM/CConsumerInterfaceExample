package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(50);
//        integerList.add(20);
//        integerList.add(40);
//        List<String> stringList = new ArrayList<>();
//        stringList.add("SAra");
//        stringList.add("fatemeh");
//        stringList.add("negin");
//
//        Consumer<List<Integer>> listConsumer = (integer) -> {
//            ConsumerInterfaceEaxmple.addlist(integerList);
//        };
//        listConsumer.accept(integerList);
//
//        Consumer<List<Integer>> consumer = ConsumerInterfaceEaxmple::addlist;
//        System.out.print("Sum total : ");
//        consumer.accept(integerList);
//
//        Function<List<Integer>, Integer> integerFunction = (Liist) -> {
//            ConsumerInterfaceEaxmple.addlist(integerList);
//            return null;
//        };
//        integerFunction.apply(integerList);
//        Function<List<Integer>, Integer> function = ConsumerInterfaceEaxmple::addlist;
//        Function<List<String>, String> function1 = ConsumerInterfaceEaxmple::addList;
//        System.out.println(function1.apply(stringList));
//        System.out.println(function.apply(integerList));
//
//        Consumer<String> stringConsumer = (p) -> {
//            System.out.println(p.length());
//        };
//        stringConsumer.accept("Hi how are you my name is hosin rezaei i am Java back-end developer");
//        Predicate<Integer> predicate = ConsumerInterfaceEaxmple::chekAge;
//        Boolean b = predicate.test(9);
//        System.out.println(b);
//
//        Predicate<String> predicate1 = (p) -> p.length() > 100;
//        System.out.println(predicate1.test("dsffdfsfsdffd"));
//
//        Consumer<Student> studentConsumer = Student::new;
//        studentConsumer.accept(new Student(1, "hosein"));
//

//        String s = "dzfgc";
//        Predicate<String> predicate2 = String::isEmpty;
//        System.out.println(predicate2.test(s));
//
//        Predicate<String> predicate =(p)->p.isEmpty();
//        System.out.println(predicate.test(s));
//
//        Predicate<String> stringPredicate=(p)->p.startsWith("A");
//        System.out.println(stringPredicate.test("Ali"));
//
//        Predicate<Integer> integerPredicate =(p)->p>18;
//        System.out.println(integerPredicate.test(20));

//       Predicate<Boolean> integerPredicate =Student::getAge;
//       System.out.println(integerPredicate.test(20));
         // Q9
////        BiPredicate<Integer, String> biPredicate = (p, q) -> p.toString().equals(q);
////        System.out.println(biPredicate.test(10, "10"));

        //Q10
//        Student student = new Student();
//        Comparator<Student> comparator = student::compare;
//        System.out.println(comparator.compare(new Student(54), new Student(45)));
//
//        Student student1 = new Student() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return student.compare(new Student(45), new Student(45));
//            }
//
//        };

        //Q11
        Supplier<LocalDate> dateSupplier = LocalDate::now;
        System.out.println(dateSupplier.get());

        //Q12
        Function<Integer,String> function =Integer::toHexString;
        System.out.println(function.apply(5));

        Function<Integer,String> stringFunction=(a)->{return Integer.toHexString(a);};
        System.out.println(stringFunction.apply(10));

        //Q13
        Function<Character,Integer> integerFunction = Character::getNumericValue;
        System.out.println(integerFunction.apply('a'));

        Function<Character,Integer> integerFunction1 =(a)->{ return Character.getNumericValue(a);};
        System.out.println(integerFunction.apply('a'));

        //Q14
        BiFunction<String,String,Person> biFunction =(a,b)-> new Person(a,b);
        System.out.println(biFunction.apply("Shayan", "Samyaree"));

        BiFunction<String,String,Person> biFunction2 = Person::new;
        System.out.println(biFunction.apply("Shayan", "Samyaree"));

        //Q15
        Factory factory = Person::new;
        Person person =factory.create("AmirHosein","Hosein");
        System.out.println(person);

        //Q16
        Supplier<Car> supplier =()->new Car("bmw","red",15000);
        Supplier<Car> supplier1 =()->new Car("benz","black",25000);
        Supplier<Car> supplier2 =()->new Car("toyota","Green",1000);
        System.out.println(supplier.get());
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

        //Q16
        List<Car> carList =new ArrayList<>();
        carList.add(new Car("bmw","red",1205000));
        carList.add(new Car("benz","red",10000));
        carList.add(new Car("rangovor","red",150000));
        carList.add(new Car("toyota","red",107800));
        carList.add(new Car("bently","blue",1878000));

        carList.stream().filter((a)-> a.getPrice() > 1000000).forEach(System.out::println);

        //Q17
        carList.stream().filter((a)->a.getPrice()>1000000).sorted((a,b)->b.getPrice()-a.getPrice()).forEach(System.out::println);

        //Q18
        carList.stream().filter((s)->s.getColor().equals("red")).forEach(System.out::println);

        //Q19
        carList.stream().filter((s)->s.getColor().equals("blue")).filter((a)->a.getPrice()>1000000).forEach(System.out::println);

        //Q20
        carList.stream().filter((s)->s.getColor().equals("red")).filter((a)->a.getPrice()>1000000).limit(3).forEach(System.out::println);

        //Q21
        carList.stream().map(Car::getColor).collect(Collectors.toList()).forEach(System.out::println);

        //Q22
         long red = carList.stream().filter((s) -> s.getColor().equals("red")).count();
        System.out.println(red);

        //Q23
         Optional<Integer> red1 = carList.stream().filter((s) -> s.getColor().equals("red")).map(Car::getPrice).reduce(Integer::sum);
         red1.ifPresent(System.out::println);

         //Q24

        IntStream intStream =IntStream.range(0,1000);
        intStream.filter((a)->a%2==0).forEach(System.out::println);

        //Q25
        IntStream intStream1 =IntStream.range(0,100);
        intStream1.filter((number)-> {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }).forEach(System.out::println);

        //Q26
        //Optional


    }

}
