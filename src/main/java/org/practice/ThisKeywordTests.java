package org.practice;

import org.junit.jupiter.api.Test;

class ThisKeywordTests {
    private int a = 4;
    private int b = 1;


    public void getSum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a + this.b);
    }
    @Test
        public void Calculate() {
        ThisKeywordTests T = new ThisKeywordTests();
            T.getSum(3, 5);
        }

}


