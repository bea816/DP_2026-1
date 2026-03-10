package practice.ch01;

public class Main { // 메인메서드를 제공하는 클라이언트
    public static void main(String[] args) {
        Book book = new Book("Java Programming"); // 책 생성
        System.out.println("Book name: " + book.getName()); // 책 이름 출력
    }
    
}
