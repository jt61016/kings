package com.demo.kings.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangtao
 * @date 2019-09-01 01:31.
 */
@RestController()
@RequestMapping("/api/kings/tools/")
public class ToolsController {

    @GetMapping("ping")
    public String ping() {
        return "ok";
    }
}
