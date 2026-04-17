package com.levi.design_patterns.behavioral_pattern.mediator_pattern;

import java.util.Date;

/**
 * @Class: ChatRoom
 * @Description: 聊天室
 * @Author: Levi
 * @Date: 2026/2/17 20:47
 * @Version: 1.0
 */
public class ChatRoom {

    /**
     * 打印消息
     *
     * @param user
     * @param message
     */
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
