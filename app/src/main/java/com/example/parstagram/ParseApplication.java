package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("l8z42xMra6QDExQY6dyl7GhHJeUWllYbtPoc0FDq")
                .clientKey("9CqHV0cg59KHz0WvkQ3imQxVPzFIDslAbrl21E5g")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
