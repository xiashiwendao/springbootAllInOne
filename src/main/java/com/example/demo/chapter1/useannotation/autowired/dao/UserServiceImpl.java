package com.example.demo.chapter1.useannotation.autowired.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 业务层接口实现
 * 
 * 1.数据层Bean用@Service标注
 * 2.当前Bean的名称是"autowiredUserServiceImpl"
 * 3.设置当前Bean的为原型模式，即每次获取Bean时都创建一个新实例
 * 4.业务层有一个数据层接口IDao，使用@Autowired注解标注
 * */

@Service("autowiredUserServiceImpl")
@Scope("prototype")
public class UserServiceImpl implements IService {
    /**
     * @Autowired实现自动装配
     * Spring IoC容器扫描到@Autowired注解会去查询IDao的实现类，并自动注入
     * */
    @Autowired
    private IDao dao;

    @Override
    public String get() {
        return dao.get();
    }
}
