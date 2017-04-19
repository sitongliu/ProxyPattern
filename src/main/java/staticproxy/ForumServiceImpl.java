package staticproxy;

/**
 * Created by LiuSitong on 2017/4/19.
 * 论坛服务接口的实现类
 */
public class ForumServiceImpl implements ForumService {

    private TopicDao topicDao = new TopicDao();
    private ForumDao forumDao = new ForumDao();

    public void createForum() {
        forumDao.create();
    }

    public void removeTopic() {
        topicDao.remove();
    }
}
