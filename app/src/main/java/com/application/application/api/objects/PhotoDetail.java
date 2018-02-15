package com.application.application.api.objects;

import android.os.Parcelable;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class PhotoDetail implements Parcelable {

    public abstract String id();
    public abstract String secret();
    public abstract String server();
    public abstract String farm();
    public abstract Content description();
    public abstract Content title();
    public abstract User owner();

}
