package cn.livorth.test;

import cn.livorth.Dao.UserSQLDaoImpl;
import cn.livorth.Service.UserService;
import cn.livorth.Service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    public static void main(String[] args) {
        // 老方法
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserSQLDaoImpl());
//        userService.getUser();

        // 采用Spring配置文件的方式同样可以获取，这样的话仅仅只需要对配置文件进行修稿就能实现调用不同的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userService");

        userService.getUser();

    }
}
