package staticproxy;

/**
 * Created by LiuSitong on 2017/4/19.
 * 静态代理，在实现方法前后可以进行操作
 */
public class ForumServiceProxy implements ForumService {

    private ForumServiceImpl forumService = new ForumServiceImpl();

    public void createForum() {
        System.out.println("do something before createForum");
        forumService.createForum();
        System.out.println("do something after createForum");
    }

    public void removeTopic() {
        System.out.println("do something before removeTopic");
        forumService.removeTopic();
        System.out.println("do something after removeTopic");
    }
}
