package com.imedbox.interfaces;

import com.imedbox.datamodel.ThingsSpeakPOJO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ThingsSpeakAPIInterface {

    @GET("")
    Call<ThingsSpeakPOJO> getLatestIndicators();
}
