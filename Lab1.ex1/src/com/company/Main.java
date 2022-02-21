package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть порядковий номер зодіаку: ");
        int a = in.nextInt();
        switch(a) {
            case 1:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Овен");
                break;
            case 2:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Телець");
                break;
            case 3:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Близнюки");
                break;
            case 4:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Рак");
                break;
            case 5:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Лев");
                break;
            case 6:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Діва");
                break;
            case 7:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Терези");
                break;
            case 8:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Скорпіон");
                break;
            case 9:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Стрілець");
                break;
            case 10:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Козеріг");
                break;
            case 11:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Водолій");
                break;
            case 12:
                System.out.printf("Порядковий номер зодікаку під номером %d ", a);
                System.out.printf("- Риби");
                break;
            default:
                System.out.println("Введене число не є порядковим номером ні одного знаку зодіака");
        }

    }
}


