import React from "react"
import { BrowserRouter as Router, Routes, Route, useParams } from "react-router-dom"

export const Home = () => <h1>Welcome to Home Page</h1>
export const About = () => <h1>About Us</h1>

export const UserProfile = () => {
   const { id } = useParams()
   return <h1>User Profile: {id}</h1>
}

export function SearchResult() {
   return (
      <Router>
         <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/about" element={<About />} />
            <Route path="/user/:id" element={<UserProfile />} />
         </Routes>
      </Router>
   )
}
