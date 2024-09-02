package co.edu.uceva.demo20242.model.entities;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;//ayuda a la implementacion de BD
import lombok.Data;//ayuda con los getter y setter
/*
 * ORM: Object Relational Mapping
 * JPA: Java Persistence API (Especificación) -> Hibernate, EclipseLink, TopLink, OpenJPA, DataNucleus
 */
/*
 Esta clase Celular es una entidad y se mapea en la BD (hace mas facil el acceso a los datos)
 */
@Data//crea los Getter y Setter de forma automatica y el contructor
@Entity //Especifica que es una BD (tambien pluraliza) y lo podemos apreciar con el icono que esta al lado de la public class
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Genera numeros
    private Long id;//llave Primaria
    private String marca;
    private String modelo;
    private int imei;
    private int numero;
    private String color;


}
