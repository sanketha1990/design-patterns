package com.basic.dp.app;

import com.basic.dp.prototype.BookShop;

public class TestPrototypeDP {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop=new BookShop();
        shop.setShopName("Bhehethar");
        shop.loadBooks();


        //BookShop bs2=(BookShop)shop.clone();
        BookShop bs2=(BookShop)shop.clone();
        shop.getBookList().remove(0);
        bs2.setShopName("A2");

        System.out.println(shop);
        System.out.println(bs2);
    }
}
