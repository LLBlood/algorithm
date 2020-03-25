package com.carfi.javabase.reflex;

/**
 * com.carfi.javabase.reflex$
 *
 * @author ll
 * @date 2020-03-25 11:17:32
 **/
public class GetBookReflex {
    public void getClz() {
        try {
            // 方法一，使用 Class.forName 静态方法
            Class<?> bookName = Class.forName("com.carfi.javabase.reflex.Book");
            System.out.println(bookName.toString());

            // 方法二：直接通过 类名.class 的方式得到
            Class<Book> bookClass = Book.class;
            System.out.println(bookClass.toString());

            // 方法三：使用类对象的 getClass() 方法。
            Book book = new Book();
            Class<? extends Book> newBookClass = book.getClass();
            System.out.println(newBookClass.toString());

            System.out.println(bookName == bookClass);
            System.out.println(bookClass == newBookClass);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new GetBookReflex().getClz();
    }
}
