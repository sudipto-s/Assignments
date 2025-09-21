import React, { Component } from "react"

class Movie extends Component {
   constructor() {
      super()
      this.state = {
         data: [],
         clicked: false
      }
   }

   async componentDidMount() {
        const movies  = await fetch("/data.json")
        const movieJSON = await movies.json()

        if (movieJSON) {
            this.setState({
               ...this.state,
               data: movieJSON
            })
        }
    }

   handleClick = () => {
      this.setState({
         ...this.state,
         clicked: true
      })
   }

   render() {
      if (!this.state.clicked) {
         return <button onClick={this.handleClick}>Load movies</button>
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