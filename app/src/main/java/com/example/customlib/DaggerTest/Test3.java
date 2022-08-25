package com.example.customlib.DaggerTest;

import dagger.Module;
import dagger.Provides;

@Module
public class Test3 {

    Test1 test1;
    Test2 test2;

    public Test3(Test1 test1, Test2 test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    @Provides
    Test1 provideTest1() {
        return test1;
    }

    @Provides
    Test2 provideTest2() {
        return test2;
    }


    public void testFun() {

    }
}



