package br.edu.udf.bdadvanced.service;

import br.edu.udf.bdadvanced.dto.UserDTO;

public interface AuthenticationService {
    UserDTO authenticate(String login, String password);
}
