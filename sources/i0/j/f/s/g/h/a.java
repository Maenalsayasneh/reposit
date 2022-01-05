package i0.j.f.s.g.h;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.o.a.z;
import java.util.List;

/* compiled from: QuestionsPagerAdapter */
public class a extends z {
    public List<com.instabug.survey.ui.i.a> f;

    public a(FragmentManager fragmentManager, List<com.instabug.survey.ui.i.a> list) {
        super(fragmentManager);
        this.f = list;
    }

    public Fragment a(int i) {
        return this.f.get(i);
    }

    public com.instabug.survey.ui.i.a c(int i) {
        return this.f.get(i);
    }

    public int getCount() {
        return this.f.size();
    }
}
