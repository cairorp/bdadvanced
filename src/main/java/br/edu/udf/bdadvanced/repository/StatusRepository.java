package br.edu.udf.bdadvanced.repository;

import br.edu.udf.bdadvanced.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
