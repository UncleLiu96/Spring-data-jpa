package com.jpa;

import com.jpa.pojo.TUser;
import com.jpa.repository.TUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
    @Autowired
    private TUserRepository userRepository;


    @Test
    public void findAll() {
        //查询所有
        List<TUser> all = userRepository.findAll();
        for(TUser tUser:all){
            System.out.println(tUser);
        }
    }

    @Test
    public void findById() {
        //根据ID查询
        TUser tUser = userRepository.findById(2).get();
        System.out.println(tUser);
    }
    @Test
    public void save() {
        TUser tUser = new TUser();
        tUser.setUName("哈哈");
        TUser save = userRepository.save(tUser);
        System.out.println(save);
    }
    @Test
    public void delete() {
        userRepository.deleteById(4);
    }


}
