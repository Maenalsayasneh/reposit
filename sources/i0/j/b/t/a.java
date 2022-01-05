package i0.j.b.t;

import android.graphics.drawable.AnimationDrawable;

/* compiled from: AttachmentsAdapter */
public class a implements Runnable {
    public final /* synthetic */ AnimationDrawable c;

    public a(AnimationDrawable animationDrawable) {
        this.c = animationDrawable;
    }

    public void run() {
        this.c.start();
    }
}
