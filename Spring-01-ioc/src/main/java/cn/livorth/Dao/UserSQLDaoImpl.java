package cn.livorth.Dao;

public class UserSQLDaoImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("数据库获取用户");
    }
}
