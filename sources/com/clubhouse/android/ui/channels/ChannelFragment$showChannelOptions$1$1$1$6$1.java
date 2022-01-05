package com.clubhouse.android.ui.channels;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.clubhouse.android.channels.R;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.instabug.library.model.NetworkLog;
import i0.e.b.z2.g.k;
import i0.e.b.z2.g.l;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$showChannelOptions$1$1$1$6$1 extends Lambda implements a<i> {
    public final /* synthetic */ ChannelFragment c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$showChannelOptions$1$1$1$6$1(ChannelFragment channelFragment, l lVar) {
        super(0);
        this.c = channelFragment;
        this.d = lVar;
    }

    public Object invoke() {
        Integer num;
        Context requireContext = this.c.requireContext();
        m0.n.b.i.d(requireContext, "requireContext()");
        k kVar = this.d.a;
        m0.n.b.i.e(requireContext, "<this>");
        m0.n.b.i.e(kVar, "state");
        m0.n.b.i.e(requireContext, "<this>");
        if (new File(requireContext.getFilesDir(), "clubhouse.log").exists()) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(NetworkLog.PLAIN_TEXT);
            m0.n.b.i.e(requireContext, "<this>");
            String k = m0.n.b.i.k(requireContext.getPackageName(), ".provider");
            m0.n.b.i.e(requireContext, "<this>");
            Uri b = FileProvider.a(requireContext, k).b(new File(requireContext.getFilesDir(), "clubhouse.log").getAbsoluteFile());
            m0.n.b.i.d(b, "getUriForFile(this, \"$packageName.provider\", audioLog().absoluteFile)");
            intent.putExtra("android.intent.extra.STREAM", b);
            intent.putExtra("android.intent.extra.SUBJECT", "Clubhouse Android Audio Bug Report");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"androidaudiofeedback@clubhouse.com"});
            StringBuilder P0 = i0.d.a.a.a.P0("Channel: ");
            P0.append(kVar.a);
            P0.append("\n Self ID : ");
            UserInChannel userInChannel = kVar.d.a;
            if (userInChannel == null) {
                num = null;
            } else {
                num = userInChannel.getId();
            }
            P0.append(num);
            P0.append("\n Speaker: ");
            P0.append(kVar.d.h());
            intent.putExtra("android.intent.extra.TEXT", P0.toString());
            i0.d.a.a.a.e(requireContext, R.string.share_audio_debug, intent);
        }
        return i.a;
    }
}
