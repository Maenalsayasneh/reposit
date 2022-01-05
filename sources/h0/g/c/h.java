package h0.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: StateSet */
public class h {
    public int a = -1;
    public SparseArray<a> b = new SparseArray<>();

    /* compiled from: StateSet */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c = -1;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.State_android_id) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == R.styleable.State_constraints) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* compiled from: StateSet */
    public static class b {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public float c = Float.NaN;
        public float d = Float.NaN;
        public int e = -1;

        public b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.Variant_constraints) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    "layout".equals(resourceTypeName);
                } else if (index == R.styleable.Variant_region_heightLessThan) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == R.styleable.Variant_region_heightMoreThan) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == R.styleable.Variant_region_widthLessThan) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == R.styleable.Variant_region_widthMoreThan) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (!Float.isNaN(this.a) && f < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (!Float.isNaN(this.c) && f > this.c) {
                return false;
            }
            if (Float.isNaN(this.d) || f2 <= this.d) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.a = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r9.b = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r11)
            int[] r2 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r2)
            int r2 = r1.getIndexCount()
            r3 = 0
            r4 = r3
        L_0x0022:
            if (r4 >= r2) goto L_0x0037
            int r5 = r1.getIndex(r4)
            int r6 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r5 != r6) goto L_0x0034
            int r6 = r9.a
            int r5 = r1.getResourceId(r5, r6)
            r9.a = r5
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x0037:
            r1.recycle()
            r1 = 0
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x003f:
            r4 = 1
            if (r2 == r4) goto L_0x00bc
            if (r2 == 0) goto L_0x00ab
            java.lang.String r5 = "StateSet"
            r6 = 3
            r7 = 2
            if (r2 == r7) goto L_0x005a
            if (r2 == r6) goto L_0x004e
            goto L_0x00ae
        L_0x004e:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            boolean r2 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x00ae
            goto L_0x00bc
        L_0x005a:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            int r8 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            switch(r8) {
                case 80204913: goto L_0x0081;
                case 1301459538: goto L_0x0077;
                case 1382829617: goto L_0x0070;
                case 1901439077: goto L_0x0066;
                default: goto L_0x0065;
            }     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x0065:
            goto L_0x008b
        L_0x0066:
            java.lang.String r4 = "Variant"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r6
            goto L_0x008c
        L_0x0070:
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            goto L_0x008c
        L_0x0077:
            java.lang.String r4 = "LayoutDescription"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r3
            goto L_0x008c
        L_0x0081:
            java.lang.String r4 = "State"
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r2 == 0) goto L_0x008b
            r4 = r7
            goto L_0x008c
        L_0x008b:
            r4 = r0
        L_0x008c:
            if (r4 == r7) goto L_0x009e
            if (r4 == r6) goto L_0x0091
            goto L_0x00ae
        L_0x0091:
            h0.g.c.h$b r2 = new h0.g.c.h$b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            if (r1 == 0) goto L_0x00ae
            java.util.ArrayList<h0.g.c.h$b> r4 = r1.b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x00ae
        L_0x009e:
            h0.g.c.h$a r1 = new h0.g.c.h$a     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r1.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            android.util.SparseArray<h0.g.c.h$a> r2 = r9.b     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            int r4 = r1.a     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            r2.put(r4, r1)     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x00ae
        L_0x00ab:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
        L_0x00ae:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00b8, IOException -> 0x00b3 }
            goto L_0x003f
        L_0x00b3:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00bc
        L_0x00b8:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.c.h.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public int a(int i, int i2, int i3) {
        int i4;
        a aVar;
        int a2;
        float f = (float) i2;
        float f2 = (float) i3;
        if (-1 == i) {
            if (i == -1) {
                aVar = this.b.valueAt(0);
            } else {
                aVar = this.b.get(-1);
            }
            if (aVar == null || -1 == (a2 = aVar.a(f, f2))) {
                return -1;
            }
            i4 = a2 == -1 ? aVar.c : aVar.b.get(a2).e;
        } else {
            a aVar2 = this.b.get(i);
            if (aVar2 == null) {
                return -1;
            }
            int a3 = aVar2.a(f, f2);
            i4 = a3 == -1 ? aVar2.c : aVar2.b.get(a3).e;
        }
        return i4;
    }
}
