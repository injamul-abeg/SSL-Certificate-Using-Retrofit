package com.example.sslcertificateusingretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApiService {
    @GET("api/emi-list/353658070683824/S6067AEVT21219065")
    Call<Root> getSomeData(); // Replace with your API endpoint and response model
}
