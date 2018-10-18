package proxy.cglib;

/**
 * @auther: q16926
 * @date: 2018/10/18 15:35
 * @description:
 */
public class Hello {
        public String sayHello(boolean throwException) throws Exception {
            System.out.println("hello everyone!");
            if(throwException) { throw new Exception("test exception");}
            return "123";
        }
}
