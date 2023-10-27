package com.giotse.stweard.visitors.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("visitors")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class VisitorsController {
    @GetMapping
    ResponseEntity<String> test() {
        return ResponseEntity.ok("teste");
    }
}
