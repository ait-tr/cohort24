# useEffect()
Хук Реакта, позволяет выполнять побочные эффекты на одном из этапов жизненного цикла компонента.  
 - Принимает: callback-функцию и массив зависимостей
 - Возвращает: ничего

Callback-функция может возвращать любую другую функцию, которая будет выполнена сразу перед размонтированием компонента.  

useEffect - это функция отложенного типа.

````
    useEffect(() => {
        // какая-то функция-эффект

        return () => {
       // функция очистки эффекта
        }
    }, [/* массив зависимостей */])
````
Массив зависимостей:
- если нет - эффект запускается при каждом рендере (бесконечный цикл)
- если пустой [] - эффект сработает только при первом рендере
- если есть зависимости [...] - эффект сработает при первом рендере и при изменении переменных, от которых он зависит

Пример:
````
 useEffect(() => {
        async function loadGender(): Promise<void> {
            const response = await fetch(`https://api.genderize.io?name=${firstName}`);
            const object = await response.json();
            // console.log(object); // {count: 14512, gender: 'female', name: 'sasha', probability: 0.52}
            setGender(object.gender)
        }
        console.log("use effect gender");
        loadGender()
    },[firstName])
````
# useRef()
Хук Реакта, позволяет сохранить некоторый объект, который можно можно изменять и который хранится в течение всей жизни компонента.  
- Принимает: начальное значение хранимого объекта
- Возвращает: ссылка-объект, из свойства current которого можно получить хранимое значение.

Хук useRef не приводит к повторному перерендериванию компонента даже когда происходит изменение данных в нем.

Пример:

````
function Form() {
  const ref = useRef(null)

  const focus = () => {
    ref.current.focus()
  }

  return (
    <>
      <input ref={ref} />
      <button onClick={focus}>Focus</button>
    </>
  )
}
````

## Полезные ссылки
- Общая информация про useEffect и useRef с примерами [ссылка](https://www.w3schools.com/react/react_useeffect.asp)
- Видео Минина про useEffect на примере to-do list [ссылка](https://www.youtube.com/watch?v=hwPo6OLBbD8)
- Видео Минина про все хуки [ссылка](https://www.youtube.com/watch?v=9KJxaFHotqI)
- Сайт с бесплатной Api (которую использовали на лекции) [ссылка](https://genderize.io/)
- Сайт с генерациией Api вашего формата [ссылка](https://designer.mocky.io/)
