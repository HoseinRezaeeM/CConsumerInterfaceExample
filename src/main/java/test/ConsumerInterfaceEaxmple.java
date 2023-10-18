package test;

import java.util.List;
@SuppressWarnings("unused")
public class ConsumerInterfaceEaxmple {
    public static void addlist(List<Integer> list){
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
