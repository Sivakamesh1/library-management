package com.library;

import com.library.dto.BookDto;
import com.library.exception.AlreadyExistException;
import com.library.mapper.LibraryMapper;
import com.library.model.Book;
import com.library.repository.BookRepository;
import com.library.repository.BorrowerRepository;
import com.library.service.impl.BookServiceImpl;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class LibraryManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}
	@InjectMocks
	private BookServiceImpl service;

	@Mock
	private BookRepository bookRepository;

	@Mock
	private BorrowerRepository borrowerRepository;

	@Mock
	private LibraryMapper mapper;

	@Test
	void testCreateBook(){
		Mockito.when(bookRepository.findByIsbn(Mockito.anyString())).thenReturn(Collections.emptyList());
		Mockito.when(bookRepository.save(Mockito.any())).thenReturn(getBook());
		Mockito.when(mapper.buildBookDtoFromEntity(Mockito.any())).thenReturn(getBookDto());
		BookDto bookDto = service.createBook(getBookDto());
		Assertions.assertEquals("RNR", bookDto.getAuthor());
		Assertions.assertEquals("CORE JAVA2", bookDto.getTitle());
		Assertions.assertEquals("12345", bookDto.getIsbn());
		Mockito.verify(bookRepository, Mockito.times(1)).findByIsbn(Mockito.anyString());
		Mockito.verify(bookRepository, Mockito.times(1)).save(Mockito.any());
	}

	@Test
	void testCreateBookThrowAlreadyExistException(){
		Mockito.when(bookRepository.findByIsbn(Mockito.anyString())).thenReturn(Collections.singletonList(getBook()));
		BookDto bookDto = getBookDto();
		bookDto.setAuthor("Test");
		Assertions.assertThrows(AlreadyExistException.class, ()->service.createBook(bookDto));

	}

	private BookDto getBookDto(){
		return BookDto.builder().author("RNR").title("CORE JAVA2").isbn("12345").build();
	}

	private Book getBook(){
		return Book.builder().author("RNR").title("CORE JAVA2").isbn("12345").id(12345L).build();
	}

}
