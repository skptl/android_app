package com.application.application.api.objects;

import android.os.Parcelable;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class Photo implements Parcelable {

    public abstract String id();
    public abstract String owner();
    public abstract String secret();
    public abstract String server();
    public abstract String farm();
    public abstract String urlT();
    public abstract String urlQ();
    public abstract String urlC();
    public abstract String urlL();
    public abstract String urlO();
    public abstract String title();

}
