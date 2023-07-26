package com.qa;

import java.io.*;


public class MyConcoleReader {
    public void readInputPrint(){
        StringBuffer sb = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter a line of text or 'stop'");
            String line = br.readLine();
            while(!line.equals("stop")) {
                sb.append(line + "\n");
                System.out.println("Enter a line of text or 'stop'");
                line = br.readLine();
            }
            System.out.println(sb);

        } catch (IOException io){
            System.out.println("Error on console input: " + io);
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyConcoleReader mcr = new MyConcoleReader();
        mcr.readInputPrint();
    }
}
