package br.edu.udf.bdadvanced.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "Login ou senha incorretos!")
public class AuthenticationException extends IllegalArgumentException {

    public AuthenticationException(String message) {
        super(message);
    }
}
