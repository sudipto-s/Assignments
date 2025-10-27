import { useState } from 'react'

export default function Q2() {
   const [username, setUsername] = useState('')
   const [password, setPassword] = useState('')
   const [submitted, setSubmitted] = useState(false)

   const handleSubmit = e => {
      e.preventDefault()
      setSubmitted(true)
   }

   return (
      <div>
         <h1>Login</h1>
         <form onSubmit={handleSubmit}>
            <div>
               <label htmlFor="username">Username:</label>
               <input type="text" id="username" value={username} onChange={e => setUsername(e.target.value)} required />
            </div>
            <div>
               <label htmlFor="password">Password:</label>
               <input type="password" id="passowrd" value={password} onChange={e => setPassword(e.target.value)} required />
            </div>
            <div>
               <input type="checkbox" id='showP' />
               <label htmlFor="showP">Show Password</label>
            </div>
            <button type="submit">Login</button>
            <span>
               Forgot <a href="#">Username</a>/<a href="#">Password</a>?
            </span>
            <span>Don't have an account? <a href="#">Sign up</a></span>
            {submitted && <p>Welcome, {username}!</p>}
         </form>
      </div>
   )
}
