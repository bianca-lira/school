package com.br.school.service;

import com.br.school.model.Teacher;
import com.br.school.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements CrudService<Teacher> {

    @Autowired
    private TeacherRepository repository;

    @Override
    public List<Teacher> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Teacher> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return repository.save(teacher);
    }

    @Override
    public void delete(Integer id) {
        Optional<Teacher> teacherOptional = this.repository.findById(id);
        teacherOptional.ifPresent(teacherDelete -> this.repository.delete(teacherDelete));
    }

    @Override
    public Teacher update(Integer id) {
        Optional<Teacher> teacherOptional = this.repository.findById(id);

        teacherOptional.ifPresent(teacherUpdate -> this.repository.save(teacherUpdate));
        return teacherOptional.orElseThrow();
    }
}
