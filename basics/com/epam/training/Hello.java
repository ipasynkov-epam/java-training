package com.epam.training;

import com.epam.training.javaintro.Another;
import org.apache.commons.lang3.StringUtils;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello, world!");
        for (String arg : args){
            System.out.println(arg);
        }
        Another another = new Another();
        System.out.println(another.getMessage());

        System.out.println(StringUtils.capitalize("caPiTalize"));
    }
}