package i0.e.b.f3.j;

import com.clubhouse.android.data.models.remote.request.SearchV2Request;
import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.data.repos.UserRepo$search$1;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.u.u;
import h0.u.v;
import i0.e.b.b3.b.e.j;
import i0.e.b.f3.i.a;
import i0.e.b.f3.j.f;
import java.util.Objects;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: RemoteSearchDataSource.kt */
public final class h implements f.a<SearchV2Request, j> {
    public final UserRepo a;

    public h(a aVar) {
        i.e(aVar, "userComponentHandler");
        this.a = ((i0.e.b.c3.i.a) i0.j.f.p.h.L0(aVar, i0.e.b.c3.i.a.class)).c();
    }

    public d a(i0.e.b.b3.a.b.a.a aVar) {
        SearchV2Request searchV2Request = (SearchV2Request) aVar;
        i.e(searchV2Request, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        UserRepo userRepo = this.a;
        Objects.requireNonNull(userRepo);
        i.e(searchV2Request, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return new EntityAwarePagingDataSource(userRepo.c, userRepo, userRepo.e, userRepo.f, userRepo.a, new u(new v(50, 10, false, 50, 0, 0, 52), (Object) null, new UserRepo$search$1(userRepo, searchV2Request), 2)).e;
    }
}
