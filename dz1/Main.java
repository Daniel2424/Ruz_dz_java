package ru.mirea.dz1;

public class Main {
    public static void main(String[] args) {
        int[] arr = {24, 10, 9, 1};
        String[] arrStr = {"word", "man","dan","ay"};
        Func3(arr);
        Func4(arrStr);
        Func5();
        Func6();
        Func7(5);

    }
    static void Func3( int[] array ) {
        System.out.print("Func 3: ");
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }
        System.out.print("for:" +sum + "  ");
        //
        sum = 0;
        int i = 0;
        while (i < array.length){
            sum+=array[i];
            i++;
        }
        System.out.print("while:" +sum + "  ");
        i = 0;
        sum = 0;
        do{
            sum+=array[i];
            i++;
        }while(i < array.length);
        System.out.println("do while:" +sum);
    }

    static void Func4( String[] array ) {
        System.out.print("Func 4: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void Func5() {
        System.out.print("Func 5: ");
        for (float i = 1; i <= 10; i++){
            System.out.print(String.format("%.2f", 1/i) + " ");
        }
        System.out.println();
    }

    static void Func6() {
        System.out.print("Func 6:\n");
        int count = (int) Math.round(Math.random() * 100);
        int a[] = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = (int) Math.round(Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    static void Func7(int n7) {
        System.out.print("Func 7: ");
        int count = (int) Math.round(Math.random()*100);
        int a = 1;
        for (int i = 2; i <= n7; i++){
            a *= i;
        }
        System.out.println(a);
    }


}

