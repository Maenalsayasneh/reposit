package com.clubhouse.android.ui.channels;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import h0.b0.v;
import h0.o.a.k;
import i0.e.b.c3.i.a;
import i0.e.b.f3.i.b;
import i0.e.b.z2.f.e;
import i0.j.f.p.h;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ChannelNavigation.kt */
public final class ChannelNavigation {
    public static final void a(Fragment fragment, e eVar) {
        i.e(fragment, "<this>");
        i.e(eVar, "navigateToChannel");
        b(fragment, eVar.a, eVar.b, eVar.c);
    }

    public static final void b(Fragment fragment, String str, Channel channel, SourceLocation sourceLocation) {
        i.e(fragment, "<this>");
        i.e(str, "channelId");
        i.e(sourceLocation, "sourceLocation");
        FragmentManager supportFragmentManager = fragment.requireActivity().getSupportFragmentManager();
        i.d(supportFragmentManager, "requireActivity().supportFragmentManager");
        k requireActivity = fragment.requireActivity();
        i.d(requireActivity, "requireActivity()");
        c(supportFragmentManager, requireActivity, str, channel, sourceLocation);
    }

    public static final void c(FragmentManager fragmentManager, k kVar, String str, Channel channel, SourceLocation sourceLocation) {
        i.e(fragmentManager, "<this>");
        i.e(kVar, "activity");
        i.e(str, "channelId");
        i.e(sourceLocation, "sourceLocation");
        if (channel != null) {
            ChannelRepo b = ((a) h.L0(((b) h.L0(kVar.getApplicationContext(), b.class)).e(), a.class)).b();
            Objects.requireNonNull(b);
            i.e(channel, Include.INCLUDE_CHANNEL_PARAM_VALUE);
            b.d.put(channel.e(), channel);
        }
        Fragment J = fragmentManager.J(str);
        if (J == null || !J.isAdded()) {
            v.E(kVar, fragmentManager, new ChannelNavigation$navigateToChannel$2$1(str, sourceLocation));
        } else {
            ((ChannelFragment) J).P0();
        }
    }
}
