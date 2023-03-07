package com.bhut.bhutapi.controllers;

import com.bhut.bhutapi.services.WebHookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Tag(name = "WebHook", description = "Manages the WebHook")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/webhook")
public class WebHookController {

    private final WebHookService webHookService;

    @Operation(summary = "Return add url to webhook")
    @PostMapping("/add")
    public ResponseEntity<?> create(@RequestBody String url) {
        return ResponseEntity.status(HttpStatus.CREATED).body(webHookService.create(url));
    }

}