public class ConcreteHandlersB extends BaseHandler {
    public void handle(Student student) {
        this.student = student;
        System.out.println("ConcreteHandlersB " + student.getAge());
        student.addAge();
        super.handle(student);
    }
}
