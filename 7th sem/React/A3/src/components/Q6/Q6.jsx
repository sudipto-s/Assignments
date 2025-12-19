import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import CategoryProducts from '../Q6/CategoryProducts'

export default function Q6() {
   return (
      <Router>
         <Routes>
            <Route path="/category/:categoryName" element={<CategoryProducts />} />
         </Routes>
      </Router>
   )
}
