package i0.h.a.b.a.a.d;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class f implements Parcelable.Creator<GoogleSignInOptions> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = h0.b0.v.r2(r15)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r8 = r7
            r9 = r8
            r5 = r2
            r6 = r5
            r10 = r6
            r11 = r10
            r13 = r11
        L_0x000f:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x005f
            int r1 = r15.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            switch(r3) {
                case 1: goto L_0x005a;
                case 2: goto L_0x0053;
                case 3: goto L_0x0049;
                case 4: goto L_0x0044;
                case 5: goto L_0x003f;
                case 6: goto L_0x003a;
                case 7: goto L_0x0035;
                case 8: goto L_0x0030;
                case 9: goto L_0x0029;
                case 10: goto L_0x0024;
                default: goto L_0x0020;
            }
        L_0x0020:
            h0.b0.v.i2(r15, r1)
            goto L_0x000f
        L_0x0024:
            java.lang.String r13 = h0.b0.v.N(r15, r1)
            goto L_0x000f
        L_0x0029:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r2 = com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR
            java.util.ArrayList r2 = h0.b0.v.R(r15, r1, r2)
            goto L_0x000f
        L_0x0030:
            java.lang.String r11 = h0.b0.v.N(r15, r1)
            goto L_0x000f
        L_0x0035:
            java.lang.String r10 = h0.b0.v.N(r15, r1)
            goto L_0x000f
        L_0x003a:
            boolean r9 = h0.b0.v.A1(r15, r1)
            goto L_0x000f
        L_0x003f:
            boolean r8 = h0.b0.v.A1(r15, r1)
            goto L_0x000f
        L_0x0044:
            boolean r7 = h0.b0.v.A1(r15, r1)
            goto L_0x000f
        L_0x0049:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = h0.b0.v.M(r15, r1, r3)
            r6 = r1
            android.accounts.Account r6 = (android.accounts.Account) r6
            goto L_0x000f
        L_0x0053:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r5 = h0.b0.v.R(r15, r1, r3)
            goto L_0x000f
        L_0x005a:
            int r4 = h0.b0.v.G1(r15, r1)
            goto L_0x000f
        L_0x005f:
            h0.b0.v.a0(r15, r0)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r15 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.Map r12 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.K0(r2)
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.a.a.d.f.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
