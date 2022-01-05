package com.clubhouse.android.ui.creation;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetCreateChannelTargetsResponse;
import com.clubhouse.android.databinding.FragmentCreateChannelBinding;
import com.clubhouse.app.R;
import h0.b0.g;
import h0.b0.n;
import h0.b0.v;
import h0.q.q;
import i0.e.b.d3.k;
import i0.e.b.g3.n.e;
import i0.e.b.g3.n.f;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.creation.CreateChannelFragment$onViewCreated$9", f = "CreateChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$onViewCreated$9 extends SuspendLambda implements p<GetCreateChannelTargetsResponse, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CreateChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$onViewCreated$9(CreateChannelFragment createChannelFragment, m0.l.c<? super CreateChannelFragment$onViewCreated$9> cVar) {
        super(2, cVar);
        this.d = createChannelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CreateChannelFragment$onViewCreated$9 createChannelFragment$onViewCreated$9 = new CreateChannelFragment$onViewCreated$9(this.d, cVar);
        createChannelFragment$onViewCreated$9.c = obj;
        return createChannelFragment$onViewCreated$9;
    }

    public Object invoke(Object obj, Object obj2) {
        CreateChannelFragment$onViewCreated$9 createChannelFragment$onViewCreated$9 = new CreateChannelFragment$onViewCreated$9(this.d, (m0.l.c) obj2);
        createChannelFragment$onViewCreated$9.c = (GetCreateChannelTargetsResponse) obj;
        i iVar = i.a;
        createChannelFragment$onViewCreated$9.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        GetCreateChannelTargetsResponse getCreateChannelTargetsResponse = (GetCreateChannelTargetsResponse) this.c;
        if (!getCreateChannelTargetsResponse.b.isEmpty()) {
            CreateChannelFragment createChannelFragment = this.d;
            EventInClub eventInClub = getCreateChannelTargetsResponse.b.get(0);
            n.c(new g(((FragmentCreateChannelBinding) createChannelFragment.s2.getValue(createChannelFragment, CreateChannelFragment.q2[1])).a, createChannelFragment.V0().a), new h0.b0.c());
            createChannelFragment.V0().e.setText(eventInClub.a2);
            OffsetDateTime offsetDateTime = eventInClub.c2;
            if (offsetDateTime != null) {
                createChannelFragment.V0().d.setText(v.L1(offsetDateTime));
            }
            ClubWithAdmin clubWithAdmin = eventInClub.c;
            if (!(clubWithAdmin == null || (str = clubWithAdmin.y) == null)) {
                TextView textView = createChannelFragment.V0().b;
                m0.n.b.i.d(textView, "eventBinding.clubName");
                k.K(textView);
                createChannelFragment.V0().b.setText(createChannelFragment.getResources().getString(R.string.from_club, new Object[]{str}));
            }
            LinearLayout linearLayout = createChannelFragment.V0().c;
            m0.n.b.i.d(linearLayout, "eventBinding.eventCell");
            h0.q.p viewLifecycleOwner = createChannelFragment.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            k.H(linearLayout, q.a(viewLifecycleOwner), new f(createChannelFragment, eventInClub));
            Button button = createChannelFragment.V0().f;
            m0.n.b.i.d(button, "eventBinding.startDifferentRoom");
            h0.q.p viewLifecycleOwner2 = createChannelFragment.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
            k.H(button, q.a(viewLifecycleOwner2), new e(createChannelFragment));
        } else {
            n.c((g) this.d.v2.getValue(), new h0.b0.c());
        }
        return i.a;
    }
}
