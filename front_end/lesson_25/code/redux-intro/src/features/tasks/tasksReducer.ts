import uniqid from 'uniqid';
import Action from './types/Action';
import Task from './types/Task';

const initialState: Task[] = [
  {
    id: uniqid(),
    title: 'Learn Redux',
    done: false
  }
];

export default function tasksReducer(
  state: Task[] = initialState, action: Action): Task[] {
  switch (action.type) {
    case 'tasks/add':
      return [...state, { id: uniqid(), title: action.payload, done: false }];
    case 'tasks/delete':
      return state.filter((task) => task.id !== action.payload);
    case 'tasks/edit':
      return state.map((task) => {
        if (task.id === action.payload.id) {
          return { ...task, title: action.payload.title };
        }
        return task;
      });
    case 'tasks/done':
      return state.map((task) => {
        if (task.id === action.payload) {
          return { ...task, done: !task.done };
        }
        return task;
      });
    default: return state;
  }
}

// положение дел + действие ---> [reducer]---> новое положение дел
