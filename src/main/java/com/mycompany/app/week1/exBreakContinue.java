package com.mycompany.app.week1;

public class exBreakContinue {
    public void testBreak(){
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
        System.out.println(i);
        }
    }

    public void testContinue() {
        int n = 10;
        while (n < 10) {
            if (n == 3 || n == 4) {
                n++;
                continue;
            }
        System.out.println(n);
        n++;
        }
    }
}
