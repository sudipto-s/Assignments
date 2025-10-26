import { useState } from 'react'

export default function Q1() {
   const [count, setCount] = useState(0)

   return (
      <div className="counter">
         <h1>Counter Example</h1>
         <h2>Count: {count}</h2>
         <div className="container">
            <button onClick={() => setCount(c => c+1)}>+</button>
            <button onClick={() => setCount(c => c-1)}>-</button>
         </div>
      </div>
   )
}
