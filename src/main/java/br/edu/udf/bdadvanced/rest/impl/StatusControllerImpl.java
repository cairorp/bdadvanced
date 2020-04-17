package br.edu.udf.bdadvanced.rest.impl;

import br.edu.udf.bdadvanced.model.Status;
import br.edu.udf.bdadvanced.rest.StatusController;
import br.edu.udf.bdadvanced.service.StatusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusControllerImpl implements StatusController {

    private StatusService statusService;

    public StatusControllerImpl(StatusService statusService) {
        this.statusService = statusService;
    }

    @Override
    @PostMapping("/create")
    public void create(@RequestBody Status status) {
        statusService.create(status);
    }

    @Override
    @GetMapping("/listStatus")
    public List<Status> listStatus() {
        return statusService.listStatus();
    }

}
