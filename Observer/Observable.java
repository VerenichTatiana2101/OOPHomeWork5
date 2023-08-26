package Observer;

public interface Observable { 
    void registerStudent(String student);
    void removeStudent();
    void notifyStudent();

}
