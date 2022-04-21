package com.markethidalgo.markethidalgo.Service;
import com.markethidalgo.markethidalgo.Repository.PersonaRepository;
import com.markethidalgo.markethidalgo.model.Persona;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> MostrarTodo(){
      return personaRepository.findAll();
    }

    public Persona Guardar(Persona persona){
        return personaRepository.save(persona);
    }

    public void Eliminar(Long id){
        personaRepository.deleteById(id);
    }

    public Persona Editar(Persona persona){
        return personaRepository.save(persona);
    }
}
