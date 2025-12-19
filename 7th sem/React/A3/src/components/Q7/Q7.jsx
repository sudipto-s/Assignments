import React from 'react'
import { BrowserRouter as Router, Routes, Route } from "react-router-dom"
import EmployeeList from '../Q7/EmployeeList'

export default function Q7() {
   return (
      <Router>
         <Routes>
            <Route path="/employees" element={<EmployeeList />} />
         </Routes>
      </Router>
   )
}
