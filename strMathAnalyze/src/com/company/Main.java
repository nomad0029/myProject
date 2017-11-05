package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Математическую операцию в формате 'число1+число2' (без пробелов!) ('+' можно менять на '-', '*' или '/')");
	String s1 = sc.nextLine();
        char i = 0;
        char j = 0;
        char plus = 43;
        char minus = 45;
        char umn = 42;
        char del = 47;
        while(i<s1.length()){
            i++;
            if(s1.charAt(i)==plus){
                break;
            }
            if(s1.charAt(i)==minus){
                break;
            }
            if(s1.charAt(i)==umn){
                break;
            }
            if(s1.charAt(i)==del){
                break;
            }
        }
        String firstNumber0 = s1.substring(0,i);;
        int firstNumber = Integer.parseInt(firstNumber0);


        String secondNumber0 = s1.substring(i+1, s1.length());
        int secondNumber = Integer.parseInt(secondNumber0);


        char operation = 0;

        while(j<s1.length()){
            j++;
            if(s1.charAt(j)==plus){
                operation = plus;
                break;
            }
            if(s1.charAt(j)==minus){
                operation = minus;
                break;
            }
            if(s1.charAt(j)==umn){
                operation = umn;
                break;
            }
            if(s1.charAt(j)==del){
                operation = del;
                break;
            }

        }
        if(operation == 43){
            System.out.print("Результат: ");
            System.out.print(firstNumber+secondNumber);

        }
        else if (operation == 45){
            System.out.print("Результат: ");
            System.out.print(firstNumber-secondNumber);
        }
        else if (operation == 42){
            System.out.print("Результат: "+firstNumber*secondNumber);
        }
        else if (operation == 47){
            System.out.print("Результат: "+(float) firstNumber/secondNumber);
        }
        }
    }

