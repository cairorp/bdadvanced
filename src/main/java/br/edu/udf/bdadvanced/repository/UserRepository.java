package br.edu.udf.bdadvanced.repository;

import br.edu.udf.bdadvanced.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
