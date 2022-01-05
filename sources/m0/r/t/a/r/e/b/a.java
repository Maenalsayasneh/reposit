package m0.r.t.a.r.e.b;

import com.pubnub.api.PubNubUtil;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.d;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public final class a implements j.d {
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> a;
    public final /* synthetic */ HashMap<m, List<A>> b;
    public final /* synthetic */ HashMap<m, C> c;

    /* renamed from: m0.r.t.a.r.e.b.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public final class C0259a extends b implements j.e {
        public final /* synthetic */ a d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0259a(a aVar, m mVar) {
            super(aVar, mVar);
            i.e(aVar, "this$0");
            i.e(mVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
            this.d = aVar;
        }

        public j.a c(int i, m0.r.t.a.r.g.a aVar, h0 h0Var) {
            i.e(aVar, "classId");
            i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
            m e = m.e(this.a, i);
            List list = this.d.b.get(e);
            if (list == null) {
                list = new ArrayList();
                this.d.b.put(e, list);
            }
            return AbstractBinaryClassAnnotationAndConstantLoader.k(this.d.a, aVar, h0Var, list);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public class b implements j.c {
        public final m a;
        public final ArrayList<A> b = new ArrayList<>();
        public final /* synthetic */ a c;

        public b(a aVar, m mVar) {
            i.e(aVar, "this$0");
            i.e(mVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
            this.c = aVar;
            this.a = mVar;
        }

        public void a() {
            if (!this.b.isEmpty()) {
                this.c.b.put(this.a, this.b);
            }
        }

        public j.a b(m0.r.t.a.r.g.a aVar, h0 h0Var) {
            i.e(aVar, "classId");
            i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
            return AbstractBinaryClassAnnotationAndConstantLoader.k(this.c.a, aVar, h0Var, this.b);
        }
    }

    public a(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, HashMap<m, List<A>> hashMap, HashMap<m, C> hashMap2) {
        this.a = abstractBinaryClassAnnotationAndConstantLoader;
        this.b = hashMap;
        this.c = hashMap2;
    }

    public j.c a(d dVar, String str, Object obj) {
        i.e(dVar, "name");
        i.e(str, "desc");
        String b2 = dVar.b();
        i.d(b2, "name.asString()");
        return new b(this, m.a(b2, str));
    }

    public j.e b(d dVar, String str) {
        i.e(dVar, "name");
        i.e(str, "desc");
        String b2 = dVar.b();
        i.d(b2, "name.asString()");
        return new C0259a(this, m.d(b2, str));
    }
}
