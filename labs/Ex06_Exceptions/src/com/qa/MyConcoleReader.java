package com.qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyConcoleReader {
    public void readInputPrint(){
        StringBuffer sb = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter a line of text or 'stop'");
        }
    }
}
