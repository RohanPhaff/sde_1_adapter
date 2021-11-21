package com.hz;

public class Adapter {

    public Boolean checkValue(String value) {
        String[] adapter = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        Boolean ans1 = false;

        for (String acceptedValue : adapter) {
            if (ans1 == false) {
                ans1 = value.equals(acceptedValue);
                System.out.println(value.equals(acceptedValue));
            }
        }
        return ans1;
    }
}
