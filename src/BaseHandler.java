public abstract class BaseHandler implements Handler{
    Handler next = null;
    Student student = null;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Student student){
        if (next !=null)
            next.handle(student);
    }
}
