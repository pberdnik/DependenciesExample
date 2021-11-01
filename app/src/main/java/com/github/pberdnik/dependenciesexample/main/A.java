package com.github.pberdnik.dependenciesexample.main;

import com.github.pberdnik.dependenciesexample.core.CoreUtils;
import com.github.pberdnik.dependenciesexample.feat1.Feat1_A;

public class A {
    public A() {
        CoreUtils.doSomething();
        Feat1_A feat1 = new Feat1_A();
        feat1.doStuff();
    }
}
