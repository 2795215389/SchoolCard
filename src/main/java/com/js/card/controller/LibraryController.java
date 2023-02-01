package com.js.card.controller;

import com.js.card.api.dto.BorrowDto;
import com.js.card.api.model.Library;
import com.js.card.api.response.BaseResponse;
import com.js.card.api.response.StatusCode;
import com.js.card.service.ILibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    private static final Logger log= LoggerFactory.getLogger(LibraryController.class);
    private static final String prefixUrl="/library";

    @Autowired
    private ILibraryService libraryService;

    //查询操作
    //得到所有书籍信息
    @GetMapping(prefixUrl+"/booksAll")
    public BaseResponse queryAllStu(){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        List<Library> books=libraryService.getAllBook();
        if(books!=null&&books.size()>0){
            response=new BaseResponse(StatusCode.Success);
            response.setData(books);
        }
        return response;
    }


    @PostMapping(prefixUrl+"/borrow")
    public BaseResponse borrow(@RequestBody BorrowDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            libraryService.borrowBook(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("借书成功！");
        }catch (Exception e){
            response.setData("借书失败！");
            log.info("借书存储过程发生异常！");
        }finally {
            return response;
        }
    }


    @PostMapping(prefixUrl+"/return")
    public BaseResponse ret(@RequestBody BorrowDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            libraryService.returnBook(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("还书成功！");
        }catch (Exception e){
            response.setData("还书失败！");
            log.info("还书存储过程发生异常！");
        }finally {
            return response;
        }
    }

    //跨校区借书服务
    @PostMapping(prefixUrl+"/borrowSouth")
    public BaseResponse borrowSouth(@RequestBody BorrowDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            libraryService.borrowSouth(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("跨区借书成功！");
        }catch (Exception e){
            response.setData("跨区借书失败！");
            log.info("跨区借书存储过程发生异常！");
        }finally {
            return response;
        }
    }


    //跨校区借书服务
    @PostMapping(prefixUrl+"/returnSouth")
    public BaseResponse returnSouth(@RequestBody BorrowDto dto){
        BaseResponse response=new BaseResponse(StatusCode.Failed);
        try{
            libraryService.returnSouth(dto);
            response=new BaseResponse(StatusCode.Success);
            response.setData("跨区还书成功！");
        }catch (Exception e){
            response.setData("跨区还书失败！");
            log.info("跨区还书存储过程发生异常！");
        }finally {
            return response;
        }
    }
}
