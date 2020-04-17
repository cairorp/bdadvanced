package br.edu.udf.bdadvanced.rest;

import br.edu.udf.bdadvanced.dto.AuthenticateDTO;
import br.edu.udf.bdadvanced.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface AuthenticationController {

    ResponseEntity<UserDTO> authenticate(AuthenticateDTO login);
}
