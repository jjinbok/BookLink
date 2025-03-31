package backend.booklink.book.service;

import backend.booklink.book.domain.Book;
import backend.booklink.book.dto.BookListResponse;
import backend.booklink.book.repository.BookRepository;
import backend.booklink.book.service.mapper.BookMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    public BookListResponse getAllBook() {
        List<Book> books = bookRepository.findAll();
        return bookMapper.toBookResponse(books);
    }
}
