package com.zeusjava.kernel.service;

import com.zeusjava.kernel.entity.User;

import java.util.List;

/**
 * Created by LittleXuan on 2015/10/17.
 */
public interface IUserService {
   User getUserById(int userId);

   User getUserByUserName(String userName);

   /**
    * 根据用户名和密码查询用户信息
    * @param userName
    * @param password
    * @return
     */
   User findUserByUserNameAndPwd(String userName, String password);

   List<User> getAllUser();

   Boolean addUser(User user);

   Boolean deleteUser(Integer id);

   Boolean updateUser(User user);
}
