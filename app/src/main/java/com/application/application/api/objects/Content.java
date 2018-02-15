package com.application.application.api.objects;

import android.os.Parcelable;

import auto.parcelgson.AutoParcelGson;

@AutoParcelGson
public abstract class Content implements Parcelable {

    public abstract String _content();

}
