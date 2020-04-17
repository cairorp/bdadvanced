package br.edu.udf.bdadvanced.rest.impl;

import br.edu.udf.bdadvanced.dto.AuthenticateDTO;
import br.edu.udf.bdadvanced.dto.UserDTO;
import br.edu.udf.bdadvanced.rest.AuthenticationController;
import br.edu.udf.bdadvanced.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class AuthenticationControllerImpl implements AuthenticationController {

    private AuthenticationService authenticationService;

    public AuthenticationControllerImpl(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    @PostMapping("/new")
    public ResponseEntity<UserDTO> authenticate(@RequestBody AuthenticateDTO login) {
        return ResponseEntity.accepted()
                .body(authenticationService.authenticate(login.getLogin(), login.getPassword()));
    }
}
