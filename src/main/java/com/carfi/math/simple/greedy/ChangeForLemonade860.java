package com.carfi.math.simple.greedy;

/**
 * com.carfi.math.simple.greedy$
 * 860. 柠檬水找零
 * 优先采用10元+5元找零
 * @author ll
 * @date 2020-08-25 11:14:24
 **/
public class ChangeForLemonade860 {
    public boolean lemonadeChange(int[] bills) {
        int fiveYuan = 0;
        int tenYuan = 0;
        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];
            if (bill == 5) {
                fiveYuan++;
            } else if (bill == 10) {
                if (fiveYuan == 0) {
                    return false;
                }
                fiveYuan--;
                tenYuan++;
            } else {
                if (fiveYuan > 0 && tenYuan > 0) {
                    fiveYuan--;
                    tenYuan--;
                } else if (fiveYuan >= 3) {
                    fiveYuan -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
