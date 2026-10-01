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
@Table(name = "Profesor")
public class Profesor
        //mapeo a la tabla
{
    @Id //llave primaria
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "MATERNO")
    private String materno;

    @Column(name = "PATERNO")
    private String paterno;
}
//si se necesita solamente se cambia la importacion de sql