package i0.e.b.f3.j;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import i0.e.b.b3.b.e.j;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: RemoteSearchDataSource.kt */
public final class g {
    public final h a;
    public final i b;
    public final c c;
    public final b d;

    public g(h hVar, i iVar, c cVar, b bVar) {
        i.e(hVar, "searchV2RequestFactory");
        i.e(iVar, "userSearchRequestFactory");
        i.e(cVar, "clubSearchRequestFactory");
        i.e(bVar, "clubMemberSearchRequestFactory");
        this.a = hVar;
        this.b = iVar;
        this.c = cVar;
        this.d = bVar;
    }

    public final f<FollowScopedSearchRequest, j> a(f0 f0Var) {
        i.e(f0Var, "coroutineScope");
        return new f<>(f0Var, this.b);
    }
}
