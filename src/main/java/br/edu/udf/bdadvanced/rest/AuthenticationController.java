package br.edu.udf.bdadvanced.rest;

import br.edu.udf.bdadvanced.dto.AuthenticateDTO;
import org.springframework.http.ResponseEntity;

public interface AuthenticationController {

    ResponseEntity authenticate(AuthenticateDTO login);
}
