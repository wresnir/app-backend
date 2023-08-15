package wresni.project.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import wresni.project.app.AbstractResponse;

import java.time.LocalDateTime;

@RestController
public class BaseController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public AbstractResponse<String> ping() {
        return AbstractResponse.of(LocalDateTime.now().toString());
    }
}
