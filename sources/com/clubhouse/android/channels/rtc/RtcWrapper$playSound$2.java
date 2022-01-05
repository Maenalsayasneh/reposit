package com.clubhouse.android.channels.rtc;

import android.content.Context;
import i0.j.f.p.h;
import io.agora.rtc.RtcEngine;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import v0.a.a;

/* compiled from: RtcWrapper.kt */
public final class RtcWrapper$playSound$2 extends Lambda implements l<RtcEngine, i> {
    public final /* synthetic */ RtcWrapper c;
    public final /* synthetic */ Sound d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcWrapper$playSound$2(RtcWrapper rtcWrapper, Sound sound) {
        super(1);
        this.c = rtcWrapper;
        this.d = sound;
    }

    public Object invoke(Object obj) {
        Throwable th;
        RtcEngine rtcEngine = (RtcEngine) obj;
        m0.n.b.i.e(rtcEngine, "it");
        Context context = this.c.d;
        int res = this.d.getRes();
        String fileName = this.d.getFileName();
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(fileName, "assetName");
        File file = new File(context.getCacheDir(), fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                InputStream openRawResource = context.getResources().openRawResource(res);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        m0.n.b.i.d(openRawResource, "src");
                        h.Y(openRawResource, fileOutputStream, 0, 2);
                        h.H(fileOutputStream, (Throwable) null);
                        h.H(openRawResource, (Throwable) null);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        h.H(fileOutputStream, th);
                        throw th3;
                    }
                } finally {
                    th = th;
                    try {
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        h.H(openRawResource, th);
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                a.d.e(th6);
            }
        }
        rtcEngine.getAudioEffectManager().playEffect(this.d.getRes(), file.getAbsolutePath(), 0, 1.0d, 0.0d, 100.0d, false);
        return i.a;
    }
}
