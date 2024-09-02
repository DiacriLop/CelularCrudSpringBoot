package co.edu.uceva.demo20242.controller;

import co.edu.uceva.demo20242.model.entities.Celular;
import co.edu.uceva.demo20242.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//identifica la clase como controlador Rest ( es una arquitectura de diseño de interfaz)
@RequestMapping("/api/v1/celular-service")//url se escribe en el navegador (recomendacion: nombre de la entidad)
public class CelularRestController {
    @Autowired
    private CelularServiceImpl celularService;

    @GetMapping("/celulares")//EndPoint
    public List<Celular> listar(){
        return this.celularService.listar();
    }
    @GetMapping("/celulares/{id}")
    public Celular buscarcelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    /**
     * Este metodo guarda un pais y me retorna el objeto de tipo Celular ya guardado con su id asignado
     * @param celular es el objeto de tipo Celular a guardar (sin el id)
     * @return retorna el objeto de tipo Celular guardado con su id asignado
     */
    @PostMapping("/celular")
    public Celular guardarcelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo actualiza un celular y me retorna el objeto de tipo Pais ya actualizado
     * @param celular es el objeto de tipo Celular a actualizar (con el id)
     * @return retorna el objeto de tipo Celular actualizado
     */
    @PutMapping("/celular")
    public Celular actualizarcelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo elimina un Celular por su id
     * @param id es el id del celular a eliminar
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarcelular(Long id) {
        Celular celular = this.celularService.findById(id); // Encuentro un pais por su id
        this.celularService.delete(celular);
    }
}
