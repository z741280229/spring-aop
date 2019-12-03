package com.zeno.study.service.impl;

import com.zeno.study.service.AccountService;

/**
 * @program: spring-aop-xml
 * @description:
 * @author: Zeno
 * @create: 2019-12-03 15:21
 **/
public class AccountServiceImpl implements AccountService {

    public void saveAccount() {
        System.out.println("执行了保存.....");
        //int i = 1/0;
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新....."+i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除.....");
        return 0;
    }


}
