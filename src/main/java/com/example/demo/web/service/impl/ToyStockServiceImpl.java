package com.example.demo.web.service.impl;

import com.example.demo.web.ToyStock;
import com.example.demo.web.ToyStockDao;
import com.example.demo.web.service.ToyStockService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lgx
 * @date 2021/1/6  18:45
 */
@Service
public class ToyStockServiceImpl implements ToyStockService {
    @Resource
    ToyStockDao toyStockDao;

    @Override
    @GlobalTransactional(name = "AT-First")
    public String setToyStock() {
        ToyStock toyStock = new ToyStock();
        toyStock.setOrderId( "123123" );
        toyStock.setToyNum( 1 );
        toyStockDao.save( toyStock );
        return "success";
    }

    @Override
    @GlobalTransactional(name = "AT-First")
    public String setToyStockException() {
        ToyStock toyStock = new ToyStock();
        toyStock.setToyNum( 1 );
        toyStockDao.save( toyStock );
        return "success";
    }
}
