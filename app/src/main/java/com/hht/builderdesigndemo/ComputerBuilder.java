package com.hht.builderdesigndemo;

/**
 * Author：wufq on 2018/5/8 10:39
 * Email：543633269@qq.com
 *
 * @TODO:
 */

public class ComputerBuilder {
    ComputerParam computerParam;

    public ComputerBuilder() {
        this.computerParam = new ComputerParam();
    }

    /**
     * 设置显示器
     *
     * @param displayer
     * @return
     */
    public ComputerBuilder setDisplayer(String displayer) {
        this.computerParam.displayer = displayer;
        return this;
    }

    /**
     * 设置主机
     *
     * @param mainboard
     * @return
     */
    public ComputerBuilder setMainboard(String mainboard) {
        this.computerParam.mainboard = mainboard;
        return this;
    }

    /**
     * 设置键盘
     *
     * @param keyboard
     * @return
     */
    public ComputerBuilder setKeyboard(String keyboard) {
        this.computerParam.keyboard = keyboard;
        return this;
    }

    /**
     * 设置鼠标
     *
     * @param mouse
     * @return
     */
    public ComputerBuilder setMouse(String mouse) {
        this.computerParam.mouse = mouse;
        return this;
    }

    /**
     * 真正构建
     * @return
     */
    public Computer create(){
        Computer computer = new Computer();
        computer.apply(computerParam);
        return computer;
    }


    class ComputerParam {
        public String displayer;//显示器
        public String mainboard;//主机
        public String keyboard;//键盘
        public String mouse;//鼠标
    }
}
