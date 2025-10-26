import { useState } from 'react'

export default function Q2() {
   const [data, setData] = useState({
      name: '',
      password: ''
   })
   const [errors, setErrors] = useState({
      name: '',
      password: ''
   })

   const handleChange = e => {
      e.preventDefault()
      const name = e.target[0].value
      const password = e.target[1].value
      if(name.length < 8) {
         setErrors({
            ...errors,
            name: 'Name must be at least 8 characters long'
         })
         return
      }
      if(!/^(?=.*[A-Z])(?=.*\d)(?=.*[^A-Za-z0-9]).+$/.test(password)) {
         setErrors({
            ...errors,
            password: 'Password must contain at least 1 uppercase letter, 1 number, and 1 special character'
         })
         return
      }
      setErrors({
         name: '',
         password: ''
      })
      setData({ name, password })
   }

   return (
      <div>
         <h1>Login</h1>
         <form onSubmit={handleChange}>
            <div>
               <label htmlFor="name">Name:</label>
               <input type="text" id="name" name="name" required />
               <span className='error'>{errors.name}</span>
            </div>
            <div>
               <label htmlFor="password">Password:</label>
               <input type="password" id="password" name="password" required />
               <span className='error'>{errors.password}</span>
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
            {data.name && <p>Welcome, {data.name}!</p>}
         </form>
      </div>
   )
}
