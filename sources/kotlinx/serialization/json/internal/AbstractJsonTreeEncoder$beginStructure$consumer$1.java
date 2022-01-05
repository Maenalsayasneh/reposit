package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonElement;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: TreeJsonEncoder.kt */
public final class AbstractJsonTreeEncoder$beginStructure$consumer$1 extends Lambda implements l<JsonElement, i> {
    public final /* synthetic */ AbstractJsonTreeEncoder c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractJsonTreeEncoder$beginStructure$consumer$1(AbstractJsonTreeEncoder abstractJsonTreeEncoder) {
        super(1);
        this.c = abstractJsonTreeEncoder;
    }

    public Object invoke(Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        m0.n.b.i.e(jsonElement, "node");
        AbstractJsonTreeEncoder abstractJsonTreeEncoder = this.c;
        abstractJsonTreeEncoder.O((String) g.G(abstractJsonTreeEncoder.a), jsonElement);
        return i.a;
    }
}
