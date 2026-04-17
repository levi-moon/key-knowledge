package com.levi.java;

import cn.hutool.extra.pinyin.PinyinUtil;

public class Pinyin {

    public static void main(String[] args) {
        String py = PinyinUtil.getPinyin("金钊", "");
        System.out.println(py);
    }
}
