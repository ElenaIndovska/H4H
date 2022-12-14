package h4h.springboot.postgresexample.repository;

import h4h.springboot.postgresexample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Override
    <S extends Student> S save(S entity);

    @Override
    void deleteById(Long id);
}