package br.edu.udf.bdadvanced.service.impl;

import br.edu.udf.bdadvanced.model.Adress;
import br.edu.udf.bdadvanced.repository.AdressRepository;
import br.edu.udf.bdadvanced.service.AdressService;
import org.springframework.stereotype.Service;

@Service
public class AdressServiceImpl implements AdressService {

    private AdressRepository adressRepository;

    public AdressServiceImpl(AdressRepository adressRepository) {
        this.adressRepository = adressRepository;
    }

    @Override
    public Adress findOrSave(Adress adress) {
        Adress newAdress = adressRepository.findByCepAndStreetAndNumber(adress.getCep(),
                adress.getStreet(), adress.getNumber());

        if (newAdress == null) newAdress = adressRepository.save(adress);

        return newAdress;
    }
}
