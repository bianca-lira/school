package com.br.school.service;

import com.br.school.model.Class;
import com.br.school.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService implements CrudService<Class>{

    @Autowired
    private ClassRepository repository;

    @Override
    public List<Class> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Class> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Class save(Class newClass) {
        return repository.save(newClass);
    }

    @Override
    public void delete(Integer id) {
        Optional<Class> classOptional = this.repository.findById(id);
        classOptional.ifPresent(classDelete -> this.repository.delete(classDelete));
    }

    @Override
    public Class update(Integer id) {
        Optional<Class> classOptional = this.repository.findById(id);

        classOptional.ifPresent(classUpdate -> this.repository.save(classUpdate));
        return classOptional.orElseThrow();
    }
}
