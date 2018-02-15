package com.application.application.api.objects;

import android.os.Parcelable;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class User implements Parcelable {

    public abstract String nsid();
    public abstract String username();
    public abstract String realname();
    public abstract String location();

}
