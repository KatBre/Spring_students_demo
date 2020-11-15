package kb.spring.students_demo.service;

import kb.spring.students_demo.model.Grade;
import kb.spring.students_demo.model.Student;
import kb.spring.students_demo.repository.GradeRepository;
import kb.spring.students_demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GradeService {
    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;
    public Optional<Student> findById(Long studentId) {
        return studentRepository.findById(studentId);
    }
    public void save(Grade grade) {
        gradeRepository.save(grade);
    }
}