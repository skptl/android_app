package com.application.application.ui.activities;

import android.os.Bundle;
import android.util.Log;

import com.application.application.R;
import com.application.application.api.objects.ApiResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViewsToLayoutWithResourceId(R.layout.activity_main);
        dataApi.getSharkImages(1).enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                Log.d("Test", "-----" + response.body().toString());
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                Log.e("Test", t.getMessage());
            }
        });
    }
}
