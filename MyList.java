
public class MyList<T> {
    private ElementOfList<T> head;
    private ElementOfList<T> tail;
    private int size = 0;

    public ElementOfList<T> getHead() {
        return head;
    }

    public ElementOfList<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void addElem(T data) {
        ElementOfList<T> element = new ElementOfList<>(data);
        if (head == null) {
            head = element;
            size++;
            tail = head;
            return ;
        }
        tail.next = element;
        element.next = null;
        tail = element;
        size++;
    }

    public void delElemN(int n) throws IndexOutOfBoundsException{
        if (n >= size)
            throw new IndexOutOfBoundsException("n >= size of list");
        if (n == 0) {
            head = head.next;
            if (head == null)
                tail = null;
            size--;
            return ;
        }
        ElementOfList<T> current = head;
        ElementOfList<T> prev = null;
        int index = 0;
        while (current != null && index < n) {
            prev = current;
            current = current.next;
            index++;
        }
        if (index == n) {
            prev.next = current.next;
            if (current.next == null)
                tail = prev;
            current = null;
            size--;
        }
    }

    public void delMElementsFromN(int m, int n) throws IndexOutOfBoundsException{
        if (m < 0 || n < 0)
            throw new IndexOutOfBoundsException("M <= 0 or N < 0");
        ElementOfList<T> current = head;
        ElementOfList<T> prev = null;
        int count = 0;
        if (m == size)
            tail = null;
        while (count < (n - 1) && current != null) {
            current = current.next;
            count++;
        }
        prev = current;
        for (count = 0; count < m && current != null; count++) {
            current = current.next;
            size--;
        }
        if (n == 0)
            head = current;
        else if (current != null) {
            prev.next = current.next;
            if (current.next == null)
                tail = prev;
        }
        else {
            tail = prev;
            prev.next = null;
        }
    }

    public void delElemIfEqual(T data) throws IllegalArgumentException {
        if (data == null)
            throw new IllegalArgumentException("data is null");
        if (data.equals(head.fieldOfData)) {
            if (head.next == null)
                tail = null;
            head = head.next;
            return ;
        }
        ElementOfList<T> current = head;
        ElementOfList<T> prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
            if (data.equals(current.fieldOfData)) {
                prev.next = current.next;
                if (current.next != null)
                    current = current.next;
            }
        }
        tail = prev;
        size--;
    }

    public void replaceIfEqual(T data, T CON) throws IllegalArgumentException{
        if (data == null)
            throw new IllegalArgumentException("data is null");
        ElementOfList<T> current = head;
        while (current != null) {
            if (data.equals(current.fieldOfData))
                current.setFieldOfData(CON);
            current = current.next;
        }
    }

    public int howMuchAfterN(int n) throws IndexOutOfBoundsException {
        if (n > size || n < 0)
            throw new IndexOutOfBoundsException("N >= size of list or N < 0");
        ElementOfList<T> current = head;
        int count = 0;
        for (int i = 0; current.next != null && i < n; i++)
            current = current.next;
        for (count = 0; current.next != null; count++)
            current = current.next;
        return (count);
    }

    public void addConstToEnd(T CON, int n) throws IllegalArgumentException, IndexOutOfBoundsException {
        if (CON == null)
            throw new IllegalArgumentException("argument is null");
        if (n < 0)
            throw new IndexOutOfBoundsException("N < 0");
        for (int i = 0; i < n; i++) {
            this.addElem(CON);
        }
    }

    public void reverse() throws IllegalArgumentException{
        if (head == null)
            throw new IllegalArgumentException("argument is null");
        ElementOfList<T> first = head;
        ElementOfList<T> second = first.next;
        ElementOfList<T> third = second.next;
        ElementOfList<T> current = null;
        ElementOfList<T> prev = null;
        ElementOfList<T> tmp = null;

        first.next = null;
        second.next = first;
        current = third;
        prev = second;
        while (current != null) {
            tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        head = prev;
    }

    public boolean isInList(T data) {
        ElementOfList<T> current = head;
        while (current != null) {
            if (data.equals(current.fieldOfData))
                return true;
            current = current.next;
        }
        return false;
    }

//    public ElementOfList<T> invertRecursion(ElementOfList<T> head) {
//        if (head == null)
//            return null;
//        if (head.next == null)
//            return head;
//        ElementOfList<T> tmp = invertFirst(head.next);
//        head.next.next = head;
//        head.next = null;
//        return tmp;
//    }
//

    public void displayList() {
        ElementOfList<T> current = head;
        for (int i = 0; current != null; current = current.next, i++) {
            System.out.print("[" + i + "] " + current.fieldOfData + " | ");
        }
        System.out.println(" Size is " + this.size);
    }

    static class ElementOfList<T> {
        private T fieldOfData;
        private ElementOfList<T> next;

        private ElementOfList(T fieldOfData) {
            this.fieldOfData = fieldOfData;
        }

        public T getFieldOfData() {
            return fieldOfData;
        }

        public void setFieldOfData(T fieldOfData) {
            this.fieldOfData = fieldOfData;
        }

        public ElementOfList<T> getNext() {
            return next;
        }

        private void setNext(ElementOfList<T> next) {
            this.next = next;
        }
    }
}
