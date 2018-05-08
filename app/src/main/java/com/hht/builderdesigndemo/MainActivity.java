package com.hht.builderdesigndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Computer computer = new ComputerBuilder().setDisplayer("联想").setKeyboard("飞利浦").setMainboard("双飞燕").setMouse
                ("扬天").create();
        computer.show();
    }
}
