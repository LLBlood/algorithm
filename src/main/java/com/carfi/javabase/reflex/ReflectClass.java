package com.carfi.javabase.reflex;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * com.carfi.javabase.reflex$
 * 反射常用方法
 * @author ll
 * @date 2020-03-25 11:22:01
 **/
public class ReflectClass {

    private static final Logger log = LoggerFactory.getLogger(ReflectClass.class);

    static {
        log.debug("hello world");
    }

    @Test
    public void reflectNewInstance() {
        try {
            Class<?> classBook = Class.forName("com.carfi.javabase.reflex.Book");
            Object o = classBook.newInstance();
            Book b = (Book) o;
            b.setName("Java高级特性-反射-创建对象");
            b.setAuthor("ll");
            log.info("====>"+b.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
