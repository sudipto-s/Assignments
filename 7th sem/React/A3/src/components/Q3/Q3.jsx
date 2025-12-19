import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import ProductDetails from './ProductDetails'

export default function Q3() {
   return (
      <Router>
         <Routes>
            <Route path="/product/:productId/:name" element={<ProductDetails />} />
         </Routes>
      </Router>
   )
}
