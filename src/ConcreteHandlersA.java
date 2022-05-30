public class ConcreteHandlersA extends BaseHandler {
    public void handle(Student student) {
        this.student = student;
        System.out.println("ConcreteHandlersA " + student.getAge());
        student.addAge();
        super.handle(student);
    }
}
