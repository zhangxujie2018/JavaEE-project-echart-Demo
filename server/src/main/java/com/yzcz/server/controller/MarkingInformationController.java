/**
 * FileName: MarkingInformationController
 * Author:   jason
 * Date:     2020/5/27 1:15
 * Description:
 */
package com.yzcz.server.controller;

import com.yzcz.server.model.MarkingInformation;
import com.yzcz.server.service.MarkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/marking")
public class MarkingInformationController {

    @Autowired
    private MarkingService service;

    @GetMapping("/querybyname/{componentName}")
    public ResponseEntity<String> query(@PathVariable String componentName){

        String json = service.querybyname(componentName);

        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}