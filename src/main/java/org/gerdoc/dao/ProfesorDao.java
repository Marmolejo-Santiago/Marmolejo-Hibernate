package org.gerdoc.dao;

import org.gerdoc.model.Alumno;
import org.gerdoc.model.Profesor;

import java.util.List;

public interface ProfesorDao
{
    List<Profesor> findAll( ); //encuentre todo
    Profesor findById(Long id);//encuentre elemento por id
    Profesor save(Profesor profesor);//Equivañe al insert
    void deleteById(Long id);//eliminar por id
    Profesor update(Profesor profesor);//update
}
