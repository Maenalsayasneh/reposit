package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final String c;
    public static final DefaultIndenter d;
    public final char[] q;
    public final int x;
    public final String y;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        c = str;
        d = new DefaultIndenter("  ", str);
    }

    public DefaultIndenter(String str, String str2) {
        this.x = str.length();
        this.q = new char[(str.length() * 16)];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            str.getChars(0, str.length(), this.q, i);
            i += str.length();
        }
        this.y = str2;
    }

    public void a(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.A0(this.y);
        if (i > 0) {
            int i2 = i * this.x;
            while (true) {
                char[] cArr = this.q;
                if (i2 > cArr.length) {
                    jsonGenerator.C0(cArr, 0, cArr.length);
                    i2 -= this.q.length;
                } else {
                    jsonGenerator.C0(cArr, 0, i2);
                    return;
                }
            }
        }
    }
}
