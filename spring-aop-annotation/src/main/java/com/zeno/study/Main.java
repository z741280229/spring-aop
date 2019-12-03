package com.zeno.study;

import com.zeno.study.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        //执行方法
        as.saveAccount();

        //as.updateAccount(1);

    }
}
