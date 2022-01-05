package com.instabug.library.util;

import i0.d.a.a.a;

public final class URLUtil {
    public static String resolve(String str) {
        return (str == null || str.startsWith("https://") || str.startsWith("http://")) ? str : a.n0("http://", str);
    }
}
