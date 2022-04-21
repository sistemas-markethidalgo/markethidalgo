package com.markethidalgo.markethidalgo.Rest;
import com.markethidalgo.markethidalgo.Service.PersonaService;
import com.markethidalgo.markethidalgo.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/api/persona/")
public class PersonaRest {

    @Autowired
    PersonaService personaService;

    @GetMapping("MostrarPersonas")
    private ResponseEntity<List<Persona>> MostrarTodos(){
        return ResponseEntity.ok(personaService.MostrarTodo());
    }

    @PostMapping
    private ResponseEntity<Persona> Guardar(@RequestBody Persona persona){
        Persona temporal = personaService.Guardar(persona);
        try
        {
            return ResponseEntity.created(new URI("/api/persona/"+ temporal.getId())).body(temporal);
        }
        catch(Exception ex)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
