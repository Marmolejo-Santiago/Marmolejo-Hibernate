package org.gerdoc.service;

import org.gerdoc.model.Alumno;

import java.util.List;

public interface ProfesorService
{
    List<Alumno> findAll( );
    Alumno findById( Long id );
}
