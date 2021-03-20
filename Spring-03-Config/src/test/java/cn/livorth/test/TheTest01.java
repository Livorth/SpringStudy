package cn.livorth.test;

import cn.livorth.Pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TheTest01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());

        /*
            User{
            str='String类型',
            Strings=[String01, String02, String03],
            ListStr=[ListString01, ListString02, ListString03],
            setStr=[SetString01, SetString02, SetString03],
            mapStr={MapKey01=MapValue01, MapKey02=MapValue02, MapKey03=MapValue03},
            testClass=TestClass{str='TestClass'},
            theNull='null',
            info={url=你的数据库url, driver=你的数据库包的地址}
            }
         */
    }
}
