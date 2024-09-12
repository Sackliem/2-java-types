package com.example.task11;

public class Task11 {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки

        float y=0f;
        float x,c=0f;
        // Считаем проценты за год
        for (int i = 1; i <= 12; i++) {
            y=sum*percent-c;
            x=sum+y;
            c=(x-sum)-y;
            sum=x;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
