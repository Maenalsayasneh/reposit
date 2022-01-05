package m0.j;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractCollection;
import m0.n.b.i;

/* compiled from: AbstractList.kt */
public abstract class a<E> extends AbstractCollection<E> implements List<E>, m0.n.b.s.a {

    /* renamed from: m0.j.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractList.kt */
    public class C0240a implements Iterator<E>, m0.n.b.s.a {
        public int c;

        public C0240a() {
        }

        public boolean hasNext() {
            return this.c < a.this.b();
        }

        public E next() {
            if (hasNext()) {
                a aVar = a.this;
                int i = this.c;
                this.c = i + 1;
                return aVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    public class b extends a<E>.defpackage.a implements ListIterator<E>, m0.n.b.s.a {
        public b(int i) {
            super();
            a.j(i, a.this.b());
            this.c = i;
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return this.c > 0;
        }

        public int nextIndex() {
            return this.c;
        }

        public E previous() {
            if (hasPrevious()) {
                a aVar = a.this;
                int i = this.c - 1;
                this.c = i;
                return aVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.c - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    public static final class c<E> extends a<E> implements RandomAccess {
        public int c;
        public final a<E> d;
        public final int q;

        public c(a<? extends E> aVar, int i, int i2) {
            i.e(aVar, "list");
            this.d = aVar;
            this.q = i;
            int b = aVar.b();
            if (i < 0 || i2 > b) {
                StringBuilder R0 = i0.d.a.a.a.R0("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                R0.append(b);
                throw new IndexOutOfBoundsException(R0.toString());
            } else if (i <= i2) {
                this.c = i2 - i;
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.h0("fromIndex: ", i, " > toIndex: ", i2));
            }
        }

        public int b() {
            return this.c;
        }

        public E get(int i) {
            a.c(i, this.c);
            return this.d.get(this.q + i);
        }
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(i0.d.a.a.a.h0("index: ", i, ", size: ", i2));
        }
    }

    public static final void j(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(i0.d.a.a.a.h0("index: ", i, ", size: ", i2));
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        i.e(this, "c");
        i.e(collection, RecaptchaActionType.OTHER);
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            for (Object a : this) {
                if (!i.a(a, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i);

    public int hashCode() {
        i.e(this, "c");
        Iterator it = iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i.a(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C0240a();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (i.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new b(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new c(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new b(i);
    }
}
