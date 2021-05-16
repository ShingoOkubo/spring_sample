package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserSearchRequest;
import com.example.demo.entity.User;
import com.example.demo.repository.UserMapper;

/**
 * ユーザー情報 Service
 */
@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {
	
    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserMapper userMapper;
    
    /**
     * ユーザー情報検索
     * @return 検索結果
     */
    public User search(UserSearchRequest userSearchRequest) {
      return userMapper.search(userSearchRequest);
    }
    
    /**
     * ユーザー情報検索2
     * @return 検索結果
     */
    public User search2(UserSearchRequest userSearchRequest) {
      return userMapper.search(userSearchRequest);
    }
}
