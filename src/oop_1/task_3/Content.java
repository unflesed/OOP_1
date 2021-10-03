package oop_1.task_3;

public class Content {
    String content;
    public void setContent(String content) {
        this.content = content;
    }
    void  show  (){
        System.out.println("Содержание книги:\n" + content);
    }
}
