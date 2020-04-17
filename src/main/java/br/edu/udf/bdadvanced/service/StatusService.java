package br.edu.udf.bdadvanced.service;

import br.edu.udf.bdadvanced.model.Status;

import java.util.List;

public interface StatusService {
    void create(Status status);

    List<Status> listStatus();
}
