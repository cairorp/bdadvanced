package br.edu.udf.bdadvanced.service;

import br.edu.udf.bdadvanced.model.User;

import java.util.Optional;

public interface UserService {
    void create(User user);
    Optional<User> findForLoginAndPassword(String login, String password);
}
