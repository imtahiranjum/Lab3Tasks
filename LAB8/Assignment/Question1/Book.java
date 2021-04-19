package com.company;

public class Book extends Publication {
    public int pageCount;

    public Book(){
        super();
        pageCount = 100;
    }

    public Book(int pageCount){
        super();
        this.setPageCount(pageCount);
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
        public void display(){
            System.out.print("\nTitle: "+super.getTitle()+"\nPrice: "+super.getPrice()+"\nPages: "+getPageCount());
    }
}
