package cn.nglsk.controller;

import cn.nglsk.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController("/user")
public class UserController {

    @Resource
    private UserService userService;
    @GetMapping("/queryById")
    public ResponseEntity<Map<String, Object>> queryUser(@RequestParam("id") Long id) {
        return ResponseEntity.ok(this.userService.queryUserById(id));
    }
}
