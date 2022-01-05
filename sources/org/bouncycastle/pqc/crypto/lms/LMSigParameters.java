package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.a.r2.b;

public class LMSigParameters {
    public static final LMSigParameters a;
    public static final LMSigParameters b;
    public static final LMSigParameters c;
    public static final LMSigParameters d;
    public static final LMSigParameters e;
    public static Map<Object, LMSigParameters> f = new HashMap<Object, LMSigParameters>() {
        {
            LMSigParameters lMSigParameters = LMSigParameters.a;
            put(Integer.valueOf(lMSigParameters.g), lMSigParameters);
            LMSigParameters lMSigParameters2 = LMSigParameters.b;
            put(Integer.valueOf(lMSigParameters2.g), lMSigParameters2);
            LMSigParameters lMSigParameters3 = LMSigParameters.c;
            put(Integer.valueOf(lMSigParameters3.g), lMSigParameters3);
            LMSigParameters lMSigParameters4 = LMSigParameters.d;
            put(Integer.valueOf(lMSigParameters4.g), lMSigParameters4);
            LMSigParameters lMSigParameters5 = LMSigParameters.e;
            put(Integer.valueOf(lMSigParameters5.g), lMSigParameters5);
        }
    };
    public final int g;
    public final int h;
    public final int i;
    public final n j;

    static {
        n nVar = b.c;
        a = new LMSigParameters(5, 32, 5, nVar);
        b = new LMSigParameters(6, 32, 10, nVar);
        c = new LMSigParameters(7, 32, 15, nVar);
        d = new LMSigParameters(8, 32, 20, nVar);
        e = new LMSigParameters(9, 32, 25, nVar);
    }

    public LMSigParameters(int i2, int i3, int i4, n nVar) {
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = nVar;
    }

    public static LMSigParameters a(int i2) {
        return f.get(Integer.valueOf(i2));
    }
}
