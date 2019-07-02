package io.tornimo.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public ResponseEntity<String> endpoint() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/example-error")
    public ResponseEntity<String> errorEndpoint() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}
