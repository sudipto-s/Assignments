import React, { useState } from "react"

const Movie = () => {
   const [data, setData] = useState([])
   const [loading, setLoading] = useState(true)
   
   const handleClick = async () => {
      setLoading(p => !p)
      const movies  = await fetch("/data.json")
      const movieJSON = await movies.json()
      setData(movieJSON)
   }

   return (
      <div>
         <button onClick={handleClick}>Toggle list</button>
         {!loading ? data?.map(m => (
            <div key={m.id}>
               <h3>{m.title}</h3>
               <p>{m.year}</p>
               <p>{m.distributor}</p>
            </div>
         )) :
            <p>Loading..</p>}
      </div>
   )
}

export default Movie