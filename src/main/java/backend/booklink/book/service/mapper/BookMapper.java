package backend.booklink.book.service.mapper;

import backend.booklink.book.domain.Book;
import backend.booklink.book.domain.Publishing;
import backend.booklink.book.dto.BookListResponse;
import backend.booklink.book.dto.BookPublishingResponse;
import backend.booklink.book.dto.BookResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookMapper {

    public BookListResponse toBookResponse(List<Book> books) {
        List<BookResponse> bookResponses = books.stream()
                .map(book -> new BookResponse(
                        book.getTitle(), book.getAuthor(), toBookPublishingResponse(book.getPublishing()), book.getDescription(), book.getPageCount()
                )).toList();

        return new BookListResponse(bookResponses);
    }

    public BookPublishingResponse toBookPublishingResponse(Publishing publishing) {
        return new BookPublishingResponse(publishing.getPublisher(), publishing.getPublishedDate(), publishing.getIsbn());
    }


}
