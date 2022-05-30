public class ConcreteHandlersC extends BaseHandler {
    public void handle(Student student) {
        this.student = student;
        System.out.println("ConcreteHandlersC " + student.getAge());
        student.addAge();
        super.handle(student);
    }
}
