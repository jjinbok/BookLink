package backend.booklink.book.service.mapper;

import backend.booklink.book.domain.Book;
import backend.booklink.book.dto.BookListResponse;
import backend.booklink.book.dto.BookResponse;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public BookListResponse toBookResponse(List<Book> books) {
        List<BookResponse> bookResponses = books.stream()
            .map(book -> new BookResponse(
                book.getTitle(), book.getAuthor(), book.getPublishingInfo(), book.getDescription(), book.getPageCount()
            )).toList();

        return new BookListResponse(bookResponses);
    }
}
