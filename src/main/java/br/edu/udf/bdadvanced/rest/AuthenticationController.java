package br.edu.udf.bdadvanced.rest;

import br.edu.udf.bdadvanced.dto.LoginDTO;

public interface AuthenticationController {

    boolean authenticate(LoginDTO login);
}
