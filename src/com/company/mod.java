package com.company;

class mod1 {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class mod extends mod1{
    public static void main (String[] main){
        mod1 d = new mod1();
        d.setName("Programiz");
        System.out.println(d.getName());
        }
        }
