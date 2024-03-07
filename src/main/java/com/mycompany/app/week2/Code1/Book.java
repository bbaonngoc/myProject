package com.mycompany.app.week2.Code1;

public class Book {

    // thuoc tinh cua doi tuong
    // luu tru du lieu
    String title;
    String author;
    int numPages;
    
    // Ham tao mac dinh;
    public Book(){
        System.out.println("1 cuon sach moi");
    }

    /* Ham tao co tham so */
    public Book(String t, String a, int p) {
        title = t;
        author = a;
        numPages = p;
    }

    public void in() {
        System.out.println("Tieu de cua sach : " + title);
        System.out.println("Tac gia cua sach : " + author);
        System.out.println("so trang sach : " + numPages);
    }


}
    