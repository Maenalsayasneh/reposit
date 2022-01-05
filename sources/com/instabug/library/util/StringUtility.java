package com.instabug.library.util;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.List;

public class StringUtility {
    public static final String ELLIPSIZE = "…";
    private static final String TAG = "StringUtility";

    public static String applyDoubleQuotations(String str) {
        return (str == null || str.trim().length() == 0 || str.startsWith("\"")) ? str : a.o0("\"", str, "\"");
    }

    public static int compareVersion(String str, String str2) throws NumberFormatException {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i >= split.length && i >= split2.length) {
                return 0;
            }
            if (i >= split.length || i >= split2.length) {
                if (i < split.length) {
                    if (Integer.parseInt(split[i]) != 0) {
                        return 1;
                    }
                } else if (i < split2.length && Integer.parseInt(split2[i]) != 0) {
                    return -1;
                }
            } else if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                return -1;
            } else {
                if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                    return 1;
                }
            }
            i++;
        }
    }

    public static String ellipsize(String str, int i) {
        if (str == null || str.trim().length() <= i) {
            return str;
        }
        return str.trim().substring(0, i) + ELLIPSIZE;
    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+(?:\\.\\d+)?");
    }

    public static String removeExtension(String str) {
        return str.replaceFirst("[.][^.]+$", "");
    }

    public static String toCommaSeparated(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() == 0) {
            return sb.toString();
        }
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append(list.get(i));
            sb.append(InstabugDbContract.COMMA_SEP);
        }
        sb.append(list.get(list.size() - 1));
        return sb.toString();
    }

    public static String trimString(String str) {
        return trimString(str, 4096);
    }

    public static String[] trimStrings(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = trimString(strArr[i]);
        }
        return strArr;
    }

    public static String trimString(String str, int i) {
        if (str == null) {
            return "null";
        }
        if (str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i);
        InstabugSDKLogger.i(TAG, "trimming string to " + i);
        return substring;
    }
}
