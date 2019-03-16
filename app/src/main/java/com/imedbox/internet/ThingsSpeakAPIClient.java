package com.imedbox.internet;

import retrofit2.Retrofit;

public class ThingsSpeakAPIClient {
    private static Retrofit retrofit = null;

    static Retrofit getClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .build();


        return retrofit;
    }
}
