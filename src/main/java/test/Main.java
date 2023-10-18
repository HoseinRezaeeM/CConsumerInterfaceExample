package test;

import java.util.ArrayList;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList =new ArrayList<>();
        integerList.add(50);
        integerList.add(20);
        integerList.add(40);
        List<String> stringList =new ArrayList<>();
        stringList.add("SAra");
        stringList.add("fatemeh");
        stringList.add("negin");

        Consumer<List<Integer>> listConsumer =(integer) -> {
            ConsumerInterfaceEaxmple.addlist(integerList);
        };
        listConsumer.accept(integerList);

        Consumer<List<Integer>> consumer =ConsumerInterfaceEaxmple::addlist;
        System.out.print("Sum total : ");
        consumer.accept(integerList);

        Function<List<Integer> ,Integer> integerFunction =(Liist) -> {ConsumerInterfaceEaxmple.addlist(integerList);
            return null;
        };
        integerFunction.apply(integerList);
        Function<List<Integer>, Integer> function =ConsumerInterfaceEaxmple::addlist;
        Function<List<String>,String> function1 =ConsumerInterfaceEaxmple::addList;
        System.out.println(function1.apply(stringList));
        System.out.println(function.apply(integerList));

        Consumer<String> stringConsumer =(p)->{
            System.out.println(p.length());
        };
        stringConsumer.accept("Hi how are you my name is hosin rezaei i am Java back-end developer");

    }
}
