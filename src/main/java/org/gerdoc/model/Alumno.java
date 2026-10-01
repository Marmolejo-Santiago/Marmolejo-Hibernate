package org.gerdoc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //por cada miembro de la clase genera getter, setter y strings
@Entity
@NoArgsConstructor
@AllArgsConstructor //ponga los args en un constructor
@Builder
@Table(name = "ALUMNO")
public class Alumno
    //mapeo a la tabla
{
    @Id //llave primaria
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EDAD")
    private Integer edad;

    @Column(name = "PROMEDIO")
    private Double promedio;
}
//si se necesita solamente se cambia la importacion de sql