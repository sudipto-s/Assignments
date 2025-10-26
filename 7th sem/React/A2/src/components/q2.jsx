import { useState } from 'react'

export default function Q2() {
   const [data, setData] = useState({
      name: '',
      password: ''
   })

   const handleChange = e => {
      e.preventDefault()
      const name = e.target[0].value
      const password = e.target[1].value
      setData({ name, password })
   }

   return (
      <div>
         <h1>Login</h1>
         <form onSubmit={handleChange}>
            <div>
               <label htmlFor="name">Name:</label>
               <input type="text" id="name" name="name" />
            </div>
            <div>
               <label htmlFor="password">Password:</label>
               <input type="password" id="password" name="password" />
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
            <p>Welcome, {data.name}!</p>
         </form>
      </div>
   )
}
