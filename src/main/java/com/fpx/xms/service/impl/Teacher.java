package com.fpx.xms.service.impl;

import com.fpx.xms.service.Leader;

/**
 * @Author: wanq0
 * @Description:
 * @Date: 2021/1/10 19:53
 * @Version: 1.0
 */
public class Teacher extends Leader {

    @Override
    public void handle(Integer num) {
        if(num < 3){
            System.out.println("老师批准了假期");
        }else{
            System.out.println("高于三天的假期需要主任通过");
            if(getNext() != null){
                getNext().handle(num);
            }else {
                System.out.println();
            }
        }

    }


}
