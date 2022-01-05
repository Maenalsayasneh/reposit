package h0.b0;

/* compiled from: SidePropagation */
public class h extends o {
    public static final String[] a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    public int b = 80;

    public static int a(r rVar, int i) {
        int[] iArr;
        if (rVar == null || (iArr = (int[]) rVar.a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }
}
