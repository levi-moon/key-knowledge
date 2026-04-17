package com.levi.design_patterns.behavioral_pattern.mediator_pattern;

/**
 * @Class: User
 * @Description: 用户
 * @Author: Levi
 * @Date: 2026/2/17 20:48
 * @Version: 1.0
 */
public class User {

    // 用户姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 发送消息
     *
     * @param message
     */
    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
