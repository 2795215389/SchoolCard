package com.js.card.service;

import com.js.card.api.dto.BorrowDto;
import com.js.card.api.model.Library;

import java.util.List;

public interface ILibraryService {
    List<Library> getAllBook();
    void borrowBook(BorrowDto dto);
    void returnBook(BorrowDto dto);
    void borrowSouth(BorrowDto dto);
    void returnSouth(BorrowDto dto);
}
