package com.qf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class A {
    private B b;

    public void setB(B b) {
        this.b = b;
    }

    public B getB() {

        return b;
    }
}
