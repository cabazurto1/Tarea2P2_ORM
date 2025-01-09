package com.espe.micro_cursos.services;

import com.espe.micro_cursos.model.entity.Curso;
import com.espe.micro_cursos.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso obtenerPorId(Long id) {
        return cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con ID: " + id));
    }

    @Override
    public void eliminarPorId(Long id) {
        if (!cursoRepository.existsById(id)) {
            throw new RuntimeException("Curso no encontrado con ID: " + id);
        }
        cursoRepository.deleteById(id);
    }

    @Override
    public List<Curso> buscarPorCreditos(int creditos) {
        return cursoRepository.findByCreditos(creditos);
    }

    @Override
    public List<Curso> buscarPorFechaCreacionPosterior(Date fecha) {
        return cursoRepository.findByCreadoEnAfter(fecha);
    }

    @Override
    public List<Curso> buscarPorDescripcion(String texto) {
        return cursoRepository.findByDescripcionContaining(texto);
    }
}
