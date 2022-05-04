package com.br.school.service;

import com.br.school.model.School;
import com.br.school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService implements CrudService<School>{

    @Autowired
    private SchoolRepository repository;

    @Override
    public List<School> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<School> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public School save(School school) {
        return repository.save(school);
    }

    @Override
    public void delete(Integer id) {
        Optional<School> schoolOptional = this.repository.findById(id);
        schoolOptional.ifPresent(schoolDelete -> this.repository.delete(schoolDelete));
    }

    @Override
    public School update(Integer id) {
        Optional<School> schoolOptional = this.repository.findById(id);

        schoolOptional.ifPresent(schoolUpdate -> this.repository.save(schoolUpdate));
        return schoolOptional.orElseThrow();
    }
}
