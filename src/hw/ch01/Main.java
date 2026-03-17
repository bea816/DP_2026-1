package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220753, 이름: 김나영"); // 과제 제출 Main 클래스에 학번과 이름을 출력하는 코드 추가

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 장르 필터
        System.out.println("=== 장르 필터 테스트 (장르: 소설) ===");
        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");
        while (genreIt.hasNext()) {
            Book book = genreIt.next();
            System.out.println("제목: " + book.getName() + 
                                "/ 장르: " + book.getGenre() + 
                                "/ 출판연도: " + book.getYear() + "년" +
                                "/ 가격: " + (int)book.getPrice() + "원");
        }
        System.out.println();

        // 출판연도 역순
        System.out.println("=== 출판연도 역순 테스트 ===");
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            if ("소설".equals(book.getGenre())) {
                System.out.println("제목: " + book.getName() + 
                                    "/ 장르: " + book.getGenre() + 
                                    "/ 출판연도: " + book.getYear() + "년" +
                                    "/ 가격: " + (int)book.getPrice() + "원");
            }
        }
        System.out.println();
    }
}
