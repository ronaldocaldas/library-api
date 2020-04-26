package com.caldas.ronaldo.libraryapi.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.caldas.ronaldo.libraryapi.api.dto.BookDTO;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public BookDTO create() {
		BookDTO dto = new BookDTO();
		dto.setAuthor("Author");
		dto.setTitle("My book");
		dto.setIsbn("12345");
		dto.setId(11l);
		return dto;
	}
}
