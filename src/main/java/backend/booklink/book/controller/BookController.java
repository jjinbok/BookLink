package backend.booklink.book.controller;

import backend.booklink.book.dto.BookListResponse;
import backend.booklink.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/book")
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    public BookListResponse getAllBook() {
        return bookService.getAllBook();
    }


}
