package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Aslan","Nurbek","Ulan"};
        for (String name:names) {
            switch (name){
                case "Aslan":
                    System.out.println(name + " Доброе утро");
                    break;
                case "Nurbek":
                    System.out.println(name + " Добрый день");
                    break;
                case "Ulan":
                    System.out.println(name+" Добрый вечер");
                    break;
            }
        }

    }
}
