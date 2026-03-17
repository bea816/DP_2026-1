package hw.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookShelfYearReverseIterator implements Iterator<Book> {
    private List<Book> sortedBooks; // 정렬된 책들을 담을 리스트
    private int index;

    public BookShelfYearReverseIterator(BookShelf bookShelf) {
        this.sortedBooks = new ArrayList<>();
        
        // BookShelf에 있는 모든 책을 List로 복사
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i));
        }
        
        // 출판연도 기준 내림차순으로 정렬
        sortedBooks.sort((book1, book2) -> Integer.compare(book2.getYear(), book1.getYear()));
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = sortedBooks.get(index);
        index++;
        return book;
    }
}