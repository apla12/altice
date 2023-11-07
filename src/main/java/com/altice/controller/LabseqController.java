package com.altice.controller;

import com.altice.service.LabseqService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(
        origins = "http://localhost:4200",
        methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT })
@RestController
@RequestMapping({"/labseq"})
public class LabseqController {

    private final LabseqService service;

    public LabseqController(LabseqService service) {
        this.service = service;
    }

    @GetMapping("/{num}")
    public Integer sequenceValue(@PathVariable Integer num) {
        return service.sequenceValue(num);
    }
}
