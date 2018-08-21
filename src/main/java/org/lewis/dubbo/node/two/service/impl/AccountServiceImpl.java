package org.lewis.dubbo.node.two.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import org.lewis.dubbo.node.two.AccountService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class AccountServiceImpl implements AccountService {
    @Value("${server.port}")
    private int serverPort;

    @Override
    public String accountRecharge() {
        return serverPort + "accountRecharge";
    }

    @Override
    public String accountRefund() {
        return serverPort + "accountRefund";
    }

    @Override
    public String accountWithdraw() {
        return serverPort + "accountWithdraw";
    }
}
