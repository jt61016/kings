package com.demo.kings.web.controller;

import com.demo.kings.common.dto.Response;
import com.demo.userx.facade.HelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired(required = false)
    HelloFacade helloFacade;

    @GetMapping("ping")
    public Response<String> ping() {
        return Response.ok("ok");
    }

    @GetMapping("testDubbo")
    public Response<String> testDubbo() {
        Response rpcRet = helloFacade.sayHello();
        return rpcRet;
    }
}
