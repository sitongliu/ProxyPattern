package CGlibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by LiuSitong on 2017/4/19.
 */
public class TestCGlibproxy {
    public static void main(String[] args) {
        //声明Interceptor
        MyMethodInterceptor myMethodInterceptor = new MyMethodInterceptor();
        //用Enhance.create 方法，传入目标类的class
        ForumService forumService = (ForumService)
                Enhancer.create(ForumServiceImpl.class,myMethodInterceptor);

        //使用。对调用者透明
        forumService.createForum();
        forumService.removeTopic();
    }
}
