package practice.ch01;

import java.util.Iterator;

// 자식-부모 쌍이
// class - class -> extends 상속
// class - interface -> implements 인터페이스 구현
// interface - interface -> extends 상속
public class BookShelf implements Iterable<Book> {
        // 외부에서 필드 수정을 막기 위해 private으로 선언 
        private Book[] books; // 배열은 크기가 늘어날 수 X
        private int last = 0;

        // 생성자
        public BookShelf(int maxsize) {
            this.books = new Book[maxsize];
        }

        public Book getBookAt(int index) {
            return books[index];
        }

        // 책 1권을 책꽂이에 추가하는 메서드
        public void appendBook(Book book) {
            this.books[last] = book;
            last++;
        }

        public int getLength() {
            return last;
        }
        
        // 책을 하나씩 꺼내오는 반복자를 반환하는 메서드
        @Override
        public Iterator<Book> iterator() { 
            return new BookShelfIterator(this); // 인자를 현재 책꽂이 자신으로 넘겨줌
        }
        
    
}
