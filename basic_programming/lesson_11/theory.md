# Методы строк

## Условия

- `boolean isEmpty()` — пустая ли строка?
- `boolean startsWith(String)` — сравнивает начало строки с аргументом
- `boolean endsWith(String)` — сравнивает конец строки с аргументом

## Поиск индекса

- `int indexOf(char)` — найти самый первый индекс этого символа; получится -1, если не нашли
- `int indexOf(String)` — найти самый первый индекс этой подстроки; получится -1, если не нашли
- `int indexOf(char, int fromIndex)` — как indexOf(char), но не с начала, а с fromIndex
- `int indexOf(String, int fromIndex)` — как indexOf(String), но не с начала, а с fromIndex
