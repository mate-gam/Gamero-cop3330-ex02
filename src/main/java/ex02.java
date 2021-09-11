/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Gamero Mateo
 */
import java.io.Console;

public class ex02
{
    public static void main (String[] args)
    {
        Console c = System.console();
        String h = c.readLine("What is the input String? ");
        System.out.printf("%s has %d characters. %n", h, h.length());
    }
}
