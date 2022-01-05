package h0.m.a;

import h0.a0.a.a.a;
import java.nio.ByteBuffer;

/* compiled from: EmojiMetadata */
public class b {
    public static final ThreadLocal<a> a = new ThreadLocal<>();
    public final int b;
    public final f c;
    public volatile int d = 0;

    public b(f fVar, int i) {
        this.c = fVar;
        this.b = i;
    }

    public int a(int i) {
        a e = e();
        int a2 = e.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = e.b;
        int i2 = a2 + e.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public int b() {
        a e = e();
        int a2 = e.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + e.a;
        return e.b.getInt(e.b.getInt(i) + i);
    }

    public short c() {
        a e = e();
        int a2 = e.a(14);
        if (a2 != 0) {
            return e.b.getShort(a2 + e.a);
        }
        return 0;
    }

    public int d() {
        a e = e();
        int a2 = e.a(4);
        if (a2 != 0) {
            return e.b.getInt(a2 + e.a);
        }
        return 0;
    }

    public final a e() {
        ThreadLocal<a> threadLocal = a;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        h0.a0.a.a.b bVar = this.c.a;
        int i = this.b;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i2 = a2 + bVar.a;
            int i3 = (i * 4) + bVar.b.getInt(i2) + i2 + 4;
            ByteBuffer byteBuffer = bVar.b;
            aVar.a = bVar.b.getInt(i3) + i3;
            aVar.b = byteBuffer;
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(d()));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i = 0; i < b2; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
