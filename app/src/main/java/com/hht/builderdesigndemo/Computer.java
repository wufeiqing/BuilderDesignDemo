package com.hht.builderdesigndemo;

/**
 * Author：wufq on 2018/5/8 10:39
 * Email：543633269@qq.com
 *
 * @TODO:
 */

public class Computer {
    private String displayer;//显示器
    private String mainboard;//主机
    private String keyboard;//键盘
    private String mouse;//鼠标

    public void apply(ComputerBuilder.ComputerParam computerParam){
        displayer = computerParam.displayer;
        mainboard = computerParam.mainboard;
        keyboard = computerParam.keyboard;
        mouse = computerParam.mouse;
    }

    public void show(){
        System.out.println("result: "+toString());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "displayer='" + displayer + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
