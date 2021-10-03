package oop_1.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Title title = new Title();
        System.out.println("Введите название:");
        title.setTitle(sc.nextLine());
        Author author = new Author();
        System.out.println("Введите автора:");
        author.setAuthor(sc.nextLine());
        Content content = new Content();
        System.out.println("Введите содержание:");
        content.setContent(sc.nextLine());
        Book book = new Book(title, author, content);
        book.title.show();
        book.author.show();
        book.content.show();
    }
}
