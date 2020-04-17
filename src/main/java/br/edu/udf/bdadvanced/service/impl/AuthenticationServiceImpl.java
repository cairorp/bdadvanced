package br.edu.udf.bdadvanced.service.impl;

import br.edu.udf.bdadvanced.dto.UserDTO;
import br.edu.udf.bdadvanced.exception.AuthenticationException;
import br.edu.udf.bdadvanced.model.User;
import br.edu.udf.bdadvanced.service.AuthenticationService;
import br.edu.udf.bdadvanced.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private UserService userService;

    public AuthenticationServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO authenticate(String login, String password) {
        Optional<User> result = userService.findForLoginAndPassword(login, password);
        UserDTO userDTO = new UserDTO();

        result.orElseThrow(() -> new AuthenticationException("Login ou senha incorreto!"));
        userDTO.setCdUser(result.get().getCdUser());
        userDTO.setFirstName(result.get().getFirstName());
        return userDTO;
    }

}
