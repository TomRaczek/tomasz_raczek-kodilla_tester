package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Greenbeard's Guide to Hoxxes", "Carl");
        Book book2 = BookManager.createBook("How to Constantly get in the Way", "Molly");
        Book book3 = BookManager.createBook("Tales of a Space Rig Bartender", "Bosco");
        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        Book book4 = BookManager.createBook("Secrets of Intergalactic Mineral Trading", "Management");
        Book book5 = BookManager.createBook("Secrets of Intergalactic Mineral Trading", "Management");
        System.out.println(book4 == book5);
    }
}
