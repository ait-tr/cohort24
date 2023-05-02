`root` - главный администратор сервера (супер-пользователь)

### Базовые команды Linux

`pwd` (print working directory) - просмотр текущей директории

`cd` (change dir) - перейти в другой каталог

- по умолчанию в дом/каталог
- `cd <target_dir>`

`ls` (listing) - просмотр содержимого каталога

- `ls -l` структурированный вывод
- `ls /`
- `**ls -lah**`
    - `-a` показать скрытые
    - `-h` human-readable
- `ls -R`
    - `-R` recursive

`clear` (или `CTRL+L`) - очистка консоли

`mkdir` (make dir) - создать каталог

- `mkdir new_dir`
- `mkdir -p test1/test2/test3/test4`
    - `-p` parent

`touch` - создать пустой файл

- `touch filename`

`rm` (remove) - удалить файл/каталог

- `rm filename`
- `rm -rf dir_name`
    - `-r` recursive
    - `-f` force

**Задача. В домашнем каталоге пользователя создать иерархию каталогов `dir/dir1/dir2` и в каждом их них создать по произвольному пустому файлу.**

**Ответ - последовательность команд**

```bash
mkdir -p dir/dir1/dir
touch dir/level_1.txt
touch dir/dir1/level_2.txt
touch dir/dir1/dir2/level_3.txt
```

`cat` - вывод содержимого файла (в терминал)

`cat filename`

### Редактирование текстовых файлов

- `nano` - базовый
    - `nano filename`
    - `CTRL+S` - сохранить
    - `CTRL+X` - выйти
- `vim` - продвинутый

`df` (disk free) - просмотр статистики по дискам 

- `df -h`

`du` (disk usage) - просмотр занятого места

- `du <target>`
- `df -hs <target>`
    - `-s` (summarize)

**Задача. Создать иерархию каталогов `hello1/hello2/hello3`. В каталоге `hello1` создать файл `hello1.txt`, в каталоге `hello3` - `hello.txt`.**

```bash
mkdir -p hello1/hello2/hello3
touch hello1/hello1.txt
touch hello1/hello2/hello3/hello.txt
```

### Ветвление в Git

**Ветка** - поток изолированной разработки (еще одна версия проекта)

- ссылка на коммит


### Стратегии ветвления в Git

1. **Git Flow**
    1. `master/main/stable` - long-term
    2. `develop/current` - long-term
    3. `login/payments/ticket01/bugfix01/hotfix8` - short-term
2. **GitHub Flow**
    1. `master`
    2. short-term

### Базовые команды по работе с ветками в Git

- `git branch` просмотр веток
- `git branch новая_ветка`  создать ветку
- `git checkout ветка` переключиться на ветку
    - **ПЕРЕКЛЮЧАТЬСЯ НЕОБХОДИМО С “ЧИСТЫМ СТАТУСОМ”**
- `git checkout -b новая_ветка` создать и переключиться
- `git branch -D ветка` удалить ветку (локально)
- `git merge название_ветки` слияние веток
- `git push origin --delete ветка` удалить ветку (дистанционную)

### Справочная документация

- [linux-песочница](https://bellard.org/jslinux/vm.html?url=alpine-x86.cfg&mem=192)
- [ветвление в Git](https://git-scm.com/book/ru/v2/%D0%92%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B2-Git-%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B-%D0%B2%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B8-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D1%8F)