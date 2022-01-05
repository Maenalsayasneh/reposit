package org.bouncycastle.pqc.crypto.lms;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.HashMap;
import java.util.Map;
import s0.a.a.n;
import s0.a.a.r2.b;

public class LMOtsParameters {
    public static final LMOtsParameters a;
    public static final LMOtsParameters b;
    public static final LMOtsParameters c;
    public static final LMOtsParameters d;
    public static final Map<Object, LMOtsParameters> e = new HashMap<Object, LMOtsParameters>() {
        {
            LMOtsParameters lMOtsParameters = LMOtsParameters.a;
            put(Integer.valueOf(lMOtsParameters.f), lMOtsParameters);
            LMOtsParameters lMOtsParameters2 = LMOtsParameters.b;
            put(Integer.valueOf(lMOtsParameters2.f), lMOtsParameters2);
            LMOtsParameters lMOtsParameters3 = LMOtsParameters.c;
            put(Integer.valueOf(lMOtsParameters3.f), lMOtsParameters3);
            LMOtsParameters lMOtsParameters4 = LMOtsParameters.d;
            put(Integer.valueOf(lMOtsParameters4.f), lMOtsParameters4);
        }
    };
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final n j;

    static {
        n nVar = b.c;
        a = new LMOtsParameters(1, 32, 1, 265, 7, 8516, nVar);
        b = new LMOtsParameters(2, 32, 2, PubNubErrorBuilder.PNERR_CONNECTION_NOT_SET, 6, 4292, nVar);
        c = new LMOtsParameters(3, 32, 4, 67, 4, 2180, nVar);
        d = new LMOtsParameters(4, 32, 8, 34, 0, 1124, nVar);
    }

    public LMOtsParameters(int i2, int i3, int i4, int i5, int i6, int i7, n nVar) {
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = nVar;
    }

    public static LMOtsParameters a(int i2) {
        return e.get(Integer.valueOf(i2));
    }
}
