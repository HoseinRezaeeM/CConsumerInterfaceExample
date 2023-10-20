package test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

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

       Predicate<Boolean> integerPredicate =Student::getAge;
       System.out.println(integerPredicate.test(20));
        Student student = new Student();
        Comparator<Student> comparator = student::compare;
        System.out.println(comparator.compare(new Student(5545), new Student(5645)));

        Student student1 = new Student() {
            @Override
            public int compare(Student o1, Student o2) {
                return student.compare(new Student(45), new Student(45));
            }

        };


        BiPredicate<Integer, String> biPredicate = (p, q) -> p.toString().equals(q);
        System.out.println(biPredicate.test(10, "10"));

    }
}
