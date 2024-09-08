package com.acciojob.book_my_show_august.Controllers;

import com.acciojob.book_my_show_august.Requests.AddShowRequest;
import com.acciojob.book_my_show_august.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("shows")
public class ShowController {


    @Autowired
    private ShowService showService;


    @PostMapping("add")
    public ResponseEntity addShow(@RequestBody AddShowRequest addShowRequest){

        String response = showService.addShow(addShowRequest);
        return new ResponseEntity(response, HttpStatus.OK);
    }
}
