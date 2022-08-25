package com.example.customlib.DaggerTest;

import dagger.Component;

@Component(modules = Test3.class)
public interface TestInterface2 {

    Test getTest();

    Test1 getTest1();

    Test2 getTest2();


}
