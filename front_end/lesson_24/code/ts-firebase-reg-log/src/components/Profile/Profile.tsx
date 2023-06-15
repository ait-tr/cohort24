import React, { useContext } from 'react';
import { signOut } from 'firebase/auth';
import AuthContext from '../../contexts/AuthContext';
import UserContext from '../../contexts/UserContext';
import { auth } from '../../api/firebase';

function Profile():JSX.Element {
  const user = useContext(AuthContext);
  const phone = useContext(UserContext);
  return (
    <div>
      <div className="profile">
        <h1>Profile</h1>
        <p>Email: {user?.email}</p>
        <p>Phone: {phone}</p>
        <button type="button" onClick={() => signOut(auth)}>Sign out</button>
      </div>
    </div>
  );
}

export default Profile;
