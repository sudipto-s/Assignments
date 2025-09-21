import React from "react"

function Movie({ title, year }) {
   return (
      <div>
         <h2>Title: {title}</h2>
         <h3>Year: {year}</h3>
      </div>
   )
}

export default Movie