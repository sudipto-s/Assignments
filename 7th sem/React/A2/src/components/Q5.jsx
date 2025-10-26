import React, { useState } from 'react'

const names = ["Rahul", "Bina", "Amit", "Sneha", "Rabin", "Priya", "Kabir", "Diya"]

export default function StudentFilter() {
   const [filter, setFilter] = useState(names)

   const handleChange = (e) => {
      const val = e.target.value.toLowerCase()
      const filteredNames = names.filter(name => name.toLowerCase().includes(val))
      setFilter(filteredNames.length ? filteredNames : ["No name found"])
   }

   return (
      <div className='q5'>
         <h1>Search Students</h1>
         <input type="text" onChange={handleChange} />
         <div>
            {filter.map(s => (
               <span key={s}>{s}</span>
            ))}
         </div>
      </div>
   )
}
