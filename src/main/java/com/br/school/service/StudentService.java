package com.br.school.service;

import com.br.school.model.School;
import com.br.school.model.Student;
import com.br.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements CrudService<Student> {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public void delete(Integer id) {
        Optional<Student> studentOptional = this.repository.findById(id);
        studentOptional.ifPresent(studentDelete -> this.repository.delete(studentDelete));
    }

    @Override
    public Student update(Integer id) {
        Optional<Student> studentOptional = this.repository.findById(id);

        studentOptional.ifPresent(studentUpdate -> this.repository.save(studentUpdate));
        return studentOptional.orElseThrow();
    }
}
