package i0.h.a.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.common.LocalTestingException;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.j.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class n1 implements e3 {
    public static final f a = new f("FakeAssetPackService");
    public final String b;
    public final s c;
    public final Context d;
    public final a2 e;
    public final a0<Executor> f;
    public final Handler g = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public n1(File file, s sVar, r0 r0Var, Context context, a2 a2Var, a0<Executor> a0Var) {
        this.b = file.getAbsolutePath();
        this.c = sVar;
        this.d = context;
        this.e = a2Var;
        this.f = a0Var;
    }

    public static long a(int i, long j) {
        if (i == 2) {
            return j / 2;
        }
        if (i == 3 || i == 4) {
            return j;
        }
        return 0;
    }

    public final File[] b(String str) throws LocalTestingException {
        File file = new File(this.b);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new l1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File n : listFiles) {
                        if (b.n(n).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new LocalTestingException(String.format("No master slice available for pack '%s'.", new Object[]{str}));
                }
                throw new LocalTestingException(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new LocalTestingException(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void c(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.e.a());
        bundle.putInt("session_id", i);
        File[] b2 = b(str);
        ArrayList arrayList = new ArrayList();
        int length = b2.length;
        long j = 0;
        int i3 = 0;
        while (i3 < length) {
            File file = b2[i3];
            j += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String n = b.n(file);
            bundle.putParcelableArrayList(b.G("chunk_intents", str, n), arrayList2);
            try {
                bundle.putString(b.G("uncompressed_hash_sha256", str, n), p1.a(Arrays.asList(new File[]{file})));
                bundle.putLong(b.G("uncompressed_size", str, n), file.length());
                arrayList.add(n);
                i3++;
            } catch (NoSuchAlgorithmException e2) {
                throw new LocalTestingException("SHA256 algorithm not supported.", e2);
            } catch (IOException e3) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", new Object[]{file}), e3);
            }
        }
        bundle.putStringArrayList(b.F("slice_ids", str), arrayList);
        bundle.putLong(b.F("pack_version", str), (long) this.e.a());
        bundle.putInt(b.F("status", str), i2);
        bundle.putInt(b.F("error_code", str), 0);
        bundle.putLong(b.F("bytes_downloaded", str), a(i2, j));
        bundle.putLong(b.F("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", a(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        this.g.post(new m1(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    public final void h() {
        a.b(4, "keepAlive", new Object[0]);
    }

    public final void i(List<String> list) {
        a.b(4, "cancelDownload(%s)", new Object[]{list});
    }

    public final void j(int i) {
        a.b(4, "notifySessionFailed", new Object[0]);
    }

    public final void k(int i, String str, String str2, int i2) {
        a.b(4, "notifyChunkTransferred", new Object[0]);
    }

    public final void l(int i, String str) {
        a.b(4, "notifyModuleCompleted", new Object[0]);
        this.f.a().execute(new k1(this, i, str));
    }

    public final p<ParcelFileDescriptor> m(int i, String str, String str2, int i2) {
        a.b(4, "getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)});
        p<ParcelFileDescriptor> pVar = new p<>();
        try {
            for (File file : b(str)) {
                if (b.n(file).equals(str2)) {
                    pVar.a(ParcelFileDescriptor.open(file, 268435456));
                    return pVar;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e2) {
            a.b(5, "getChunkFileDescriptor failed", new Object[]{e2});
            pVar.e(new LocalTestingException("Asset Slice file not found.", e2));
        } catch (LocalTestingException e3) {
            a.b(5, "getChunkFileDescriptor failed", new Object[]{e3});
            pVar.e(e3);
        }
    }

    public final p<List<String>> n(Map<String, Long> map) {
        a.b(4, "syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        p<List<String>> pVar = new p<>();
        pVar.a(arrayList);
        return pVar;
    }
}
