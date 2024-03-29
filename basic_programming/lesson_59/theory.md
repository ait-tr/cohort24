# Сортировка пузырьком

- Худшее время: O(n<sup>2</sup>)
- Лучшее время: O(n<sup>2</sup>) (O(n) при введении дополнительной проверки)
- Среднее время: O(n<sup>2</sup>)
- Затраты памяти: O(1)

Сортировка простыми обменами, сортировка пузырьком (англ. **bubble sort**) — простой алгоритм сортировки. Для понимания и реализации этот алгоритм — простейший, но эффективен он лишь для небольших массивов.

Алгоритм считается учебным и практически не применяется вне учебной литературы, вместо него на практике применяются более эффективные алгоритмы сортировки. В то же время метод сортировки обменами лежит в основе некоторых более совершенных алгоритмов, таких как шейкерная сортировка, пирамидальная сортировка и быстрая сортировка.

Алгоритм состоит из повторяющихся проходов по сортируемому массиву. За каждый проход элементы последовательно сравниваются попарно и, если порядок в паре неверный, выполняется перестановка элементов.

Проходы по массиву повторяются (N - 1) раз или до тех пор, пока на очередном проходе не окажется, что обмены больше не нужны, что означает — массив отсортирован.

При каждом проходе алгоритма по внутреннему циклу очередной наибольший элемент массива ставится на своё место в конце массива рядом с предыдущим «наибольшим элементом», а наименьший элемент перемещается на одну позицию к началу массива («всплывает» до нужной позиции, как пузырёк в воде — отсюда и название алгоритма).

![Сортировка пузырьком](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

# Сортировка слиянием

- Худшее время: O(n log n)
- Лучшее время: O(n log n)
- Среднее время: O(n log n)
- Затраты памяти: O(1) для связного списка,
O(n) для массива

Сортировка слиянием (англ. **merge sort**) — алгоритм сортировки, который упорядочивает списки в определённом порядке.

Эта сортировка — хороший пример использования принципа «разделяй и властвуй» (англ. **divide and conquer**):

Сначала задача разбивается на несколько подзадач меньшего размера. Затем эти задачи решаются с помощью рекурсивного вызова или непосредственно, если их размер достаточно мал. Наконец, их решения комбинируются, и получается решение исходной задачи.

Для решения задачи сортировки эти три этапа выглядят так:

- Сортируемый массив разбивается на две части примерно одинакового размера;
- Каждая из получившихся частей сортируется отдельно, например — тем же самым алгоритмом;
- Два упорядоченных массива половинного размера соединяются в один.

Рекурсивное разбиение задачи на меньшие происходит до тех пор, пока размер массива не достигнет единицы (любой массив длины 1 можно считать упорядоченным).

Алгоритм был изобретён Джоном фон Нейманом в 1945 году.

![Сортировка слиянием](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

Действие алгоритма на примере сортировки случайных точек:
![Действие алгоритма на примере сортировки случайных точек](https://upload.wikimedia.org/wikipedia/commons/c/c5/Merge_sort_animation2.gif)

Именно эта сортировка (точнее, её разновидность) реализована в методе `Collections.sort()`.
