package cn.livorth.Service;

import cn.livorth.Dao.UserDao;
import cn.livorth.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    UserDao userDao;

    @Override
    public void getUser() {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
