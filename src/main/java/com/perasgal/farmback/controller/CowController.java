package com.perasgal.farmback.controller;

import com.perasgal.farmback.model.Cow;
import com.perasgal.farmback.response.DefaultResponse;
import com.perasgal.farmback.response.Response;
import com.perasgal.farmback.service.CowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/cow")
public class CowController {

    private final CowService cowService;

    @Autowired
    public CowController(final CowService service) {
        super();
        cowService = service;
    }

    @PostMapping
    public Response<Cow>
    createCow(@RequestBody final Cow c) {
        final Cow result;
        result = cowService.createCow(c);

        return new DefaultResponse<>(result, "SUCCESS");
    }

    @PutMapping
    public Response<Cow>
    modifyCow(@RequestBody final Cow c) {
        final Cow result;

        if(cowService.existsById(c.getId())) {
            result = cowService.modifyCow(c);
            return new DefaultResponse<>(result, "SUCCESS");
        }
        return new DefaultResponse<>(null, "ERROR");
    }

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public Response<List<Cow>> findAll(){
        return new DefaultResponse<>(cowService.findAll(), "SUCCESS");
    }

    @GetMapping("/byName")
    public Response<List<Cow>> findByNameContainsIgnoreCase(@RequestParam String name){
        return new DefaultResponse<>(cowService.findByNameContainsIgnoreCase(name), "SUCCESS");
    }

    @GetMapping("/byId")
    @CrossOrigin(origins = "http://localhost:3000")
    public Response<Optional<Cow>> findById(@RequestParam int id){
        return new DefaultResponse<>(cowService.findById(id), "SUCCESS");
    }

}
