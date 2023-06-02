import React, { useEffect, useRef, useState } from 'react';
import style from "./GenderIdentification.module.css"

function GenderIdentification() {
    // Закомментирована логика когда в инпуте меняем слово,
    //  и у нас сразу же под инпутом выводится пол


    // const [firstName, setFirstName] = useState<string>("")
    // const [gender, setGender] = useState<string>("")

    // useEffect(() => {
    //     async function loadGender(): Promise<void> {
    //         const response = await fetch(`https://api.genderize.io?name=${firstName}`);
    //         const object = await response.json();
    //         // console.log(object); // {count: 14512, gender: 'female', name: 'sasha', probability: 0.52}
    //         setGender(object.gender)
    //     }
    //     console.log("use effect gender");
    //     loadGender()
    // },[firstName])

    // return (
    //     <div className={style.genderBox}>
    //         <h2>Узнать пол</h2>
    //         <form action="">
    //             <label htmlFor=''>Введите свое имя</label>
    //             <input
    //             type="text"
    //             value={firstName}
    //             onChange={(event) => setFirstName(event.target.value)}
    //             />
    //         </form>
    //         <button>Выбрать</button>
    //         <div>{gender}</div>
    //     </div>
    // );

    // ниже идет логика, что мы можем получить пол только после нажания на кнопку
    const [gender, setGender] = useState<string>("")
    const nameFromInput: any = useRef()

    function getGender() {
        async function loadGender(): Promise<void> {
            const firstName = nameFromInput.current.value;
            const response = await fetch(`https://api.genderize.io?name=${firstName}`);
            const object = await response.json();
            setGender(object.gender)
        }
        loadGender()
    }

    return (
        <div className={style.genderBox}>
            <input
            ref={nameFromInput}
            placeholder='Введите имя на английском'
            />
            <button
            type='button'
            onClick={getGender}
            >
                Выбрать
                </button>
                <div>{gender}</div>
        </div>
    )
}

export default GenderIdentification;