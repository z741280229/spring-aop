package com.zeno.study.service.impl;

import com.zeno.study.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
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
