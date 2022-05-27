package Service;


public interface StudentService {
	Student findStudentById(int id);
	void addStudent(Student student);
	void updateStudent(Student student);
	void removeStudent(Student student);

}