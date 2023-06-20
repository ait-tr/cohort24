import { useSelector } from "react-redux"
import { changeColor, minus, plus, saveCounterValue } from "./counterSlice";
import { selectColor, selectCounterValue } from "./selectors";
import Color from "./types/Color";
import { useAppDispatch } from "../../store";

export default function Counter(): JSX.Element {
const dispatch = useAppDispatch();
const value = useSelector(selectCounterValue)
const color = useSelector(selectColor)

const save = (): void => {
    dispatch(saveCounterValue(value)).then(() => {
        console.log("saved");
    })
}


const onHandleChangeColor = (color: Color): void => {
     dispatch(changeColor(color))
}

    return (
    <>
        <div>
            <button 
            type="button" 
            onClick={() => dispatch(minus(1))}>
                -1
            </button>{' '}
            <span style={{color}}>{value}</span>{' '}
            <button
            type="button" 
            onClick={() => dispatch(plus(1))}>
                +1
            </button>
        </div>
        <div>
          <button type='button' onClick={() => onHandleChangeColor('red')}>Red</button>{' '}
          <button type='button' onClick={() => onHandleChangeColor('blue')}>Blue</button>
        </div>
        <button type='button' onClick={save}>Save</button>
      </>
    )
}