package com.jmh.test.json.entitys;

import java.util.List;

/**
 * @Date 2024/11/20 20:04
 * @Created by wangyc
 */
public class PathEntity {

    public Store store;

    public static class Store {
        public List<Book> book;
    }
}
