package i0.e.b.f3.j;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.data.repos.UserRepo$searchUsers$1;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.u.u;
import h0.u.v;
import i0.e.b.b3.b.e.j;
import i0.e.b.f3.i.a;
import i0.e.b.f3.j.f;
import i0.j.f.p.h;
import java.util.Objects;
import n0.a.g2.d;

/* compiled from: RemoteSearchDataSource.kt */
public final class i implements f.a<FollowScopedSearchRequest, j> {
    public final UserRepo a;

    public i(a aVar) {
        m0.n.b.i.e(aVar, "userComponentHandler");
        this.a = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
    }

    public d a(i0.e.b.b3.a.b.a.a aVar) {
        FollowScopedSearchRequest followScopedSearchRequest = (FollowScopedSearchRequest) aVar;
        m0.n.b.i.e(followScopedSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        UserRepo userRepo = this.a;
        Objects.requireNonNull(userRepo);
        m0.n.b.i.e(followScopedSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return new EntityAwarePagingDataSource(userRepo.c, userRepo, userRepo.e, userRepo.f, userRepo.a, new u(new v(50, 10, false, 50, 0, 0, 52), (Object) null, new UserRepo$searchUsers$1(userRepo, followScopedSearchRequest), 2)).e;
    }
}
