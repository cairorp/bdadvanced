package br.edu.udf.bdadvanced.service;

public interface AuthenticationService {
    boolean authenticate(String login, String password);
}
