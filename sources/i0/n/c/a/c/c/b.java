package i0.n.c.a.c.c;

import com.sinch.metadata.model.PhoneMetadata;
import i0.n.c.a.c.b.a;
import java.util.List;
import m0.n.b.i;

/* compiled from: VerificationMethodConfig.kt */
public abstract class b<ApiService> {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<?> e;
    public final ApiService f;
    public final a g;
    public final i0.n.c.c.a<PhoneMetadata> h;

    public b(String str, String str2, String str3, boolean z, List<?> list, ApiService apiservice, a aVar, i0.n.c.c.a<PhoneMetadata> aVar2) {
        i.e(str, "number");
        i.e(list, "acceptedLanguages");
        i.e(aVar, "globalConfig");
        i.e(aVar2, "metadataFactory");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = list;
        this.f = apiservice;
        this.g = aVar;
        this.h = aVar2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Number: ");
        i0.d.a.a.a.r(P0, this.a, ' ', "custom: ");
        P0.append(this.b);
        P0.append(" reference: ");
        P0.append(this.c);
        P0.append(" honourEarlyReject: ");
        P0.append(this.d);
        P0.append(' ');
        P0.append("acceptedLanguages: ");
        P0.append(this.e);
        return P0.toString();
    }
}
