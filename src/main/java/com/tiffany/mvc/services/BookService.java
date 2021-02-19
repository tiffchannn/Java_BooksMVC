package com.tiffany.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.tiffany.mvc.models.Book;
import com.tiffany.mvc.repos.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
//    // update a book
//    public Book updateBook(Long id, 
//				    		String title,
//				    		String description, 
//				    		String language, 
//				    		Integer numberOfPages) {
//    	Book b = findBook(id);
//    	if (b != null) {
//    		b.setTitle(title);
//    		b.setDescription(description);
//    		b.setLanguage(language);
//    		b.setNumberOfPages(numberOfPages);
//    		bookRepository.save(b);
//    	}
//    	return null;
//    }
    
    public Book updateBook(Book b) {
    	// TODO Auto-generated method stub
    	return bookRepository.save(b);
    }
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
