package eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class UnfairWaitList<E> extends WaitList<E> {
    ArrayList<E> deleted;

    UnfairWaitList() {
        super();
        deleted = new ArrayList<>();

    }

    UnfairWaitList(Collection<E> c) {
        super(c);
        deleted = new ArrayList<>();

    }

    public void remove(E element) {
        E first = content.peek();
        if (element != first) {
            content.remove(element);
            deleted.add(element);
        }
    }

    public void moveToBack(E element) {
        if (!content.isEmpty()) {
            content.remove(element);
            content.offer(element);
        }
    }

    @Override
    public void add(E element) {
        if (!deleted.contains(element)) {
            super.add(element);
        }
    }
}
