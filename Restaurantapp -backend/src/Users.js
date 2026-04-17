import React, { useEffect, useState } from "react";

function Users() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch("http://localhost:9999/api/users")
      .then(res => res.json())
      .then(data => setUsers(data));
  }, []);

  return (
    <div>
      <h2>Users</h2>
      {users.map(u => (
        <div key={u.id}>
          {u.username}
        </div>
      ))}
    </div>
  );
}

export default Users;