package pe.com.microjoin.luz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.microjoin.luz.dto.CalculoDto;
import pe.com.microjoin.luz.model.Calculo;
import pe.com.microjoin.luz.service.CalculoService;

import java.util.List;

@RestController
@RequestMapping("/api/calculos")
public class CalculoController {

    @Autowired
    private CalculoService calculoService;

    @PostMapping("/guardar")
    public Calculo guardarCalculo(@RequestBody CalculoDto calculoDto) {
        return calculoService.saveCalculo(calculoDto);
    }

    @GetMapping
    public List<Calculo> obtenerCalculos() {
        return calculoService.findAll();
    }

    @GetMapping("/{id}")
    public Calculo obtenerCalculo(@PathVariable Long id) {
        return calculoService.findById(id);
    }
}