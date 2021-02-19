package com.tiffany.mvc.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository; // Allows us to d CRUD
import org.springframework.stereotype.Repository;

import com.tiffany.mvc.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{ // Long is the TYPE of our ID
    // this method retrieves all the books from the database
    List<Book> findAll();
    
//    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
//    
//    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
//    
//    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
