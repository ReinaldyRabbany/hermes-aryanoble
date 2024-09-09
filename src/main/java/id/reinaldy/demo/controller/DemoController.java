package id.reinaldy.demo.controller;

import id.reinaldy.demo.dto.RestResponse;
import id.reinaldy.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    private final DemoService demoService;

    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public ResponseEntity<?> getDemo(@RequestParam String name,
                                     @RequestParam String type) {
        return ResponseEntity.ok().body(RestResponse.success(demoService.getDemo(name, type)));
    }
}
