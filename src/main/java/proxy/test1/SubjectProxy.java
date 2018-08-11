package proxy.test1;

public class SubjectProxy implements Subject {
    Subject subjectImpl = new RealSubject();
    public void doSomething() {
        subjectImpl.doSomething();
    }
}
