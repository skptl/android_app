package com.application.application.utils;

import android.support.annotation.Nullable;

/**
 * Utility class
 */
public class Preconditions {

    public static <T> T checkNotNull(T reference, @Nullable Object errorMessage) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(errorMessage));
        }
        return reference;
    }

}
