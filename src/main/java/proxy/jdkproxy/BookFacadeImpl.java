package proxy.jdkproxy;

public class BookFacadeImpl implements BookFacade {

    @Override
    public void addBook() {
        System.out.println("增加书本方法.....");
    }
}
