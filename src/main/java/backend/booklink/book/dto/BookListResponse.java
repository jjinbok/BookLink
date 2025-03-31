package backend.booklink.book.dto;

import java.util.List;

public record BookListResponse (
    List<BookResponse> bookListResponse
){
}
