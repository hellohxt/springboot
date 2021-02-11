package com.fpx.xms.service;

/**
 * @Author: wanq0
 * @Description:
 * @Date: 2021/1/10 19:48
 * @Version: 1.0
 */
public abstract class Leader {

    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handle(Integer num);
}
