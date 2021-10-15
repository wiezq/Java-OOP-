package eight;

import java.util.Optional;

public class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList()
    {
        super();
    }

    public void remove(E element) {
        E first = content.peek();
        if (element != first) {
            content.remove(element);
        }
    }

    public void moveToBack(E element)
    {
        if (!content.isEmpty()) {
            content.remove(element);
            content.offer(element);
        }
    }
}
