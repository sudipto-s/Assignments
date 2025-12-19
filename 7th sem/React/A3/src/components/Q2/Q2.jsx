import React from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom"
import { Home, Contact, Prodcuts } from "./Components"

export default function Q2() {
   return (
      <Router>
         <nav>
            <Link to="home">Home</Link>
            <Link to="contact">Contact</Link>
            <Link to="products">Products</Link>
         </nav>

         <Routes>
            <Route path="/home" element={<Home />} />
            <Route path="/contact" element={<Contact />} />
            <Route path="/products" element={<Prodcuts />} />
         </Routes>
      </Router>
   )
}
