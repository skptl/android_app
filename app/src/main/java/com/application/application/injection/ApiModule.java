package com.application.application.injection;

import com.application.application.api.DataApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;

import javax.inject.Singleton;

import auto.parcelgson.gson.AutoParcelGsonTypeAdapterFactory;
import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Api module providing dependencies for API
 */
@Module
public class ApiModule {

    @Provides @Singleton
    DataApi provideDiscoverApi(Retrofit retrofit) {
        return retrofit.create(DataApi.class);
    }

    @Provides @Singleton
    Retrofit provideRetrofit(Converter.Factory converterFactory) {
        return new Retrofit.Builder()
                .baseUrl(DataApi.END_POINT)
                .addConverterFactory(converterFactory)
                .build();
    }

    @Provides @Singleton
    Converter.Factory provideConverterFactrory(Gson gson) {
        return GsonConverterFactory.create(gson);
    }

    @Provides @Singleton
    Gson provideGson(TypeAdapterFactory adapterFactory) {
        return new GsonBuilder()
                .registerTypeAdapterFactory(adapterFactory)
                .create();
    }

    @Provides @Singleton
    TypeAdapterFactory provideTypeAdapterFactory() {
        return new AutoParcelGsonTypeAdapterFactory();
    }

}
