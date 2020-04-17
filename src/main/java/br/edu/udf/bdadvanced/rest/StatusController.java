package br.edu.udf.bdadvanced.rest;

import br.edu.udf.bdadvanced.model.Status;

import java.util.List;

public interface StatusController {
    void create(Status status);

    List<Status> listStatus();
}
