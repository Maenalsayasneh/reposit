package h0.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g.c.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class c {
    public static final int[] a = {0, 4, 8};
    public static SparseIntArray b = new SparseIntArray();
    public static SparseIntArray c = new SparseIntArray();
    public String d;
    public String e = "";
    public int f = 0;
    public HashMap<String, ConstraintAttribute> g = new HashMap<>();
    public boolean h = true;
    public HashMap<Integer, a> i = new HashMap<>();

    /* compiled from: ConstraintSet */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final C0036c d = new C0036c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, ConstraintAttribute> g = new HashMap<>();
        public C0035a h;

        /* renamed from: h0.g.c.c$a$a  reason: collision with other inner class name */
        /* compiled from: ConstraintSet */
        public static class C0035a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i2, float f2) {
                int i3 = this.f;
                int[] iArr = this.d;
                if (i3 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i4 = this.f;
                iArr2[i4] = i2;
                float[] fArr2 = this.e;
                this.f = i4 + 1;
                fArr2[i4] = f2;
            }

            public void b(int i2, int i3) {
                int i4 = this.c;
                int[] iArr = this.a;
                if (i4 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i5 = this.c;
                iArr3[i5] = i2;
                int[] iArr4 = this.b;
                this.c = i5 + 1;
                iArr4[i5] = i3;
            }

            public void c(int i2, String str) {
                int i3 = this.i;
                int[] iArr = this.g;
                if (i3 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i4 = this.i;
                iArr2[i4] = i2;
                String[] strArr2 = this.h;
                this.i = i4 + 1;
                strArr2[i4] = str;
            }

            public void d(int i2, boolean z) {
                int i3 = this.l;
                int[] iArr = this.j;
                if (i3 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i4 = this.l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.k;
                this.l = i4 + 1;
                zArr2[i4] = z;
            }

            public void e(a aVar) {
                for (int i2 = 0; i2 < this.c; i2++) {
                    int i3 = this.a[i2];
                    int i4 = this.b[i2];
                    int[] iArr = c.a;
                    if (i3 == 6) {
                        aVar.e.D = i4;
                    } else if (i3 == 7) {
                        aVar.e.E = i4;
                    } else if (i3 == 8) {
                        aVar.e.K = i4;
                    } else if (i3 == 27) {
                        aVar.e.F = i4;
                    } else if (i3 == 28) {
                        aVar.e.H = i4;
                    } else if (i3 == 41) {
                        aVar.e.W = i4;
                    } else if (i3 == 42) {
                        aVar.e.X = i4;
                    } else if (i3 == 61) {
                        aVar.e.A = i4;
                    } else if (i3 == 62) {
                        aVar.e.B = i4;
                    } else if (i3 == 72) {
                        aVar.e.f26g0 = i4;
                    } else if (i3 == 73) {
                        aVar.e.f27h0 = i4;
                    } else if (i3 == 2) {
                        aVar.e.J = i4;
                    } else if (i3 == 31) {
                        aVar.e.L = i4;
                    } else if (i3 == 34) {
                        aVar.e.I = i4;
                    } else if (i3 == 38) {
                        aVar.a = i4;
                    } else if (i3 == 64) {
                        aVar.d.c = i4;
                    } else if (i3 == 66) {
                        aVar.d.g = i4;
                    } else if (i3 == 76) {
                        aVar.d.f = i4;
                    } else if (i3 == 78) {
                        aVar.c.c = i4;
                    } else if (i3 == 97) {
                        aVar.e.f35p0 = i4;
                    } else if (i3 == 93) {
                        aVar.e.M = i4;
                    } else if (i3 != 94) {
                        switch (i3) {
                            case 11:
                                aVar.e.Q = i4;
                                break;
                            case 12:
                                aVar.e.R = i4;
                                break;
                            case 13:
                                aVar.e.N = i4;
                                break;
                            case 14:
                                aVar.e.P = i4;
                                break;
                            case 15:
                                aVar.e.S = i4;
                                break;
                            case 16:
                                aVar.e.O = i4;
                                break;
                            case 17:
                                aVar.e.f = i4;
                                break;
                            case 18:
                                aVar.e.g = i4;
                                break;
                            default:
                                switch (i3) {
                                    case 21:
                                        aVar.e.e = i4;
                                        break;
                                    case 22:
                                        aVar.c.b = i4;
                                        break;
                                    case 23:
                                        aVar.e.d = i4;
                                        break;
                                    case 24:
                                        aVar.e.G = i4;
                                        break;
                                    default:
                                        switch (i3) {
                                            case 54:
                                                aVar.e.Y = i4;
                                                break;
                                            case 55:
                                                aVar.e.Z = i4;
                                                break;
                                            case 56:
                                                aVar.e.a0 = i4;
                                                break;
                                            case 57:
                                                aVar.e.b0 = i4;
                                                break;
                                            case 58:
                                                aVar.e.c0 = i4;
                                                break;
                                            case 59:
                                                aVar.e.d0 = i4;
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 82:
                                                        aVar.d.d = i4;
                                                        break;
                                                    case 83:
                                                        aVar.f.j = i4;
                                                        break;
                                                    case 84:
                                                        aVar.d.l = i4;
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                aVar.d.n = i4;
                                                                break;
                                                            case 89:
                                                                aVar.d.o = i4;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.e.T = i4;
                    }
                }
                for (int i5 = 0; i5 < this.f; i5++) {
                    int i6 = this.d[i5];
                    float f2 = this.e[i5];
                    int[] iArr2 = c.a;
                    if (i6 == 19) {
                        aVar.e.h = f2;
                    } else if (i6 == 20) {
                        aVar.e.x = f2;
                    } else if (i6 == 37) {
                        aVar.e.y = f2;
                    } else if (i6 == 60) {
                        aVar.f.c = f2;
                    } else if (i6 == 63) {
                        aVar.e.C = f2;
                    } else if (i6 == 79) {
                        aVar.d.h = f2;
                    } else if (i6 == 85) {
                        aVar.d.k = f2;
                    } else if (i6 != 87) {
                        if (i6 == 39) {
                            aVar.e.V = f2;
                        } else if (i6 != 40) {
                            switch (i6) {
                                case 43:
                                    aVar.c.d = f2;
                                    break;
                                case 44:
                                    e eVar = aVar.f;
                                    eVar.o = f2;
                                    eVar.n = true;
                                    break;
                                case 45:
                                    aVar.f.d = f2;
                                    break;
                                case 46:
                                    aVar.f.e = f2;
                                    break;
                                case 47:
                                    aVar.f.f = f2;
                                    break;
                                case 48:
                                    aVar.f.g = f2;
                                    break;
                                case 49:
                                    aVar.f.h = f2;
                                    break;
                                case 50:
                                    aVar.f.i = f2;
                                    break;
                                case 51:
                                    aVar.f.k = f2;
                                    break;
                                case 52:
                                    aVar.f.l = f2;
                                    break;
                                case 53:
                                    aVar.f.m = f2;
                                    break;
                                default:
                                    switch (i6) {
                                        case 67:
                                            aVar.d.j = f2;
                                            break;
                                        case 68:
                                            aVar.c.e = f2;
                                            break;
                                        case 69:
                                            aVar.e.e0 = f2;
                                            break;
                                        case 70:
                                            aVar.e.f0 = f2;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                            }
                        } else {
                            aVar.e.U = f2;
                        }
                    }
                }
                for (int i7 = 0; i7 < this.i; i7++) {
                    int i8 = this.g[i7];
                    String str = this.h[i7];
                    int[] iArr3 = c.a;
                    if (i8 == 5) {
                        aVar.e.z = str;
                    } else if (i8 == 65) {
                        aVar.d.e = str;
                    } else if (i8 == 74) {
                        aVar.e.f30k0 = str;
                    } else if (i8 == 77) {
                        aVar.e.f31l0 = str;
                    } else if (i8 != 87) {
                        if (i8 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.d.m = str;
                        }
                    }
                }
                for (int i9 = 0; i9 < this.l; i9++) {
                    int i10 = this.j[i9];
                    boolean z = this.k[i9];
                    int[] iArr4 = c.a;
                    if (i10 == 44) {
                        aVar.f.n = z;
                    } else if (i10 == 75) {
                        aVar.e.f34o0 = z;
                    } else if (i10 != 87) {
                        if (i10 == 80) {
                            aVar.e.f32m0 = z;
                        } else if (i10 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.e.f33n0 = z;
                        }
                    }
                }
            }
        }

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.e;
            aVar.d = bVar.i;
            aVar.e = bVar.j;
            aVar.f = bVar.k;
            aVar.g = bVar.l;
            aVar.h = bVar.m;
            aVar.i = bVar.n;
            aVar.j = bVar.o;
            aVar.k = bVar.p;
            aVar.l = bVar.q;
            aVar.m = bVar.r;
            aVar.n = bVar.s;
            aVar.r = bVar.t;
            aVar.s = bVar.u;
            aVar.t = bVar.v;
            aVar.u = bVar.w;
            aVar.leftMargin = bVar.G;
            aVar.rightMargin = bVar.H;
            aVar.topMargin = bVar.I;
            aVar.bottomMargin = bVar.J;
            aVar.z = bVar.S;
            aVar.A = bVar.R;
            aVar.w = bVar.O;
            aVar.y = bVar.Q;
            aVar.D = bVar.x;
            aVar.E = bVar.y;
            b bVar2 = this.e;
            aVar.o = bVar2.A;
            aVar.p = bVar2.B;
            aVar.q = bVar2.C;
            aVar.F = bVar2.z;
            aVar.S = bVar2.D;
            aVar.T = bVar2.E;
            aVar.H = bVar2.U;
            aVar.G = bVar2.V;
            aVar.J = bVar2.X;
            aVar.I = bVar2.W;
            aVar.V = bVar2.f32m0;
            aVar.W = bVar2.f33n0;
            aVar.K = bVar2.Y;
            aVar.L = bVar2.Z;
            aVar.O = bVar2.a0;
            aVar.P = bVar2.b0;
            aVar.M = bVar2.c0;
            aVar.N = bVar2.d0;
            aVar.Q = bVar2.e0;
            aVar.R = bVar2.f0;
            aVar.U = bVar2.F;
            aVar.c = bVar2.h;
            aVar.a = bVar2.f;
            aVar.b = bVar2.g;
            aVar.width = bVar2.d;
            b bVar3 = this.e;
            aVar.height = bVar3.e;
            String str = bVar3.f31l0;
            if (str != null) {
                aVar.X = str;
            }
            aVar.Y = bVar3.f35p0;
            aVar.setMarginStart(bVar3.L);
            aVar.setMarginEnd(this.e.K);
            aVar.a();
        }

        /* renamed from: b */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void c(int i, ConstraintLayout.a aVar) {
            this.a = i;
            b bVar = this.e;
            bVar.i = aVar.d;
            bVar.j = aVar.e;
            bVar.k = aVar.f;
            bVar.l = aVar.g;
            bVar.m = aVar.h;
            bVar.n = aVar.i;
            bVar.o = aVar.j;
            bVar.p = aVar.k;
            bVar.q = aVar.l;
            bVar.r = aVar.m;
            bVar.s = aVar.n;
            bVar.t = aVar.r;
            bVar.u = aVar.s;
            bVar.v = aVar.t;
            bVar.w = aVar.u;
            bVar.x = aVar.D;
            bVar.y = aVar.E;
            bVar.z = aVar.F;
            bVar.A = aVar.o;
            bVar.B = aVar.p;
            bVar.C = aVar.q;
            bVar.D = aVar.S;
            bVar.E = aVar.T;
            bVar.F = aVar.U;
            bVar.h = aVar.c;
            b bVar2 = this.e;
            bVar2.f = aVar.a;
            bVar2.g = aVar.b;
            bVar2.d = aVar.width;
            bVar2.e = aVar.height;
            bVar2.G = aVar.leftMargin;
            bVar2.H = aVar.rightMargin;
            bVar2.I = aVar.topMargin;
            bVar2.J = aVar.bottomMargin;
            bVar2.M = aVar.C;
            bVar2.U = aVar.H;
            bVar2.V = aVar.G;
            bVar2.X = aVar.J;
            bVar2.W = aVar.I;
            bVar2.f32m0 = aVar.V;
            bVar2.f33n0 = aVar.W;
            bVar2.Y = aVar.K;
            bVar2.Z = aVar.L;
            bVar2.a0 = aVar.O;
            bVar2.b0 = aVar.P;
            bVar2.c0 = aVar.M;
            bVar2.d0 = aVar.N;
            bVar2.e0 = aVar.Q;
            bVar2.f0 = aVar.R;
            bVar2.f31l0 = aVar.X;
            bVar2.O = aVar.w;
            b bVar3 = this.e;
            bVar3.Q = aVar.y;
            bVar3.N = aVar.v;
            bVar3.P = aVar.x;
            bVar3.S = aVar.z;
            bVar3.R = aVar.A;
            bVar3.T = aVar.B;
            bVar3.f35p0 = aVar.Y;
            bVar3.K = aVar.getMarginEnd();
            this.e.L = aVar.getMarginStart();
        }

        public final void d(int i, d.a aVar) {
            c(i, aVar);
            this.c.d = aVar.f36q0;
            e eVar = this.f;
            eVar.c = aVar.f39t0;
            eVar.d = aVar.f40u0;
            eVar.e = aVar.f41v0;
            eVar.f = aVar.w0;
            eVar.g = aVar.x0;
            eVar.h = aVar.y0;
            eVar.i = aVar.z0;
            eVar.k = aVar.A0;
            eVar.l = aVar.B0;
            eVar.m = aVar.C0;
            eVar.o = aVar.f38s0;
            eVar.n = aVar.f37r0;
        }
    }

    /* compiled from: ConstraintSet */
    public static class b {
        public static SparseIntArray a;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = -1;
        public boolean b = false;
        public int b0 = -1;
        public boolean c = false;
        public int c0 = -1;
        public int d;
        public int d0 = -1;
        public int e;
        public float e0 = 1.0f;
        public int f = -1;
        public float f0 = 1.0f;
        public int g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f26g0 = -1;
        public float h = -1.0f;

        /* renamed from: h0  reason: collision with root package name */
        public int f27h0 = 0;
        public int i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f28i0 = -1;
        public int j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f29j0;
        public int k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f30k0;
        public int l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f31l0;
        public int m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f32m0 = false;
        public int n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f33n0 = false;
        public int o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f34o0 = true;
        public int p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public int f35p0 = 0;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            a.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            a.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            a.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            a.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            a.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            a.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            a.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            a.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            a.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            a.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            a.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            a.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            a.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            a.append(R.styleable.Layout_android_orientation, 26);
            a.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            a.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            a.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            a.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            a.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            a.append(R.styleable.Layout_layout_goneMarginTop, 16);
            a.append(R.styleable.Layout_layout_goneMarginRight, 14);
            a.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            a.append(R.styleable.Layout_layout_goneMarginStart, 15);
            a.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            a.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            a.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            a.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            a.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            a.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            a.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            a.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            a.append(R.styleable.Layout_layout_constraintLeft_creator, 76);
            a.append(R.styleable.Layout_layout_constraintTop_creator, 76);
            a.append(R.styleable.Layout_layout_constraintRight_creator, 76);
            a.append(R.styleable.Layout_layout_constraintBottom_creator, 76);
            a.append(R.styleable.Layout_layout_constraintBaseline_creator, 76);
            a.append(R.styleable.Layout_android_layout_marginLeft, 23);
            a.append(R.styleable.Layout_android_layout_marginRight, 27);
            a.append(R.styleable.Layout_android_layout_marginStart, 30);
            a.append(R.styleable.Layout_android_layout_marginEnd, 8);
            a.append(R.styleable.Layout_android_layout_marginTop, 33);
            a.append(R.styleable.Layout_android_layout_marginBottom, 2);
            a.append(R.styleable.Layout_android_layout_width, 22);
            a.append(R.styleable.Layout_android_layout_height, 21);
            a.append(R.styleable.Layout_layout_constraintWidth, 41);
            a.append(R.styleable.Layout_layout_constraintHeight, 42);
            a.append(R.styleable.Layout_layout_constrainedWidth, 41);
            a.append(R.styleable.Layout_layout_constrainedHeight, 42);
            a.append(R.styleable.Layout_layout_wrapBehaviorInParent, 97);
            a.append(R.styleable.Layout_layout_constraintCircle, 61);
            a.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            a.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            a.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            a.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            a.append(R.styleable.Layout_chainUseRtl, 71);
            a.append(R.styleable.Layout_barrierDirection, 72);
            a.append(R.styleable.Layout_barrierMargin, 73);
            a.append(R.styleable.Layout_constraint_referenced_ids, 74);
            a.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.b = bVar.b;
            this.d = bVar.d;
            this.c = bVar.c;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.f26g0 = bVar.f26g0;
            this.f27h0 = bVar.f27h0;
            this.f28i0 = bVar.f28i0;
            this.f31l0 = bVar.f31l0;
            int[] iArr = bVar.f29j0;
            if (iArr != null) {
                this.f29j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f29j0 = null;
            }
            this.f30k0 = bVar.f30k0;
            this.f32m0 = bVar.f32m0;
            this.f33n0 = bVar.f33n0;
            this.f34o0 = bVar.f34o0;
            this.f35p0 = bVar.f35p0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.get(index);
                if (i3 == 80) {
                    this.f32m0 = obtainStyledAttributes.getBoolean(index, this.f32m0);
                } else if (i3 == 81) {
                    this.f33n0 = obtainStyledAttributes.getBoolean(index, this.f33n0);
                } else if (i3 != 97) {
                    switch (i3) {
                        case 1:
                            int i4 = this.q;
                            int[] iArr = c.a;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.q = resourceId;
                            break;
                        case 2:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 3:
                            int i5 = this.p;
                            int[] iArr2 = c.a;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.p = resourceId2;
                            break;
                        case 4:
                            int i6 = this.o;
                            int[] iArr3 = c.a;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.o = resourceId3;
                            break;
                        case 5:
                            this.z = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                            break;
                        case 7:
                            this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                            break;
                        case 8:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 9:
                            int i7 = this.w;
                            int[] iArr4 = c.a;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.w = resourceId4;
                            break;
                        case 10:
                            int i8 = this.v;
                            int[] iArr5 = c.a;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.v = resourceId5;
                            break;
                        case 11:
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 12:
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        case 13:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 14:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 15:
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        case 16:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 17:
                            this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 18:
                            this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                            break;
                        case 19:
                            this.h = obtainStyledAttributes.getFloat(index, this.h);
                            break;
                        case 20:
                            this.x = obtainStyledAttributes.getFloat(index, this.x);
                            break;
                        case 21:
                            this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                            break;
                        case 22:
                            this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 23:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 24:
                            int i9 = this.i;
                            int[] iArr6 = c.a;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.i = resourceId6;
                            break;
                        case 25:
                            int i10 = this.j;
                            int[] iArr7 = c.a;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.j = resourceId7;
                            break;
                        case 26:
                            this.F = obtainStyledAttributes.getInt(index, this.F);
                            break;
                        case 27:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 28:
                            int i11 = this.k;
                            int[] iArr8 = c.a;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.k = resourceId8;
                            break;
                        case 29:
                            int i12 = this.l;
                            int[] iArr9 = c.a;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.l = resourceId9;
                            break;
                        case 30:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 31:
                            int i13 = this.t;
                            int[] iArr10 = c.a;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.t = resourceId10;
                            break;
                        case 32:
                            int i14 = this.u;
                            int[] iArr11 = c.a;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.u = resourceId11;
                            break;
                        case 33:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 34:
                            int i15 = this.n;
                            int[] iArr12 = c.a;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.n = resourceId12;
                            break;
                        case 35:
                            int i16 = this.m;
                            int[] iArr13 = c.a;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.m = resourceId13;
                            break;
                        case 36:
                            this.y = obtainStyledAttributes.getFloat(index, this.y);
                            break;
                        case 37:
                            this.V = obtainStyledAttributes.getFloat(index, this.V);
                            break;
                        case 38:
                            this.U = obtainStyledAttributes.getFloat(index, this.U);
                            break;
                        case 39:
                            this.W = obtainStyledAttributes.getInt(index, this.W);
                            break;
                        case 40:
                            this.X = obtainStyledAttributes.getInt(index, this.X);
                            break;
                        case 41:
                            c.l(this, obtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            c.l(this, obtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 55:
                                    this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 56:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 57:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 58:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 59:
                                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            int i17 = this.A;
                                            int[] iArr14 = c.a;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.A = resourceId14;
                                            break;
                                        case 62:
                                            this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                            break;
                                        case 63:
                                            this.C = obtainStyledAttributes.getFloat(index, this.C);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f26g0 = obtainStyledAttributes.getInt(index, this.f26g0);
                                                    break;
                                                case 73:
                                                    this.f27h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f27h0);
                                                    break;
                                                case 74:
                                                    this.f30k0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f34o0 = obtainStyledAttributes.getBoolean(index, this.f34o0);
                                                    break;
                                                case 76:
                                                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                                                    i0.d.a.a.a.d(index, P0, "   ");
                                                    P0.append(a.get(index));
                                                    Log.w("ConstraintSet", P0.toString());
                                                    break;
                                                case 77:
                                                    this.f31l0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 91:
                                                            int i18 = this.r;
                                                            int[] iArr15 = c.a;
                                                            int resourceId15 = obtainStyledAttributes.getResourceId(index, i18);
                                                            if (resourceId15 == -1) {
                                                                resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                                            }
                                                            this.r = resourceId15;
                                                            break;
                                                        case 92:
                                                            int i19 = this.s;
                                                            int[] iArr16 = c.a;
                                                            int resourceId16 = obtainStyledAttributes.getResourceId(index, i19);
                                                            if (resourceId16 == -1) {
                                                                resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                                            }
                                                            this.s = resourceId16;
                                                            break;
                                                        case 93:
                                                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                            break;
                                                        case 94:
                                                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                            break;
                                                        default:
                                                            StringBuilder P02 = i0.d.a.a.a.P0("Unknown attribute 0x");
                                                            i0.d.a.a.a.d(index, P02, "   ");
                                                            P02.append(a.get(index));
                                                            Log.w("ConstraintSet", P02.toString());
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    this.f35p0 = obtainStyledAttributes.getInt(index, this.f35p0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: h0.g.c.c$c  reason: collision with other inner class name */
    /* compiled from: ConstraintSet */
    public static class C0036c {
        public static SparseIntArray a;
        public boolean b = false;
        public int c = -1;
        public int d = 0;
        public String e = null;
        public int f = -1;
        public int g = 0;
        public float h = Float.NaN;
        public int i = -1;
        public float j = Float.NaN;
        public float k = Float.NaN;
        public int l = -1;
        public String m = null;
        public int n = -3;
        public int o = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            a.append(R.styleable.Motion_pathMotionArc, 2);
            a.append(R.styleable.Motion_transitionEasing, 3);
            a.append(R.styleable.Motion_drawPath, 4);
            a.append(R.styleable.Motion_animateRelativeTo, 5);
            a.append(R.styleable.Motion_animateCircleAngleTo, 6);
            a.append(R.styleable.Motion_motionStagger, 7);
            a.append(R.styleable.Motion_quantizeMotionSteps, 8);
            a.append(R.styleable.Motion_quantizeMotionPhase, 9);
            a.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(C0036c cVar) {
            this.b = cVar.b;
            this.c = cVar.c;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.j = cVar.j;
            this.h = cVar.h;
            this.i = cVar.i;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 2:
                        this.f = obtainStyledAttributes.getInt(index, this.f);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.e = h0.g.a.g.a.c.b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.e = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.c;
                        int[] iArr = c.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.c = resourceId;
                        break;
                    case 6:
                        this.d = obtainStyledAttributes.getInteger(index, this.d);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 8:
                        this.l = obtainStyledAttributes.getInteger(index, this.l);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getFloat(index, this.k);
                        break;
                    case 10:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 != 1) {
                            if (i4 != 3) {
                                this.n = obtainStyledAttributes.getInteger(index, this.o);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.m = string;
                                if (string.indexOf("/") <= 0) {
                                    this.n = -1;
                                    break;
                                } else {
                                    this.o = obtainStyledAttributes.getResourceId(index, -1);
                                    this.n = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.o = resourceId2;
                            if (resourceId2 == -1) {
                                break;
                            } else {
                                this.n = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    int i2 = obtainStyledAttributes.getInt(index, this.b);
                    this.b = i2;
                    int[] iArr = c.a;
                    this.b = c.a[i2];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet */
    public static class e {
        public static SparseIntArray a;
        public boolean b = false;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 1.0f;
        public float g = 1.0f;
        public float h = Float.NaN;
        public float i = Float.NaN;
        public int j = -1;
        public float k = 0.0f;
        public float l = 0.0f;
        public float m = 0.0f;
        public boolean n = false;
        public float o = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            a.append(R.styleable.Transform_android_rotationX, 2);
            a.append(R.styleable.Transform_android_rotationY, 3);
            a.append(R.styleable.Transform_android_scaleX, 4);
            a.append(R.styleable.Transform_android_scaleY, 5);
            a.append(R.styleable.Transform_android_transformPivotX, 6);
            a.append(R.styleable.Transform_android_transformPivotY, 7);
            a.append(R.styleable.Transform_android_translationX, 8);
            a.append(R.styleable.Transform_android_translationY, 9);
            a.append(R.styleable.Transform_android_translationZ, 10);
            a.append(R.styleable.Transform_android_elevation, 11);
            a.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
            this.o = eVar.o;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 2:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 3:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 4:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 5:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 6:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 7:
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 9:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 10:
                        this.m = obtainStyledAttributes.getDimension(index, this.m);
                        break;
                    case 11:
                        this.n = true;
                        this.o = obtainStyledAttributes.getDimension(index, this.o);
                        break;
                    case 12:
                        int i3 = this.j;
                        int[] iArr = c.a;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.j = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        b.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        b.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        b.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        b.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        b.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        b.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        b.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        b.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        b.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        b.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        b.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        b.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        b.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        b.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        b.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        b.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        b.append(R.styleable.Constraint_android_orientation, 27);
        b.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        b.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        b.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        b.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        b.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        b.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        b.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        b.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        b.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        b.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        b.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        b.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        b.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        b.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        b.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        b.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        b.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        b.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        b.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        b.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        b.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        b.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        b.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        b.append(R.styleable.Constraint_android_layout_marginRight, 28);
        b.append(R.styleable.Constraint_android_layout_marginStart, 31);
        b.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        b.append(R.styleable.Constraint_android_layout_marginTop, 34);
        b.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        b.append(R.styleable.Constraint_android_layout_width, 23);
        b.append(R.styleable.Constraint_android_layout_height, 21);
        b.append(R.styleable.Constraint_layout_constraintWidth, 95);
        b.append(R.styleable.Constraint_layout_constraintHeight, 96);
        b.append(R.styleable.Constraint_android_visibility, 22);
        b.append(R.styleable.Constraint_android_alpha, 43);
        b.append(R.styleable.Constraint_android_elevation, 44);
        b.append(R.styleable.Constraint_android_rotationX, 45);
        b.append(R.styleable.Constraint_android_rotationY, 46);
        b.append(R.styleable.Constraint_android_rotation, 60);
        b.append(R.styleable.Constraint_android_scaleX, 47);
        b.append(R.styleable.Constraint_android_scaleY, 48);
        b.append(R.styleable.Constraint_android_transformPivotX, 49);
        b.append(R.styleable.Constraint_android_transformPivotY, 50);
        b.append(R.styleable.Constraint_android_translationX, 51);
        b.append(R.styleable.Constraint_android_translationY, 52);
        b.append(R.styleable.Constraint_android_translationZ, 53);
        b.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        b.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        b.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        b.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        b.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        b.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        b.append(R.styleable.Constraint_layout_constraintCircle, 61);
        b.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        b.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        b.append(R.styleable.Constraint_animateRelativeTo, 64);
        b.append(R.styleable.Constraint_transitionEasing, 65);
        b.append(R.styleable.Constraint_drawPath, 66);
        b.append(R.styleable.Constraint_transitionPathRotate, 67);
        b.append(R.styleable.Constraint_motionStagger, 79);
        b.append(R.styleable.Constraint_android_id, 38);
        b.append(R.styleable.Constraint_motionProgress, 68);
        b.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        b.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        b.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        b.append(R.styleable.Constraint_chainUseRtl, 71);
        b.append(R.styleable.Constraint_barrierDirection, 72);
        b.append(R.styleable.Constraint_barrierMargin, 73);
        b.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        b.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        b.append(R.styleable.Constraint_pathMotionArc, 76);
        b.append(R.styleable.Constraint_layout_constraintTag, 77);
        b.append(R.styleable.Constraint_visibilityMode, 78);
        b.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        b.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        b.append(R.styleable.Constraint_polarRelativeTo, 82);
        b.append(R.styleable.Constraint_transformPivotTarget, 83);
        b.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        b.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        b.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = c;
        int i2 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i2, 6);
        c.append(i2, 7);
        c.append(R.styleable.ConstraintOverride_android_orientation, 27);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        c.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        c.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        c.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        c.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        c.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        c.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        c.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        c.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        c.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        c.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        c.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        c.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        c.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        c.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        c.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        c.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        c.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        c.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        c.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        c.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        c.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        c.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        c.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        c.append(R.styleable.ConstraintOverride_android_visibility, 22);
        c.append(R.styleable.ConstraintOverride_android_alpha, 43);
        c.append(R.styleable.ConstraintOverride_android_elevation, 44);
        c.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        c.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        c.append(R.styleable.ConstraintOverride_android_rotation, 60);
        c.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        c.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        c.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        c.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        c.append(R.styleable.ConstraintOverride_android_translationX, 51);
        c.append(R.styleable.ConstraintOverride_android_translationY, 52);
        c.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        c.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        c.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        c.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        c.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        c.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        c.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        c.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        c.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        c.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        c.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        c.append(R.styleable.ConstraintOverride_drawPath, 66);
        c.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        c.append(R.styleable.ConstraintOverride_motionStagger, 79);
        c.append(R.styleable.ConstraintOverride_android_id, 38);
        c.append(R.styleable.ConstraintOverride_motionTarget, 98);
        c.append(R.styleable.ConstraintOverride_motionProgress, 68);
        c.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        c.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        c.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        c.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        c.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        c.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        c.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        c.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        c.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        c.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        c.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        c.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        c.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        c.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        c.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        c.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        c.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        c.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static a d(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        n(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006d
            r1 = -2
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r1
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.V = r4
            goto L_0x006c
        L_0x003c:
            r8.height = r7
            r8.W = r4
            goto L_0x006c
        L_0x0041:
            boolean r9 = r8 instanceof h0.g.c.c.b
            if (r9 == 0) goto L_0x0053
            h0.g.c.c$b r8 = (h0.g.c.c.b) r8
            if (r11 != 0) goto L_0x004e
            r8.d = r7
            r8.f32m0 = r4
            goto L_0x006c
        L_0x004e:
            r8.e = r7
            r8.f33n0 = r4
            goto L_0x006c
        L_0x0053:
            boolean r9 = r8 instanceof h0.g.c.c.a.C0035a
            if (r9 == 0) goto L_0x006c
            h0.g.c.c$a$a r8 = (h0.g.c.c.a.C0035a) r8
            if (r11 != 0) goto L_0x0064
            r8.b(r3, r7)
            r9 = 80
            r8.d(r9, r4)
            goto L_0x006c
        L_0x0064:
            r8.b(r2, r7)
            r9 = 81
            r8.d(r9, r4)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0075
            goto L_0x0175
        L_0x0075:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0175
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0175
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0175
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00ca
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x00b5
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x00ae
            r8.width = r7
            goto L_0x00b0
        L_0x00ae:
            r8.height = r7
        L_0x00b0:
            m(r8, r9)
            goto L_0x0175
        L_0x00b5:
            boolean r10 = r8 instanceof h0.g.c.c.b
            if (r10 == 0) goto L_0x00bf
            h0.g.c.c$b r8 = (h0.g.c.c.b) r8
            r8.z = r9
            goto L_0x0175
        L_0x00bf:
            boolean r10 = r8 instanceof h0.g.c.c.a.C0035a
            if (r10 == 0) goto L_0x0175
            h0.g.c.c$a$a r8 = (h0.g.c.c.a.C0035a) r8
            r8.c(r6, r9)
            goto L_0x0175
        L_0x00ca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0118
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00ea
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00e4
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.G = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00e4:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00ea:
            boolean r10 = r8 instanceof h0.g.c.c.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00fe
            h0.g.c.c$b r8 = (h0.g.c.c.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00f8
            r8.d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.V = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00f8:
            r8.e = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00fe:
            boolean r10 = r8 instanceof h0.g.c.c.a.C0035a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x0175
            h0.g.c.c$a$a r8 = (h0.g.c.c.a.C0035a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x010f
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 39
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x010f:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 40
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0118:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0175
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0175 }
            r0 = 2
            if (r10 == 0) goto L_0x0146
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x013f
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Q = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.K = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x013f:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0146:
            boolean r10 = r8 instanceof h0.g.c.c.b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x015c
            h0.g.c.c$b r8 = (h0.g.c.c.b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x0155
            r8.d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.e0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0155:
            r8.e = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Z = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x015c:
            boolean r9 = r8 instanceof h0.g.c.c.a.C0035a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r9 == 0) goto L_0x0175
            h0.g.c.c$a$a r8 = (h0.g.c.c.a.C0035a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x016d
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 54
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x016d:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 55
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.c.c.l(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void m(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.F = str;
    }

    public static void n(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0035a aVar2 = new a.C0035a();
        aVar.h = aVar2;
        aVar.d.b = false;
        aVar.e.c = false;
        aVar.c.a = false;
        aVar.f.b = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (c.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.D));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.e.x));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    aVar2.b(22, a[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.e.G));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.e.F));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.e.U));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.e.W));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.e.X));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f.o));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f.g));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f.i));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f.m));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.e.a0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.e.B));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.e.C));
                    break;
                case 64:
                    int resourceId2 = typedArray.getResourceId(index, aVar.d.c);
                    if (resourceId2 == -1) {
                        resourceId2 = typedArray.getInt(index, -1);
                    }
                    aVar2.b(64, resourceId2);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.c(65, h0.g.a.g.a.c.b[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.e.f26g0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.e.f27h0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.e.f34o0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.d.f));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.d.h));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.e.f32m0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.e.f33n0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.d.d));
                    break;
                case 83:
                    int resourceId3 = typedArray.getResourceId(index, aVar.f.j);
                    if (resourceId3 == -1) {
                        resourceId3 = typedArray.getInt(index, -1);
                    }
                    aVar2.b(83, resourceId3);
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.d.l));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.d.k));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 != 1) {
                        if (i3 != 3) {
                            C0036c cVar = aVar.d;
                            cVar.n = typedArray.getInteger(index, cVar.o);
                            aVar2.b(88, aVar.d.n);
                            break;
                        } else {
                            aVar.d.m = typedArray.getString(index);
                            aVar2.c(90, aVar.d.m);
                            if (aVar.d.m.indexOf("/") <= 0) {
                                aVar.d.n = -1;
                                aVar2.b(88, -1);
                                break;
                            } else {
                                aVar.d.o = typedArray.getResourceId(index, -1);
                                aVar2.b(89, aVar.d.o);
                                aVar.d.n = -2;
                                aVar2.b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.d.o = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.d.o);
                        C0036c cVar2 = aVar.d;
                        if (cVar2.o == -1) {
                            break;
                        } else {
                            cVar2.n = -2;
                            aVar2.b(88, -2);
                            break;
                        }
                    }
                case 87:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(b.get(index));
                    Log.w("ConstraintSet", P0.toString());
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 95:
                    l(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    l(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.e.f35p0));
                    break;
                case 98:
                    if (!MotionLayout.n2) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.a = typedArray.getResourceId(index, aVar.a);
                            break;
                        } else {
                            aVar.b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId4 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            aVar.b = typedArray.getString(index);
                            break;
                        }
                    }
                default:
                    StringBuilder P02 = i0.d.a.a.a.P0("Unknown attribute 0x");
                    i0.d.a.a.a.d(index, P02, "   ");
                    P02.append(b.get(index));
                    Log.w("ConstraintSet", P02.toString());
                    break;
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.i.containsKey(Integer.valueOf(id))) {
                StringBuilder P0 = i0.d.a.a.a.P0("id unknown ");
                P0.append(g0.a.b.b.a.O(childAt));
                Log.w("ConstraintSet", P0.toString());
            } else if (this.h && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.i.containsKey(Integer.valueOf(id)) && (aVar = this.i.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.g(childAt, aVar.g);
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        c(constraintLayout, true);
        constraintLayout.setConstraintSet((c) null);
        constraintLayout.requestLayout();
    }

    public void c(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.i.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.i.containsKey(Integer.valueOf(id))) {
                StringBuilder P0 = i0.d.a.a.a.P0("id unknown ");
                P0.append(g0.a.b.b.a.O(childAt));
                Log.w("ConstraintSet", P0.toString());
            } else if (this.h && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.i.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.i.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.e.f28i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.e.f26g0);
                            barrier.setMargin(aVar.e.f27h0);
                            barrier.setAllowsGoneWidget(aVar.e.f34o0);
                            b bVar = aVar.e;
                            int[] iArr = bVar.f29j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f30k0;
                                if (str != null) {
                                    bVar.f29j0 = f(barrier, str);
                                    barrier.setReferencedIds(aVar.e.f29j0);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        if (z) {
                            ConstraintAttribute.g(childAt, aVar.g);
                        }
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(aVar.c.d);
                        childAt.setRotation(aVar.f.c);
                        childAt.setRotationX(aVar.f.d);
                        childAt.setRotationY(aVar.f.e);
                        childAt.setScaleX(aVar.f.f);
                        childAt.setScaleY(aVar.f.g);
                        e eVar = aVar.f;
                        if (eVar.j != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f.j);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.h)) {
                                childAt.setPivotX(aVar.f.h);
                            }
                            if (!Float.isNaN(aVar.f.i)) {
                                childAt.setPivotY(aVar.f.i);
                            }
                        }
                        childAt.setTranslationX(aVar.f.k);
                        childAt.setTranslationY(aVar.f.l);
                        childAt.setTranslationZ(aVar.f.m);
                        e eVar2 = aVar.f;
                        if (eVar2.n) {
                            childAt.setElevation(eVar2.o);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.i.get(num);
            if (aVar3 != null) {
                if (aVar3.e.f28i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar3.e;
                    int[] iArr2 = bVar2.f29j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f30k0;
                        if (str2 != null) {
                            bVar2.f29j0 = f(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.e.f29j0);
                        }
                    }
                    barrier2.setType(aVar3.e.f26g0);
                    barrier2.setMargin(aVar3.e.f27h0);
                    ConstraintLayout.a c2 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar3.a(c2);
                    constraintLayout.addView(barrier2, c2);
                }
                if (aVar3.e.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a c3 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(c3);
                    constraintLayout.addView(guideline, c3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof a) {
                ((a) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        cVar.i.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!cVar.h || id != -1) {
                if (!cVar.i.containsKey(Integer.valueOf(id))) {
                    cVar.i.put(Integer.valueOf(id), new a());
                }
                a aVar2 = cVar.i.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    HashMap<String, ConstraintAttribute> hashMap = cVar.g;
                    HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        ConstraintAttribute constraintAttribute = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap2.put(next, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                try {
                                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                } catch (IllegalAccessException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (IllegalAccessException e6) {
                            e = e6;
                            e.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                        }
                    }
                    aVar2.g = hashMap2;
                    aVar2.c(id, aVar);
                    aVar2.c.b = childAt.getVisibility();
                    aVar2.c.d = childAt.getAlpha();
                    aVar2.f.c = childAt.getRotation();
                    aVar2.f.d = childAt.getRotationX();
                    aVar2.f.e = childAt.getRotationY();
                    aVar2.f.f = childAt.getScaleX();
                    aVar2.f.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar2.f;
                        eVar.h = pivotX;
                        eVar.i = pivotY;
                    }
                    aVar2.f.k = childAt.getTranslationX();
                    aVar2.f.l = childAt.getTranslationY();
                    aVar2.f.m = childAt.getTranslationZ();
                    e eVar2 = aVar2.f;
                    if (eVar2.n) {
                        eVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar2.e.f34o0 = barrier.getAllowsGoneWidget();
                        aVar2.e.f29j0 = barrier.getReferencedIds();
                        aVar2.e.f26g0 = barrier.getType();
                        aVar2.e.f27h0 = barrier.getMargin();
                    }
                }
                i2++;
                cVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] f(View view, String str) {
        int i2;
        Object d2;
        String[] split = str.split(InstabugDbContract.COMMA_SEP);
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = R.id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (d2 = ((ConstraintLayout) view.getParent()).d(0, trim)) != null && (d2 instanceof Integer)) {
                i2 = ((Integer) d2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a g(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        if (z) {
            n(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (!(index == R.styleable.Constraint_android_id || R.styleable.Constraint_android_layout_marginStart == index || R.styleable.Constraint_android_layout_marginEnd == index)) {
                    aVar.d.b = true;
                    aVar.e.c = true;
                    aVar.c.a = true;
                    aVar.f.b = true;
                }
                switch (b.get(index)) {
                    case 1:
                        b bVar = aVar.e;
                        int resourceId = obtainStyledAttributes.getResourceId(index, bVar.q);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar.q = resourceId;
                        break;
                    case 2:
                        b bVar2 = aVar.e;
                        bVar2.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.J);
                        break;
                    case 3:
                        b bVar3 = aVar.e;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.p);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar3.p = resourceId2;
                        break;
                    case 4:
                        b bVar4 = aVar.e;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.o);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar4.o = resourceId3;
                        break;
                    case 5:
                        aVar.e.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        b bVar5 = aVar.e;
                        bVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.D);
                        break;
                    case 7:
                        b bVar6 = aVar.e;
                        bVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.E);
                        break;
                    case 8:
                        b bVar7 = aVar.e;
                        bVar7.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.K);
                        break;
                    case 9:
                        b bVar8 = aVar.e;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.w);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar8.w = resourceId4;
                        break;
                    case 10:
                        b bVar9 = aVar.e;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.v);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar9.v = resourceId5;
                        break;
                    case 11:
                        b bVar10 = aVar.e;
                        bVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.Q);
                        break;
                    case 12:
                        b bVar11 = aVar.e;
                        bVar11.R = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.R);
                        break;
                    case 13:
                        b bVar12 = aVar.e;
                        bVar12.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.N);
                        break;
                    case 14:
                        b bVar13 = aVar.e;
                        bVar13.P = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.P);
                        break;
                    case 15:
                        b bVar14 = aVar.e;
                        bVar14.S = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.S);
                        break;
                    case 16:
                        b bVar15 = aVar.e;
                        bVar15.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.O);
                        break;
                    case 17:
                        b bVar16 = aVar.e;
                        bVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f);
                        break;
                    case 18:
                        b bVar17 = aVar.e;
                        bVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.g);
                        break;
                    case 19:
                        b bVar18 = aVar.e;
                        bVar18.h = obtainStyledAttributes.getFloat(index, bVar18.h);
                        break;
                    case 20:
                        b bVar19 = aVar.e;
                        bVar19.x = obtainStyledAttributes.getFloat(index, bVar19.x);
                        break;
                    case 21:
                        b bVar20 = aVar.e;
                        bVar20.e = obtainStyledAttributes.getLayoutDimension(index, bVar20.e);
                        break;
                    case 22:
                        d dVar = aVar.c;
                        dVar.b = obtainStyledAttributes.getInt(index, dVar.b);
                        d dVar2 = aVar.c;
                        dVar2.b = a[dVar2.b];
                        break;
                    case 23:
                        b bVar21 = aVar.e;
                        bVar21.d = obtainStyledAttributes.getLayoutDimension(index, bVar21.d);
                        break;
                    case 24:
                        b bVar22 = aVar.e;
                        bVar22.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.G);
                        break;
                    case 25:
                        b bVar23 = aVar.e;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.i);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar23.i = resourceId6;
                        break;
                    case 26:
                        b bVar24 = aVar.e;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.j);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar24.j = resourceId7;
                        break;
                    case 27:
                        b bVar25 = aVar.e;
                        bVar25.F = obtainStyledAttributes.getInt(index, bVar25.F);
                        break;
                    case 28:
                        b bVar26 = aVar.e;
                        bVar26.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.H);
                        break;
                    case 29:
                        b bVar27 = aVar.e;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.k);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar27.k = resourceId8;
                        break;
                    case 30:
                        b bVar28 = aVar.e;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.l);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar28.l = resourceId9;
                        break;
                    case 31:
                        b bVar29 = aVar.e;
                        bVar29.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.L);
                        break;
                    case 32:
                        b bVar30 = aVar.e;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.t);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar30.t = resourceId10;
                        break;
                    case 33:
                        b bVar31 = aVar.e;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.u);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar31.u = resourceId11;
                        break;
                    case 34:
                        b bVar32 = aVar.e;
                        bVar32.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.I);
                        break;
                    case 35:
                        b bVar33 = aVar.e;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.n);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar33.n = resourceId12;
                        break;
                    case 36:
                        b bVar34 = aVar.e;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.m);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar34.m = resourceId13;
                        break;
                    case 37:
                        b bVar35 = aVar.e;
                        bVar35.y = obtainStyledAttributes.getFloat(index, bVar35.y);
                        break;
                    case 38:
                        aVar.a = obtainStyledAttributes.getResourceId(index, aVar.a);
                        break;
                    case 39:
                        b bVar36 = aVar.e;
                        bVar36.V = obtainStyledAttributes.getFloat(index, bVar36.V);
                        break;
                    case 40:
                        b bVar37 = aVar.e;
                        bVar37.U = obtainStyledAttributes.getFloat(index, bVar37.U);
                        break;
                    case 41:
                        b bVar38 = aVar.e;
                        bVar38.W = obtainStyledAttributes.getInt(index, bVar38.W);
                        break;
                    case 42:
                        b bVar39 = aVar.e;
                        bVar39.X = obtainStyledAttributes.getInt(index, bVar39.X);
                        break;
                    case 43:
                        d dVar3 = aVar.c;
                        dVar3.d = obtainStyledAttributes.getFloat(index, dVar3.d);
                        break;
                    case 44:
                        e eVar = aVar.f;
                        eVar.n = true;
                        eVar.o = obtainStyledAttributes.getDimension(index, eVar.o);
                        break;
                    case 45:
                        e eVar2 = aVar.f;
                        eVar2.d = obtainStyledAttributes.getFloat(index, eVar2.d);
                        break;
                    case 46:
                        e eVar3 = aVar.f;
                        eVar3.e = obtainStyledAttributes.getFloat(index, eVar3.e);
                        break;
                    case 47:
                        e eVar4 = aVar.f;
                        eVar4.f = obtainStyledAttributes.getFloat(index, eVar4.f);
                        break;
                    case 48:
                        e eVar5 = aVar.f;
                        eVar5.g = obtainStyledAttributes.getFloat(index, eVar5.g);
                        break;
                    case 49:
                        e eVar6 = aVar.f;
                        eVar6.h = obtainStyledAttributes.getDimension(index, eVar6.h);
                        break;
                    case 50:
                        e eVar7 = aVar.f;
                        eVar7.i = obtainStyledAttributes.getDimension(index, eVar7.i);
                        break;
                    case 51:
                        e eVar8 = aVar.f;
                        eVar8.k = obtainStyledAttributes.getDimension(index, eVar8.k);
                        break;
                    case 52:
                        e eVar9 = aVar.f;
                        eVar9.l = obtainStyledAttributes.getDimension(index, eVar9.l);
                        break;
                    case 53:
                        e eVar10 = aVar.f;
                        eVar10.m = obtainStyledAttributes.getDimension(index, eVar10.m);
                        break;
                    case 54:
                        b bVar40 = aVar.e;
                        bVar40.Y = obtainStyledAttributes.getInt(index, bVar40.Y);
                        break;
                    case 55:
                        b bVar41 = aVar.e;
                        bVar41.Z = obtainStyledAttributes.getInt(index, bVar41.Z);
                        break;
                    case 56:
                        b bVar42 = aVar.e;
                        bVar42.a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.a0);
                        break;
                    case 57:
                        b bVar43 = aVar.e;
                        bVar43.b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.b0);
                        break;
                    case 58:
                        b bVar44 = aVar.e;
                        bVar44.c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.c0);
                        break;
                    case 59:
                        b bVar45 = aVar.e;
                        bVar45.d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.d0);
                        break;
                    case 60:
                        e eVar11 = aVar.f;
                        eVar11.c = obtainStyledAttributes.getFloat(index, eVar11.c);
                        break;
                    case 61:
                        b bVar46 = aVar.e;
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.A);
                        if (resourceId14 == -1) {
                            resourceId14 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar46.A = resourceId14;
                        break;
                    case 62:
                        b bVar47 = aVar.e;
                        bVar47.B = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.B);
                        break;
                    case 63:
                        b bVar48 = aVar.e;
                        bVar48.C = obtainStyledAttributes.getFloat(index, bVar48.C);
                        break;
                    case 64:
                        C0036c cVar = aVar.d;
                        int resourceId15 = obtainStyledAttributes.getResourceId(index, cVar.c);
                        if (resourceId15 == -1) {
                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                        }
                        cVar.c = resourceId15;
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.d.e = h0.g.a.g.a.c.b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            aVar.d.e = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 66:
                        aVar.d.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        C0036c cVar2 = aVar.d;
                        cVar2.j = obtainStyledAttributes.getFloat(index, cVar2.j);
                        break;
                    case 68:
                        d dVar4 = aVar.c;
                        dVar4.e = obtainStyledAttributes.getFloat(index, dVar4.e);
                        break;
                    case 69:
                        aVar.e.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        aVar.e.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        b bVar49 = aVar.e;
                        bVar49.f26g0 = obtainStyledAttributes.getInt(index, bVar49.f26g0);
                        break;
                    case 73:
                        b bVar50 = aVar.e;
                        bVar50.f27h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f27h0);
                        break;
                    case 74:
                        aVar.e.f30k0 = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        b bVar51 = aVar.e;
                        bVar51.f34o0 = obtainStyledAttributes.getBoolean(index, bVar51.f34o0);
                        break;
                    case 76:
                        C0036c cVar3 = aVar.d;
                        cVar3.f = obtainStyledAttributes.getInt(index, cVar3.f);
                        break;
                    case 77:
                        aVar.e.f31l0 = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        d dVar5 = aVar.c;
                        dVar5.c = obtainStyledAttributes.getInt(index, dVar5.c);
                        break;
                    case 79:
                        C0036c cVar4 = aVar.d;
                        cVar4.h = obtainStyledAttributes.getFloat(index, cVar4.h);
                        break;
                    case 80:
                        b bVar52 = aVar.e;
                        bVar52.f32m0 = obtainStyledAttributes.getBoolean(index, bVar52.f32m0);
                        break;
                    case 81:
                        b bVar53 = aVar.e;
                        bVar53.f33n0 = obtainStyledAttributes.getBoolean(index, bVar53.f33n0);
                        break;
                    case 82:
                        C0036c cVar5 = aVar.d;
                        cVar5.d = obtainStyledAttributes.getInteger(index, cVar5.d);
                        break;
                    case 83:
                        e eVar12 = aVar.f;
                        int resourceId16 = obtainStyledAttributes.getResourceId(index, eVar12.j);
                        if (resourceId16 == -1) {
                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                        }
                        eVar12.j = resourceId16;
                        break;
                    case 84:
                        C0036c cVar6 = aVar.d;
                        cVar6.l = obtainStyledAttributes.getInteger(index, cVar6.l);
                        break;
                    case 85:
                        C0036c cVar7 = aVar.d;
                        cVar7.k = obtainStyledAttributes.getFloat(index, cVar7.k);
                        break;
                    case 86:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 != 1) {
                            if (i3 != 3) {
                                C0036c cVar8 = aVar.d;
                                cVar8.n = obtainStyledAttributes.getInteger(index, cVar8.o);
                                break;
                            } else {
                                aVar.d.m = obtainStyledAttributes.getString(index);
                                if (aVar.d.m.indexOf("/") <= 0) {
                                    aVar.d.n = -1;
                                    break;
                                } else {
                                    aVar.d.o = obtainStyledAttributes.getResourceId(index, -1);
                                    aVar.d.n = -2;
                                    break;
                                }
                            }
                        } else {
                            aVar.d.o = obtainStyledAttributes.getResourceId(index, -1);
                            C0036c cVar9 = aVar.d;
                            if (cVar9.o == -1) {
                                break;
                            } else {
                                cVar9.n = -2;
                                break;
                            }
                        }
                    case 87:
                        StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                        i0.d.a.a.a.d(index, P0, "   ");
                        P0.append(b.get(index));
                        Log.w("ConstraintSet", P0.toString());
                        break;
                    case 91:
                        b bVar54 = aVar.e;
                        int resourceId17 = obtainStyledAttributes.getResourceId(index, bVar54.r);
                        if (resourceId17 == -1) {
                            resourceId17 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar54.r = resourceId17;
                        break;
                    case 92:
                        b bVar55 = aVar.e;
                        int resourceId18 = obtainStyledAttributes.getResourceId(index, bVar55.s);
                        if (resourceId18 == -1) {
                            resourceId18 = obtainStyledAttributes.getInt(index, -1);
                        }
                        bVar55.s = resourceId18;
                        break;
                    case 93:
                        b bVar56 = aVar.e;
                        bVar56.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar56.M);
                        break;
                    case 94:
                        b bVar57 = aVar.e;
                        bVar57.T = obtainStyledAttributes.getDimensionPixelSize(index, bVar57.T);
                        break;
                    case 95:
                        l(aVar.e, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        l(aVar.e, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        b bVar58 = aVar.e;
                        bVar58.f35p0 = obtainStyledAttributes.getInt(index, bVar58.f35p0);
                        break;
                    default:
                        StringBuilder P02 = i0.d.a.a.a.P0("Unknown attribute 0x");
                        i0.d.a.a.a.d(index, P02, "   ");
                        P02.append(b.get(index));
                        Log.w("ConstraintSet", P02.toString());
                        break;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a h(int i2) {
        if (!this.i.containsKey(Integer.valueOf(i2))) {
            this.i.put(Integer.valueOf(i2), new a());
        }
        return this.i.get(Integer.valueOf(i2));
    }

    public a i(int i2) {
        if (this.i.containsKey(Integer.valueOf(i2))) {
            return this.i.get(Integer.valueOf(i2));
        }
        return null;
    }

    public void j(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a g2 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g2.e.b = true;
                    }
                    this.i.put(Integer.valueOf(g2.a), g2);
                }
            }
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L_0x0067
            if (r0 == r5) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r7
            goto L_0x004e
        L_0x0031:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r6
            goto L_0x004e
        L_0x003b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r3
            goto L_0x004e
        L_0x0045:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = r5
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r5) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, h0.g.c.c$a> r0 = r9.i     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r7
            goto L_0x00d9
        L_0x007e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r5
            goto L_0x00d9
        L_0x0093:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r6
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = r3
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.ConstraintAttribute.f(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            h0.g.c.c$c r0 = r2.d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            h0.g.c.c$b r0 = r2.e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            h0.g.c.c$e r0 = r2.f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            h0.g.c.c$d r0 = r2.c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$a r0 = r9.g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$b r2 = r0.e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f28i0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$a r0 = r9.g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$b r2 = r0.e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.c = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$a r0 = r9.g(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            h0.g.c.c$a r0 = r9.g(r10, r0, r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.c.c.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
