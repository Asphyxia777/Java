package lab1;

import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = sc.nextInt();
        int a = 0;
        int[] mas = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Введите " + (i+1) + " член массива: ");
            mas[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Массив: ");
        while(n > 0)
        {
            System.out.print(mas[a] + " ");
            n = n - 1;
            a = a + 1;
        }
        System.out.println();
        System.out.print("Массив в обратном порядке: ");
        do
        {
            System.out.print(mas[a-1] + " ");
            a = a - 1;
        } while(a > 0);
    }
}
