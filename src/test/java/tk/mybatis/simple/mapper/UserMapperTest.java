package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.simple.model.Country;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

public class UserMapperTest extends BaseMapperTest{
    @Test
    public void testSelectById () {
        SqlSession sqlSession = getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = userMapper.selectById(1L);
            Assert.assertNotNull(user);
            Assert.assertEquals("admin",user.getUserName());
        } finally {
            //不要忘记关闭 sqlSession
            sqlSession.close();
        }
    }

    @Test
    public void testSeletAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysUser> userList = userMapper.selectAll();
            Assert.assertNotNull(userList);
            Assert.assertTrue(userList.size()>0);
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectRolesByUserId(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysRole> roleList = userMapper.selectRolesByUserId(1001L);
            Assert.assertNotNull(roleList);
            Assert.assertTrue(roleList.size()>0);
        }finally {
            sqlSession.close();
        }
    }
}
