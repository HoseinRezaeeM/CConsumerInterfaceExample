package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList =new ArrayList<>();
        integerList.add(50);
        integerList.add(20);
        integerList.add(40);

        Consumer<List<Integer>> consumer =ConsumerInterfaceEaxmple::addlist;
        System.out.print("Sum total : ");
        consumer.accept(integerList);

    }
}
