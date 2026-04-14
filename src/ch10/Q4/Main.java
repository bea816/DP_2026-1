package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");


        // 인터페이스는 new 할 수 X but
        list.sort(new Comparator<String>() {
            @Override
            public int Compare(String s1, String s2) {
                
            }
        }); // 오름차순을 위한 Comparator를 넣어줌
        System.out.println(list);

        // 사전순으로 큰 순서(내림차순)
        list.sort(/*미구현 */); // 내림차순을 위한 Comparator를 넣어줌
        System.out.println(list);
    }
}
