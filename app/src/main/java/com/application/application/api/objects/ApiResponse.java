package com.application.application.api.objects;

import android.os.Parcelable;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class ApiResponse implements Parcelable {

    public abstract Photos photos();
    public abstract PhotoDetail photo();
    public abstract String stat();
    public abstract String message();
    public abstract int code();

}
