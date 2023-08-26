package Observer;

public class ConcreteObservable implements Observable {

    @Override
    public void registerStudent(String student) {
        System.out.println("\nStudent crated.");
        System.out.println("Student name: " + student);
    }

    @Override
    public void removeStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeStudent'");
    }

    @Override
    public void notifyStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notifyStudent'");
    }
    
}
