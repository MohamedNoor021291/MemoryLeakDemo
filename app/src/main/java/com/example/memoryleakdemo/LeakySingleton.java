package com.example.memoryleakdemo;

import android.content.Context;

public class LeakySingleton {

    private static LeakySingleton instance;
    private Context context;

    public LeakySingleton(Context context) {
        this.context = context; // Improper use of context, causes memory leak
    }

    public static LeakySingleton getInstance(Context context) {
        if (instance == null) {
            instance = new LeakySingleton(context);
        }
        return instance;
    }

}
