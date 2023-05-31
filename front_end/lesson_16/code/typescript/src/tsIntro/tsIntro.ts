// неявное типизирование
let a = 0;

a = 7

let array = [1, 2, 3]

// мы не можем запушить строку, так как тип число
// array.push("fvdfv")

// а число можем
array.push(4)

// когда в массиве строка или число, то можем пушить строку
let array2 = [1, 2, 'hey']

array2.push("dcdc")

//явное типизирование
const m: number = 1
const b: string = "kjnljn"
const c: boolean = true
const d: number | null = 5
let array3: (number | string)[] 
let something: any 


array3 = [3, 5, 8, ""]

type Gender = "male" | "female"

let male: Gender = "male"

type ExtendedGender = Gender | "binary" | "no gender"

// типизация функций
function sum(first: number, second: number): number {
    return first + second
}

// типизация стрелочных функций
const makeArr = (a: number): number[] => [a, a, a]

type Result = {
    name: string,
    secondName: string,
    age: number,
    // birthday: Date
    hasPets?: boolean
    func: () => {}
}
// можно протипизировать через интерфейс
interface Result1 {
    name: string,
    secondName: string,
    age: number,
    // birthday: Date
    hasPets?: boolean
    func: () => {}
}


function ourTotal(sum: number) :Result1 {
    return {
        name: "string",
        secondName: "string",
        age: 2,
        hasPets: true,
        func: () => 1 + 2,
    }
}


// чтобы избежать этой проблемы "Compiled with problems:"
// нужно поставить экспорт файла

export {}