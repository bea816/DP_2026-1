package practice.ch01;

public class Book {
    private String name; // 변수(필드)

    // 생성자: 객체가 생성될 때 호출되는 메서드
    // 생성자의 이름은 클래스의 이름과 같아야 함
    // return 타입이 없음
    public Book(String name) {
        this.name = name;
    }

    // 메서드
    // getter: 객체의 상태를 반환하는 메서드
    public String getName() {
        return name;
    }
}
