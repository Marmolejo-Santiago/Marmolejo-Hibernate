package org.gerdoc.dao;

import org.gerdoc.model.Alumno;

import java.util.List;

public interface AlumnoDao
{
    List<Alumno> findAll( ); //encuentre todo
    Alumno findById(Long id);//encuentre elemento por id
    Alumno save(Alumno alumno);//Equivañe al insert
    void deleteById(Long id);//eliminar por id
    Alumno update(Alumno alumno);//update
}
