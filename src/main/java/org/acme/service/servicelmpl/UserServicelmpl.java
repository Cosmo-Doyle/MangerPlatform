package org.acme.service.servicelmpl;

import org.acme.domain.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.acme.repository.UserDao;
import org.acme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.Arrays;

import static org.acme.utils.CheckPassword.isPswComplex;

@Service
public class UserServicelmpl implements UserService {
    @Resource
    private UserDao userDao;
    @Autowired
    public UserServicelmpl(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public User loginService(String uname, String password) {
        //如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        String serect =DigestUtils.sha3_256Hex(password);
        User user =userDao.findByUnameAndPassword(uname,serect);
        return user;
    }
    @Override
    public User registService(User user) {
        //用户名未拥有且密码复杂才允许注册
        if(userDao.findByUname(user.getUname())==null&&isPswComplex(user.getPassword())){
            String sha3_256str= DigestUtils.sha3_256Hex(user.getPassword());
            user.setPassword(sha3_256str);
            //保存至数据库
            User newUser = userDao.save(user);
            if(newUser!=null){
                newUser.setPassword("");
            }
            return newUser;
        }else {
            //加密密码
            return null;
        }
    }
    @Override
    public int logOutService(User user) {
        if(userDao.findByUname(user.getUname())!=null){
            userDao.deleteByUname(user.getUname());
            return 1;
        }else{
            return 0;
        }
    }
}
