package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;
    private String targetGenre; // 찾고자 하는 장르

    // 생성자에서 BookShelf와 찾을 장르를 함께 받음
    public BookShelfGenreIterator(BookShelf bookShelf, String targetGenre) {
        this.bookShelf = bookShelf;
        this.index = 0;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre() != null && book.getGenre().equals(targetGenre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}