package staticproxy;

/**
 * Created by LiuSitong on 2017/4/19.
 * 论坛的代理接口
 * 因为每次发帖都需要用到这两个方法，所以抽象出接口
 */
public interface ForumService {
    //创建一个论坛
    public void createForum();
    //移除一个话题
    public void removeTopic();
}
