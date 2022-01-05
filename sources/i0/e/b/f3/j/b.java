package i0.e.b.f3.j;

import com.clubhouse.android.data.models.remote.request.ClubMemberSearchRequest;
import com.clubhouse.android.data.network.paging.EntityAwarePagingDataSource;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.ClubRepo$searchClubMembers$1;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.u.u;
import h0.u.v;
import i0.e.b.f3.i.a;
import i0.e.b.f3.j.f;
import i0.j.f.p.h;
import java.util.Objects;
import m0.n.b.i;
import n0.a.g2.d;

/* compiled from: RemoteSearchDataSource.kt */
public final class b implements f.a<ClubMemberSearchRequest, i0.e.b.b3.b.e.f> {
    public final ClubRepo a;

    public b(a aVar) {
        i.e(aVar, "userComponentHandler");
        this.a = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).l();
    }

    public d a(i0.e.b.b3.a.b.a.a aVar) {
        ClubMemberSearchRequest clubMemberSearchRequest = (ClubMemberSearchRequest) aVar;
        i.e(clubMemberSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        ClubRepo clubRepo = this.a;
        Objects.requireNonNull(clubRepo);
        i.e(clubMemberSearchRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        return new EntityAwarePagingDataSource(clubRepo.e, clubRepo.d, clubRepo.h, clubRepo.f, clubRepo.a, new u(new v(50, 5, false, 50, 0, 0, 52), (Object) null, new ClubRepo$searchClubMembers$1(clubRepo, clubMemberSearchRequest), 2)).e;
    }
}
