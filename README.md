# LinkedList-Java
### Структура данных:
Односвязный линейный список  
![IMG](https://github.com/kdm1t/LinkedList-Java/blob/master/images/structure.png)

### Классы и их назначение:
#### `public class MyList<T>` - односвязный линейный список (ссылочный).
```
public class MyList<T> {  
    private ElementOfList<T> head;  
    private ElementOfList<T> tail;  
    private int size = 0;  
}  
```
  
  `head` - ссылка на "голову" (первый элемент) списка  
  `tail` - ссылка на "хвост" (последний элемент) списка  
  `size` - размер списка (количество элементов)  
#### `static class ElementOfList<T>` - внутренний класс в `public class MyList<T>`, представляет собой элемент (узел) списка.
   

``` 
static class ElementOfList<T> {
    private T fieldOfData;
    private ElementOfList<T> next;
}
```

`fieldOfData` - поле данных  
`next` - ссылка на следующий элемент списка
#### `public class OperationsWithLists` - работа со списками.



### Методы классов:
|MyList<T>|ElementOfList<T>|OperationsWithLists|
|---|---|---|
|`public ElementOfList<T> getHead()` - получить голову|`private ElementOfList(T fieldOfData)` - конструктор|`public static <T> MyList<T> compareWithoutOverlap(MyList<T> firstList, MyList<T> secondList)` - объединение двух списков в третий без повторения элементов|
|`public ElementOfList<T> getTail()` - получить хвост|`public T getFieldOfData()` - получить значение поля данных|`public static <T> MyList<T> newListFromSource(MyList<T> source)` - создание нового списка из элементов исходного
|`public int getSize()` - получить размер|`public void setFieldOfData(T fieldOfData)` - занести значение в поле данных|`public static <T> void separationByOddAndEven(MyList<T> sourceList, MyList<T> firstList, MyList<T> secondList)` - разделение списка на два (нечетные по номеру в первый, четные во второй)
|`public void addElem(T data)` - добавить элемент в конец списка|`public ElementOfList<T> getNext()` - получить следующий элемент|
|`public void delElemN(int n)` - удалить элемент по индексу N|`private void setNext(ElementOfList<T> next)` - назначить следующий|
|`public void delMElementsFromN(int m, int n)` - удалить M элементов с N-ой позиции|
|`public void delElemIfEqual(T data)` - удалить из списка все вхождения элемента|
|`public void replaceIfEqual(T data, T CON)` - замена всех вхождений на константу|
|`public int howMuchAfterN(int n)` - число элементов после N|
|`public void addConstToEnd(T CON, int n)` - добавление константы в конец N раз|
|`public void reverse()` - инверсия списка|
|`public boolean isInList(T data)` - есть ли элемент в списке|


### Задание:
|Вариант|Функция|
|-------|-------|
|Вариант 2. Написать программу замены всех вхождений элемента в список на заданную константу.|`replaceIfEqual(T data, T CON);`|
|Вариант 5. Написать программу удаления М элементов из списка, начиная с N-й позиции.|`delMElementsFromN(int m, int n);`|
|Вариант 7. Написать программу разделения списка на два так, чтобы нечетные (по номеру) элементы были в первом списке, а четные - во втором.|`separationByOddAndEven(MyList<T> sourceList, MyList<T> firstList, MyList<T> secondList);`|
|Вариант 12. Написать программу удаления из списка всех вхождений заданного элемента.|`delElemIfEqual(T data);`|
|Вариант 14. Написать программу объединения двух списков в третий так, чтобы одинаковые элементы из разных списков не повторялись.|`compareWithoutOverlap(MyList<T> firstList, MyList<T> secondList);`|
|Вариант 15. Написать программму инвертирования списка.|`reverse();`|
|Вариант 21. Написать программу вычисления числа элементов списка после N-й позиции.|`howMuchAfterN(int n);`|
|Вариант 25. Написать программу создания нового списка путем дублирования элементов исходного списка.|`newListFromSource(MyList<T> source);`|
|Вариант 30. Написать программу дописывания заданной константы N раз в конец списка.|`addConstToEnd(T CON, int n);`|

### Тесты работы программы:
Во всех заданиях для всех входных данных добавлена обработка исключений, некорректных аргументов и выходов за пределы списка.  
Принцип вывода элементов списка:  
`[Индекс] Элемент | [Индекс] Элемент | .... | Размер списка`

##### Вариант 2. Написать программу замены всех вхождений элемента в список на заданную константу.
![Img1](https://github.com/kdm1t/LinkedList-Java/blob/master/images/1.png)
#### Вариант 5. Написать программу удаления М элементов из списка, начиная с N-й позиции.
![Img2](https://github.com/kdm1t/LinkedList-Java/blob/master/images/2.png)
#### Вариант 7. Написать программу разделения списка на два так, чтобы нечетные (по номеру) элементы были в первом списке, а четные - во втором.
![Img3](https://github.com/kdm1t/LinkedList-Java/blob/master/images/3.png)
#### Вариант 12. Написать программу удаления из списка всех вхождений заданного элемента.
![Img4](https://github.com/kdm1t/LinkedList-Java/blob/master/images/4.png)
#### Вариант 14. Написать программу объединения двух списков в третий так, чтобы одинаковые элементы из разных списков не повторялись.
![Img5](https://github.com/kdm1t/LinkedList-Java/blob/master/images/5.png)
#### Вариант 15. Написать программму инвертирования списка.
![Img6](https://github.com/kdm1t/LinkedList-Java/blob/master/images/6.png)
#### Вариант 21. Написать программу вычисления числа элементов списка после N-й позиции.
![Img7](https://github.com/kdm1t/LinkedList-Java/blob/master/images/7.png)
#### Вариант 25. Написать программу создания нового списка путем дублирования элементов исходного списка.
![Img8](https://github.com/kdm1t/LinkedList-Java/blob/master/images/8.png)
#### Вариант 30. Написать программу дописывания заданной константы N раз в конец списка.
![Img9](https://github.com/kdm1t/LinkedList-Java/blob/master/images/9.png)
