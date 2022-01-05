package h0.i.i.h0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat */
public final class e {
    public final c a;

    /* compiled from: InputContentInfoCompat */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        public Uri a() {
            return this.a;
        }

        public void b() {
        }

        public Uri c() {
            return this.c;
        }

        public Object d() {
            return null;
        }

        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* compiled from: InputContentInfoCompat */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public e(c cVar) {
        this.a = cVar;
    }

    /* compiled from: InputContentInfoCompat */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        public Uri a() {
            return this.a.getContentUri();
        }

        public void b() {
            this.a.requestPermission();
        }

        public Uri c() {
            return this.a.getLinkUri();
        }

        public Object d() {
            return this.a;
        }

        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }
}
