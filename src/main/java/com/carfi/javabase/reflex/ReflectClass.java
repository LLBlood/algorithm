package com.carfi.javabase.reflex;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
    //创建对象
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

    //反射私有的构造方法
    @Test
    public void reflectPrivateConstructor() {
        try {
            Class<?> classBook = Class.forName("com.carfi.javabase.reflex.Book");
            Constructor<?> declaredConstructorBook = classBook.getDeclaredConstructor(String.class, String.class);
            //暴力反射
            declaredConstructorBook.setAccessible(true);
            Object objectBook = declaredConstructorBook.newInstance("Java高级特性-反射-反射私有的构造方法", "JourWon");
            Book book = (Book) objectBook;
            log.info(book.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    //反射私有属性
    @Test
    public void reflectPrivateField() {
        try {
            Class<?> classBook = Class.forName("com.carfi.javabase.reflex.Book");
            Object o = classBook.newInstance();
            Field tag = classBook.getDeclaredField("TAG");
            tag.setAccessible(true);
            String tags = (String) tag.get(o);
            log.info(tags);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    //反射私有方法
    @Test
    public void reflectPrivateMethod() {
        try {
            Class<?> classBook = Class.forName("com.carfi.javabase.reflex.Book");
            Method declaredMethod = classBook.getDeclaredMethod("declaredMethod", int.class);
            declaredMethod.setAccessible(true);
            Object o = classBook.newInstance();
            String string = (String) declaredMethod.invoke(o, 0);
            log.info(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
