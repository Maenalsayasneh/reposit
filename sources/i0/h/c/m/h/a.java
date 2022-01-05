package i0.h.c.m.h;

import com.google.firebase.encoders.EncodingException;
import i0.h.c.m.d;
import i0.h.c.m.h.e;

/* compiled from: JsonDataEncoderBuilder */
public final /* synthetic */ class a implements d {
    public static final a a = new a();

    public void a(Object obj, Object obj2) {
        e.a aVar = e.a;
        StringBuilder P0 = i0.d.a.a.a.P0("Couldn't find encoder for type ");
        P0.append(obj.getClass().getCanonicalName());
        throw new EncodingException(P0.toString());
    }
}
