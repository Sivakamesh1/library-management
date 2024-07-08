package com.library.service;

import java.util.List;
import com.library.dto.BookDto;

public interface BookService {
	
	BookDto createBook(BookDto bookDto);
    List<BookDto> getAllBooks();
    BookDto borrowedBook(Long bookId, Long borrowerId);
    BookDto returnBook(Long bookId, Long borrowerId);
}
