package com.dio.sistemadeponto.contoller;

import com.dio.sistemadeponto.model.JornadaTrabalho;
import com.dio.sistemadeponto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping()
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jonadaTrabalho){
        return jornadaService.saveJornada(jonadaTrabalho);
    }

    @GetMapping()
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity <JornadaTrabalho> getJorndaByID(@PathVariable("idJornada") Long idJornada){
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada.")));

    }

    @PutMapping()
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jonadaTrabalho){
        return jornadaService.updateJornada(jonadaTrabalho);
    }

    @DeleteMapping("/{idJornada}")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }
}
