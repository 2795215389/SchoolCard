package com.js.card.service;

import com.js.card.api.dto.BorrowDto;
import com.js.card.api.model.Library;
import com.js.card.api.model.LibraryExample;
import com.js.card.mapper.ConsumeManageMapper;
import com.js.card.mapper.LibraryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements ILibraryService {

    private static final Logger log=LoggerFactory.getLogger(LibraryServiceImpl.class);

    @Autowired
    LibraryMapper libraryMapper;


    @Override
    public List<Library> getAllBook() {
        LibraryExample example=new LibraryExample();
        List<Library>books=libraryMapper.selectByExample(example);
        return books;
    }

    @Override
    public void borrowBook(BorrowDto dto) {
        libraryMapper.borrowBook(dto.getSno(),dto.getBookName());
    }

    @Override
    public void returnBook(BorrowDto dto) {
        libraryMapper.returnBook(dto.getSno(),dto.getBookName());
    }

    //跨区借书
    @Override
    public void borrowSouth(BorrowDto dto) {
        libraryMapper.borrowSouth(dto.getSno(),dto.getBookName());
    }

    //跨区还书
    @Override
    public void returnSouth(BorrowDto dto) {
        libraryMapper.returnSouth(dto.getSno(),dto.getBookName());
    }
}
