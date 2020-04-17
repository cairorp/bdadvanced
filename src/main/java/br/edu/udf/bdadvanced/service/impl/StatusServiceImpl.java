package br.edu.udf.bdadvanced.service.impl;

import br.edu.udf.bdadvanced.model.Status;
import br.edu.udf.bdadvanced.repository.StatusRepository;
import br.edu.udf.bdadvanced.service.StatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    private StatusRepository statusRepository;

    public StatusServiceImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public void create(Status status) {
        statusRepository.save(status);
    }

    @Override
    public List<Status> listStatus() {
        return statusRepository.findAll();
    }
}
