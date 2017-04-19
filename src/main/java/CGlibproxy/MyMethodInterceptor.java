package CGlibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by LiuSitong on 2017/4/19.
 */
public class MyMethodInterceptor implements MethodInterceptor{
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGlib do something before ......");
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("CGlib do something after ......");
        return object;
    }
}
