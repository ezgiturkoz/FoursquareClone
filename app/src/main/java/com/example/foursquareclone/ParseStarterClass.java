package com.example.foursquareclone;


import android.app.Application;
import com.parse.Parse;

public class ParseStarterClass extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QCw0OyoOfMaCHyrrnbv5lYAAsOQRqFCK2QdN1QM7")
                .clientKey("MVARTnWsl4nGS5cgCh83S99j1NvuzDPl0FBeSdDw")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
