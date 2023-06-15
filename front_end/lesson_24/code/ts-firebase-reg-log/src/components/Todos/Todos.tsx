import React, { useEffect, useState } from 'react';
import {
  DocumentData, addDoc, collection,
  deleteDoc,
  doc,
  onSnapshot, orderBy, query, serverTimestamp,
} from 'firebase/firestore';
import { db } from '../../api/firebase';

export default function Todos(): JSX.Element {
  const [todos, setTodos] = useState<DocumentData[]>([]);
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [input, setInput] = useState('');
  const q = query(collection(db, 'todos'), orderBy('timestamp', 'desc'));
  useEffect(() => {
    onSnapshot(q, (snapshot) => {
      setTodos(snapshot.docs.map((document: DocumentData) => ({
        id: document.id,
        item: document.data()
      })));
    });
    console.log(todos);
  }, [input]);

  const addTodo = (e: React.SyntheticEvent): void => {
    e.preventDefault();
    addDoc(collection(db, 'todos'), {
      todo: input,
      timestamp: serverTimestamp()
    });
    setInput('');
  };

  return (
    <>
      <div>Todos</div>
      <form onSubmit={addTodo} name="add_todo">
        <input
          type="text"
          value={input}
          required
          placeholder="What to do?"
          onChange={(e) => setInput(e.target.value)}
        />
        <button type="submit">Add</button>
      </form>
      {todos.map((el) => (
        <div key={el.id}>
          {el.item.todo}
          <button
            type="button"
            onClick={
              () => { deleteDoc(doc(db, 'todos', el.id)); }
            }
          >
            Done
          </button>
        </div>
      ))}

    </>
  );
}
