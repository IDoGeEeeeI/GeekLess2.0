package tier2.less5;

import java.util.Arrays;

public class Main  {
    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {
        foo1();
        foo2();
    }


    public static void foo1(){
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
            }
        System.out.println("превое = " + (System.currentTimeMillis() - a));
        }

    public static void foo2() {
        float[] arr = new float[size];
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);
        

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + arr1[i] / 5) * Math.cos(0.2f + arr1[i] / 5) * Math.cos(0.4f + arr1[i] / 2));
                }
            }
        });
        t1.start();

         t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + arr1[i] / 5) * Math.cos(0.2f + arr1[i] / 5) * Math.cos(0.4f + arr1[i] / 2));
                }
            }
        });
        t1.start();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        System.out.println("второе = " + (System.currentTimeMillis() - a));

    }
}
