package Service;

import java.util.List;
import Repo.StudentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Model.Student;

@Service
@RequiredArgsConstructor
public class StudentService {
 
	private final StudentsRepository studentsRepository;
	
	public Student saveStudent(Student student) {
		StringBuilder stringBuilder =new StringBuilder();

		return studentsRepository.save(student);
	}
	public List<Student> getStudents() {
		return studentsRepository.findAll();
	}
	public void deleteStudent(Student student) { studentsRepository.delete(student);}
}
