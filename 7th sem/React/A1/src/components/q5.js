import React from "react"
import movies from "../../public/data.json"

/* Using import */
const Movie = () => {
   return (
      <div>
         {movies.map(m => (
            <div key={m.id}>
               <h3>{m.title}</h3>
               <p>{m.year}</p>
               <p>{m.distributor}</p>
            </div>
         ))}
      </div>
   )
}

export default Movie




/* Using keywords */
import React, { Component } from "react"

class Movie extends Component {
   constructor() {
      super()
      this.state = {
         data: [],
         loading: true
      }
   }

   async componentDidMount() {
        const movies  = await fetch("/data.json")
        const movieJSON = await movies.json()

        if (movieJSON) {
            this.setState({
               data: movieJSON,
               loading: false
            })
        }
    }

   render() {
      if (this.state.loading) {
         return <div>Loading...</div>
      }

      return (
         <div>
            {this.state.data.map(m => (
               <div key={m.id}>
                  <h3>{m.title}</h3>
                  <p>{m.year}</p>
                  <p>{m.distributor}</p>
               </div>
            ))}
         </div>
      )
   }
}

export default Movie