package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 방법1 comparator: functional interface를 구현하는 코드 직접 작성
        // 인터페이스는 new 할 수 X but
        list.sort(new Comparator<String>() {
            @Override // Comparator 인터페이스는 functional interface
            public int Compare(String s1, String s2) {
                return s1.compareTo(s2); // s1이 s2보다 사전순으로 앞에 있으면 음수, 같으면 0, 뒤에 있으면 양수 반환
            }
        }); // 오름차순을 위한 Comparator를 넣어줌
        System.out.println(list);

        // 방법2 람다 함수
        // 오름차순 정렬
        list.sort((s1, s2) -> s1.compareTo(s2)); 

        // 사전순으로 큰 순서(내림차순)
        list.sort(new Comparator<String>() {
            @Override
            public int Compare(String s1, String s2) {
                return s2.compareTo(s1); // s2가 s1보다 사전순으로 앞에 있으면 음수, 같으면 0, 뒤에 있으면 양수 반환
            }
        });  // 내림차순을 위한 Comparator를 넣어줌
        System.out.println(list);
    }
}
