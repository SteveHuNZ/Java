package com.steve.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 快速搭建log back框架，记录程序运行情况。到控制台到文件中。
 */

public class test {
    // 创建log back的日志对象， 代表日志技术
        public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("MAIN方法开始执行了");
            LOGGER.info("做除法");
            int a = 10;
            int b = 0;
            LOGGER.trace("a="+a);
            LOGGER.trace("b="+b);
            System.out.println(a/b);
        } catch (Exception e) {
           e.printStackTrace();
           LOGGER.error("功能出现异常"+ e);
        }


    }
}
