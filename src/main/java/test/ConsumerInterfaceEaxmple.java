package test;

import java.util.List;
@SuppressWarnings("unused")
public class ConsumerInterfaceEaxmple {
    public static Integer addlist(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }
    public static String addList(List<String> stringList){
        return stringList.toString();
    }
    public static Boolean chekAge(int age){
        return age > 10;
    }
}
