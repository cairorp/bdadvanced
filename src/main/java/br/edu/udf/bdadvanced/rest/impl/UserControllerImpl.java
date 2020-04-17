package br.edu.udf.bdadvanced.rest.impl;

import br.edu.udf.bdadvanced.model.User;
import br.edu.udf.bdadvanced.rest.UserController;
import br.edu.udf.bdadvanced.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/create")
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @PostMapping("/teste")
    public String teste() {
        return String.valueOf("Bateu aqui");
    }


}
