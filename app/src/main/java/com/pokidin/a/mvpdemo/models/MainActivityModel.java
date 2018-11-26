package com.pokidin.a.mvpdemo.models;

import com.pokidin.a.mvpdemo.contracts.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {
    private int counter;

    @Override
    public String getData() {
        String message = "Hello world! \n";
        if (counter == 0) {
            counter++;
        } else {
            message += counter++;
        }
        return message;
    }
}
