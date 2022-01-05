package i0.e.b.f3.j;

import androidx.paging.PageFetcher;
import androidx.paging.Pager$flow$1;
import androidx.paging.Pager$flow$2;
import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.ClubRepo$searchClubs$1;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.u.e0;
import h0.u.v;
import i0.e.b.b3.b.e.j;
import i0.e.b.f3.i.a;
import i0.e.b.f3.j.f;
import i0.j.f.p.h;
import java.util.Objects;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: RemoteSearchDataSource.kt */
public final class c implements f.a<FollowScopedSearchRequest, j> {
    public final ClubRepo a;

    public c(a aVar) {
        i.e(aVar, "userComponentHandler");
        this.a = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).l();
    }

    public d a(i0.e.b.b3.a.b.a.a aVar) {
        l lVar;
        FollowScopedSearchRequest followScopedSearchRequest = (FollowScopedSearchRequest) aVar;
        i.e(followScopedSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        ClubRepo clubRepo = this.a;
        Objects.requireNonNull(clubRepo);
        i.e(followScopedSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        v vVar = new v(25, 10, false, 25, 0, 0, 52);
        ClubRepo$searchClubs$1 clubRepo$searchClubs$1 = new ClubRepo$searchClubs$1(clubRepo, followScopedSearchRequest);
        i.e(vVar, "config");
        i.e(clubRepo$searchClubs$1, "pagingSourceFactory");
        i.e(vVar, "config");
        i.e(clubRepo$searchClubs$1, "pagingSourceFactory");
        if (clubRepo$searchClubs$1 instanceof e0) {
            lVar = new Pager$flow$1(clubRepo$searchClubs$1);
        } else {
            lVar = new Pager$flow$2(clubRepo$searchClubs$1, (m0.l.c) null);
        }
        return new PageFetcher(lVar, (Object) null, vVar).c;
    }
}
