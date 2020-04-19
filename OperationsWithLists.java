
public class OperationsWithLists {

    public static <T> MyList<T> compareWithoutOverlap(MyList<T> firstList, MyList<T> secondList) {
        MyList<T> newList = new MyList<>();
        MyList.ElementOfList<T> head = newList.getHead();
        MyList.ElementOfList<T> first = firstList.getHead();
        MyList.ElementOfList<T> second = secondList.getHead();
        while (first != null) {
            if (newList.isInList(first.getFieldOfData()))
                first = first.getNext();
            else {
                newList.addElem(first.getFieldOfData());
                first = first.getNext();
            }
        }
        while (second != null) {
            if (newList.isInList(second.getFieldOfData()))
                second = second.getNext();
            else {
                newList.addElem(second.getFieldOfData());
                second = second.getNext();
            }
        }
        return newList;
    }

    public static <T> MyList<T> newListFromSource(MyList<T> source) {
        MyList<T> newList = new MyList<>();
        MyList.ElementOfList<T> current = source.getHead();
        while (current != null) {
            newList.addElem(current.getFieldOfData());
            current = current.getNext();
        }
        return newList;
    }

    public static <T> void separationByOddAndEven(MyList<T> sourceList, MyList<T> firstList, MyList<T> secondList) {
        MyList.ElementOfList<T> source = sourceList.getHead();
        for (int i = 1; source != null; source = source.getNext(), i++) {
            if (i % 2 == 0)
                secondList.addElem(source.getFieldOfData());
            else
                firstList.addElem(source.getFieldOfData());
        }
    }

}
