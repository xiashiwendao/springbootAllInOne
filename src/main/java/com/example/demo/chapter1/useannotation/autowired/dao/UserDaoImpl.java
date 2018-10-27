package com.example.demo.chapter1.useannotation.autowired.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * 数据层接口实现类
 * 
 * 1.数据层Bean用@Repository标注
 * 2.当前Bean的名称是"autowiredUserDaoImpl"
 * 3.设置当前Bean的为原型模式，即每次获取Bean时都创建一个新实例
 * */
@Repository("autowiredUserDaoImpl")
@Scope("prototype")
public class UserDaoImpl implements IDao {

    public String get() {
        return "@Autowired注解实现自动装配";
    }
}
