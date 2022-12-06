package com.example.demo.controller;

import com.example.demo.controller.dto.NotaRequest;
import com.example.demo.controller.dto.NotaResponse;
import org.springframework.web.bind.annotation.*;

@RestController("/nota")
@RequestMapping
public class NotaController {

    @GetMapping
    public NotaResponse entraNotas(){
        return new NotaResponse("Nota criada");
    }
    @PostMapping
    public NotaResponse salvaNota(@RequestBody NotaRequest notaRequest){
        return new NotaResponse(notaRequest.getNota());
    }
}
