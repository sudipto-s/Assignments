import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import SearchResult from '../Q4/SearchResult'

export default function Q4() {
   return (
      <Router>
         <Routes>
            <Route path="/search" element={<SearchResult />} />
         </Routes>
      </Router>
   )
}
