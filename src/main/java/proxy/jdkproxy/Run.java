package proxy.jdkproxy;

public class Run {
    public static void main (String[] args) {
        BookFacadeImpl bookFacadeImpl = new BookFacadeImpl();

        BooKFacadeProxy proxy = new BooKFacadeProxy();
        BookFacade bookFacade = (BookFacade) proxy.bind(bookFacadeImpl);
        //接口引用真正指向了一个绑定了业务类的代理对象，所以通过接口方法名调用的是被代理的方法们
        bookFacade.addBook();
    }
}
