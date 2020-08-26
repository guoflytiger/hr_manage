package com.zict.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zict.entity.Account;
import com.zict.mapper.AccountMapper;
import com.zict.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author guoflytiger
 * @date 2020/8/25 20:55
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
