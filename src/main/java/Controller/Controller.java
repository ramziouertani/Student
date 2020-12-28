package Controller;

import java.util.List;

import Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import Model.Student;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api/")
@RequiredArgsConstructor
public class Controller {
	
	private final StudentService saveStudent;
	
	@PostMapping("students")
	public Student saveStudent(@RequestBody Student student) {
		 return saveStudent.saveStudent(student);
	}
	
	@GetMapping("students")
	public List<Student> allStudents() {
		return saveStudent.getStudents();
	}
	
	
	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") int id,Student student) {
		student.setStudent_id(id);
		 saveStudent.deleteStudent(student);
	}
	
	@PutMapping("student/{id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable("id") int id) {
		student.setStudent_id(id);
		return saveStudent.saveStudent(student);
	}
}
