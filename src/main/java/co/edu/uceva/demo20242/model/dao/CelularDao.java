package co.edu.uceva.demo20242.model.dao;

import co.edu.uceva.demo20242.model.entities.Celular;
import org.springframework.data.repository.CrudRepository;
//DAO:Data Access Object: Maneja las operaciones CRUD del celular (es la que realiza las acciones)
/*
¿Que es Una interfaz?-->son herramientas que ayudan a integrar servivios (se encarga de conectar datos)
---Diferencia entre interzaz y clase abstracta---
-la interfaz sirve para mostrar metodos entre clases(sirvve para cualquier clase)
 mientras que una clase abstracta se deben implementar (agrupa los oobjetos x lo son)
* */
public interface CelularDao extends CrudRepository<Celular,Long> { // se herda de Crud repository (Repo de metodos CRUD)celular es la entidad y long la PK

}
