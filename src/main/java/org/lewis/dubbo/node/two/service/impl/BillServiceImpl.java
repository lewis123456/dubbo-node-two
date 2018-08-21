package org.lewis.dubbo.node.two.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.lewis.dubbo.node.two.BillService;

@Service
public class BillServiceImpl implements BillService {
    @Override
    public boolean createBill() {
        return false;
    }

    @Override
    public boolean downloadBill() {
        return true;
    }
}
