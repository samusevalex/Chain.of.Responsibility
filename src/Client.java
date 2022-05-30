public class Client {
    public static void main(String[] args) {
        Student s = new Student(20);
        Handler h1 = new ConcreteHandlersA();
        Handler h2 = new ConcreteHandlersB();
        Handler h3 = new ConcreteHandlersC();
        h1.setNext(h2);
        h2.setNext(h3);
        h1.handle(s);
        System.out.println("Result " + s.getAge());
    }
}
