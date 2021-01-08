package com.example.demo.web;

import com.example.demo.web.service.ToyStockService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lgx
 * @date 2021/1/4  20:43
 */
@RestController
@RefreshScope
@RequestMapping("/toyStock")
public class ToyStockController {

    @Resource
    ToyStockService toyStockService;

    @GetMapping(value = "/setToyStock")
    public String setToyStock() {
        return toyStockService.setToyStock();
    }

    @GetMapping(value = "/setToyStockException")
    public String setToyStockException() {
        return toyStockService.setToyStockException();
    }
}
