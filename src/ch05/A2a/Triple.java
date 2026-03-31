package ch05.A2a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
    // 클래스 로드 시 실행
    private static Map<String,Triple> map = new HashMap<>();
    static {
        String[] names = { "ALPHA", "BETA", "GAMMA" };
        // names 배열의 각 요소마다 Triple 객체를 만들어서 map에 저장
        // Arrays.stream은 배열을 스트림으로 변환하는 메소드, forEach는 스트림의 각 요소에 대해 주어진 작업을 수행하는 메소드
        // ->는 람다 함수
        Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
    }

    private String name;

    private Triple(String name) {
        System.out.println("The instance " + name + " is created.");
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
