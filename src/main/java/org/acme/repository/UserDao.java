package org.acme.repository;

import org.acme.domain.User;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUname(String uname);//通过用户名uname查找用户

    User findByUnameAndPassword(String uname, String password);//通过用户名uname和密码查找用户

    @Modifying
    @Transactional
    @Query("delete from User u where u.uname =?1")
    void deleteByUname(String uname);

//    @Modifying
//    @Transactional
//    @Query("update User u where set u.uname=:newName where u.uname=:oldName")
//    void updateByUname(@Param("oldName")String oldName,@Param("newName")String newName,String name,String key,Object value);

}
