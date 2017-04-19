package staticproxy;

/**
 * Created by LiuSitong on 2017/4/19.
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        ForumService forumService = new ForumServiceProxy();
        forumService.createForum();
        forumService.removeTopic();
    }
}
