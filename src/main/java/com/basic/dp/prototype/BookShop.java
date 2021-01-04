package com.basic.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> bookList=new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void loadBooks(){

        for(int i=0;i<=10;i++) {
            Book b = new Book();
            b.setBid(i);
            b.setBookName("Book " + i);
            getBookList().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {

        BookShop shop=new BookShop();
        for (Book b:this.getBookList()){
            shop.getBookList().add(b);
        }
        return shop;
    }
}
