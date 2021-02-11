package com.fpx.xms.core.Impl;

import com.fpx.xms.core.MarketCoreService;
import org.springframework.stereotype.Service;

import com.fpx.xms.mapper.MarketMapper;
import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by wanq0 on 2021/1/26.
 */
@Service
public class MarketCoreServiceImpl implements MarketCoreService{

    @Resource
    private MarketMapper mapper;

    @Override
    public void insert(String name, Integer age) {

        try {
            HashMap<String, Object> stringObjectHashMap = new HashMap<>();

            stringObjectHashMap.put("name",name);
            stringObjectHashMap.put("age",age);
            stringObjectHashMap.put("perm","perm");
            mapper.insert(stringObjectHashMap);

            int a = 1/0;
        } catch (Exception e) {
            System.out.println("发生异常");
        }
    }
}
