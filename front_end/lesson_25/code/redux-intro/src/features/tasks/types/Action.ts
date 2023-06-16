type Action =
  | { type: 'tasks/add'; payload: string }
  | { type: 'tasks/delete'; payload: string }
  | { type: 'tasks/edit'; payload: { id: string, title: string } }
  | { type: 'tasks/done'; payload: string };

export default Action;
