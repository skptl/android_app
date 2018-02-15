package com.application.application.api.objects;

import android.os.Parcelable;

import java.util.List;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class Photos implements Parcelable {

    public abstract int page();
    public abstract int pages();
    public abstract int perpage();
    public abstract String total();
    public abstract List<Photo> photo();

}
