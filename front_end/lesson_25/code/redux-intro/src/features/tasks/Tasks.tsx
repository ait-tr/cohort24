import React, { SyntheticEvent, useState } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { RootState } from '../../store';

export default function Tasks(): JSX.Element {
  const tasks = useSelector((globalState: RootState) => globalState.tasks);
  const [task, setTask] = useState<string>('');
  const [title, setTitle] = useState<string>('');
  const dispatch = useDispatch();
  function addTask(e: SyntheticEvent): void {
    e.preventDefault();
    dispatch({ type: 'tasks/add', payload: task });
    setTask('');
  }
  const edit = (event: React.FormEvent<HTMLFormElement>, id: string): void => {
    event.preventDefault();
    dispatch({ type: 'tasks/edit', payload: { id, title } });
    setTitle('');
  };

  return (
    <>
      <div>Tasks</div>
      <form onSubmit={addTask}>
        <input
          type="text"
          required
          value={task}
          onChange={(e) => setTask(e.target.value)}
        />
        <button type="submit">Добавить</button>
      </form>
      <ul>
        {
          tasks.map((el) =>
          (
            <li key={el.id}>
              {el.title}
              <button
                type="button"
                onClick={
                  () => dispatch({ type: 'tasks/delete', payload: el.id })
                }
              >
                Удалить
              </button>
              <form onSubmit={
                (e) => edit(e, el.id)
              }
              >
                <input
                  type="text"
                  required
                  value={title}
                  onChange={(e) => setTitle(e.target.value)}
                />
                <button type="submit">Изменить</button>
              </form>
            </li>
          ))
        }
      </ul>
    </>
  );
}
