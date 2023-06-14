import React, { useContext } from 'react';
import AuthContext from '../../contexts/AuthContext';

function Profile():JSX.Element {
  const user = useContext(AuthContext);
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email: {user?.email}</p>
        <span>Sign Out</span>
      </div>
    </div>
  );
}

export default Profile;
