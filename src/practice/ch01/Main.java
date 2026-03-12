package practice.ch01;

import java.util.Iterator;

public class Main { // 메인메서드를 제공하는 클라이언트
    public static void main(String[] args) {
        // 책 테스트
        Book book = new Book("Java Programming"); // 책 생성
        System.out.println("Book name: " + book.getName()); // 책 이름 출력

        // 책장 테스트
        BookShelf bookShelf = new BookShelf(5); // 책장 생성
        bookShelf.appendBook(new Book("Java Programming")); // 책장에 책 추가
        bookShelf.appendBook(new Book("Python Programming"));
        bookShelf.appendBook(new Book("C++ Programming"));

        // 책장에 있는 책 출력
        // 방법1: 책꽂이에 클라이언트가 직접 접근해서 책을 꺼내는 방식
        System.out.println("Books in the bookshelf:");
        for (int i = 0; i < bookShelf.getLength(); i++) { 
            System.out.println("- " + bookShelf.getBookAt(i).getName());
        }

        // 방법2: 책꽂이에 반복자를 만들어서 책을 꺼내는 방식
        System.out.println("\nBooks in the bookshelf (using iterator):");
        Iterator<Book> it = bookShelf.iterator(); // 책꽂이에서 반복자 얻기
        while (it.hasNext()) { // 반복자를 사용해서 책이 남아있는 동안 반복
            System.out.println("- " + it.next().getName()); // 반복자로 책을 꺼내서 이름 출력
        }

        // 방법3: 책꽂이에 반복자를 만들어서 책을 꺼내는 방식 (for-each문 사용)
        // 형식: for (요소타입 변수명 : 컬렉션) { ... }
        for (Book b : bookShelf) { // Iterable 인터페이스를 구현했기 때문에 for-each문 사용 가능
            System.out.println("- " + b.getName());
        }
    }
    
}
