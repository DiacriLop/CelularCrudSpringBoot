package co.edu.uceva.demo20242.model.service;

import co.edu.uceva.demo20242.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar(); //metodo:lista los celulares
    void delete(Celular celular); //Elimina un celular de la base de datos
    Celular save(Celular celular); //Guarda un celular y me retorna un objeto de tipo celular
    Celular findById(Long id); //Busca un celular por su id y me retorna un objeto de tipo celular
    Celular update(Celular celular); //Actualiza un celular y me retorna un objeto de tipo celular
}
