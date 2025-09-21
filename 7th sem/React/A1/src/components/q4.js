import React from "react"

const movies = [
   {
      title: "Inception",
      distributor: "Warner Bros.",
      year: 2010,
      amt: 825532764,
   },
   {
      title: "Interstellar",
      distributor: "Paramount Pictures",
      year: 2014,
      amt: 677471339
   },
   {
      title: "The Dark Knight",
      distributor: "Warner Bros.",
      year: 2008,
      amt: 1004558444
   }]

function Movie() {
   return (
      <div>
         {movies.map(m => (
            <div key={m.title}>
               <h2>{m.title} ({m.year})</h2>
               <p>Distributor: {m.distributor}</p>
               <p>Box Office: ${m.amt}</p>
            </div>
         ))}
      </div>
   )
}

export default Movie