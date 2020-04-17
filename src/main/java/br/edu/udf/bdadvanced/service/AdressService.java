package br.edu.udf.bdadvanced.service;

import br.edu.udf.bdadvanced.model.Adress;

public interface AdressService {
    Adress findOrSave(Adress adress);
}
