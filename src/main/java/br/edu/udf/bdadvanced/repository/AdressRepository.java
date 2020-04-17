package br.edu.udf.bdadvanced.repository;

import br.edu.udf.bdadvanced.model.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressRepository extends JpaRepository<Adress, Integer> {

    Adress findByCepAndStreetAndNumber(Integer cep, String street, Integer number);
}
