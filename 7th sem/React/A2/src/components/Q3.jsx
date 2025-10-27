import { useState } from 'react'

export default function Q2() {
   const [username, setUsername] = useState('')
   const [password, setPassword] = useState('')
   const [submitted, setSubmitted] = useState(false)
   const [errors, setErrors] = useState({
      name: '',
      password: ''
   })

   const handleSubmit = e => {
      e.preventDefault()
      if(username.length < 8) {
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
      setSubmitted(true)
      setErrors({
         name: '',
         password: ''
      })
   }

   return (
      <div>
         <h1>Login</h1>
         <form onSubmit={handleSubmit}>
            <div>
               <label htmlFor="username">Username:</label>
               <input type="text" id="username" value={username} onChange={e => setUsername(e.target.value)} required />
               <span className='error'>{errors.name}</span>
            </div>
            <div>
               <label htmlFor="password">Password:</label>
               <input type="password" id="passowrd" value={password} onChange={e => setPassword(e.target.value)} required />
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
            {submitted && <p>Welcome, {username}!</p>}
         </form>
      </div>
   )
}
