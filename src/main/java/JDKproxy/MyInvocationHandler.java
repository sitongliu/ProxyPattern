package JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by LiuSitong on 2017/4/19.
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object target;

    //通过构造函数带入目标对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK proxy do something before.....");
        Object o = method.invoke(this.target,args);
        System.out.println("JDK proxy do something after.....");
        return o;
    }
}
