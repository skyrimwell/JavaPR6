package com.company.Builder;

public class Main_Builder {

    public static void main(String[] args) {
        Font ComicSans = new Font.FontMaker("Sans-serif").size(16).serif("No").cursive("Yes").makeFont();
        System.out.println(ComicSans);
        System.out.println();
        Font Times = new Font.FontMaker("Times New Roman").size(14).serif("Yes").cursive("No").makeFont();
        System.out.println(Times);
    }
}
