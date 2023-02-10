# Разновидности списков

Коллекции могут быть реализованы разными способами и нет единственного – самого правильного. При одном подходе одни операции являются быстрыми, а остальные медленными, при другом – все наоборот. Нет одного идеального, подходящего всем решения.

Поэтому было создано несколько реализаций одной и той же коллекции. И каждая реализация была оптимизирована для какого-то узкого набора операций. Так появились разные коллекции. Давай рассмотрим это на примере двух классов – `ArrayList` и `LinkedList`.

`ArrayList` реализован внутри в виде обычного массива. Поэтому при вставке элемента в середину, приходится сначала сдвигать на один все элементы после него, а уже затем в освободившееся место вставлять новый элемент. Зато в нем быстро реализованы взятие и изменение элемента – операции `get`, `set`, так как в них мы просто обращаемся к соответствующему элементу массива.

`LinkedList` реализован внутри по-другому. Он реализован в виде связного списка: набора отдельных элементов, каждый из которых хранит ссылку на следующий и предыдущий элементы. Чтобы вставить элемент в середину такого списка, достаточно поменять ссылки его будущих соседей. А вот чтобы получить элемент с номером 130, нужно пройтись последовательно по всем объектам от 0 до 130. Другими словами операции `set` и `get` тут реализованы очень медленно. Посмотри на таблицу:

| Описание | Операция | `ArrayList` | `LinkedList` |
| --- | --- | --- | --- |
| Взятие элемента по индексу | `get` | <span style="color:green">Быстро</span> | <span style="color:red">Медленно</span> |
| Присваивание элемента по индексу | `set` | <span style="color:green">Быстро</span> | <span style="color:red">Медленно</span> |
| Добавление элемента | `add` | <span style="color:green">Быстро</span> | <span style="color:green">Быстро</span> |
| Вставка элемента | `add(i, value)` | <span style="color:red">Медленно</span> | <span style="color:green">Быстро</span> |
| Удаление элемента | `remove` | <span style="color:red">Медленно</span> | <span style="color:green">Быстро</span> |

Если ты собираешься вставлять (или удалять) в середину коллекции много элементов, то тебе лучше использовать `LinkedList`. Во всех остальных случаях – `ArrayList`.

# Работа со списками и общими методами

При создании ссылки на список вы можете указать класс `List` без уточнения, какую из разновидностей списка вы собираетесь использовать. А вот при создании самого списка при помощи оператора new необходимо уточнить конкретную реализацию — `ArrayList` или `LinkedList` - ведь ведут они себя по-разному.