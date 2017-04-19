package JDKproxy;
import java.lang.reflect.Proxy;

/**
 * Created by LiuSitong on 2017/4/19.
 */
public class TestJDKproxy {
    public static void main(String[] args) {

        // 1. 实例化InvocationHandler，目标对象作为参数
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(
                new ForumServiceImpl());

        // 2. 根据目标对象生成代理对象
        ForumService forumService = (ForumService) Proxy.newProxyInstance(ForumServiceImpl.class.getClassLoader(),
                ForumServiceImpl.class.getInterfaces(),myInvocationHandler);
        // 3. 使用。对调用者透明
        forumService.createForum();
        forumService.removeTopic();


    }
}
