package i0.h.a.d.a.b;

import android.support.annotation.Nullable;

public final class f2 {
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;

    public f2() {
    }

    public f2(int i, @Nullable String str, long j, long j2, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r1 = r7.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof i0.h.a.d.a.b.f2
            r2 = 0
            if (r1 == 0) goto L_0x003a
            i0.h.a.d.a.b.f2 r8 = (i0.h.a.d.a.b.f2) r8
            int r1 = r7.a
            int r3 = r8.a
            if (r1 != r3) goto L_0x003a
            java.lang.String r1 = r7.b
            if (r1 != 0) goto L_0x001a
            java.lang.String r1 = r8.b
            if (r1 != 0) goto L_0x003a
            goto L_0x0023
        L_0x001a:
            java.lang.String r3 = r8.b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0023
            goto L_0x003a
        L_0x0023:
            long r3 = r7.c
            long r5 = r8.c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            int r1 = r7.e
            int r8 = r8.e
            if (r1 != r8) goto L_0x003a
            return r0
        L_0x003a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.d.a.b.f2.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.c;
        long j2 = this.d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        long j = this.c;
        long j2 = this.d;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
