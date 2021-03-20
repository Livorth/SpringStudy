package cn.livorth.Mapper.Impl;

import cn.livorth.Mapper.UserMapper;
import cn.livorth.Pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }
}