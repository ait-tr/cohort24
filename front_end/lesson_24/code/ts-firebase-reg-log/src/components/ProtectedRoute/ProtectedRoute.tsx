import React, { useContext } from 'react';
import { Navigate } from 'react-router-dom';
import AuthContext from '../../contexts/AuthContext';

export type ProtectedRouteProps = {
  outlet: JSX.Element;
};

export default function ProtectedRoute(
  { outlet }: ProtectedRouteProps): JSX.Element {
  const currentUser = useContext(AuthContext);
  if (currentUser) {
    return outlet;
  }
  return <Navigate to="/login" />;
}
