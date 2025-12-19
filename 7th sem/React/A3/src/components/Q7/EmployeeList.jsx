import React from 'react'
import { useLocation } from "react-router-dom"

const employees = [
   { id: 1, name: "John Tee", department: "HR" },
   { id: 3, name: "Timmy Bakes", department: "IT" },
   { id: 3, name: "Sarah Jonas", department: "FIN" },
   { id: 4, name: "Cory Jim", department: "IT" },
]

export default function SearchResult() {
   const location = useLocation()
   
   const queryParams = new URLSearchParams(location.search)
   
   const department = queryParams.get("department")
   const sort = queryParams.get("sort")

   const filtered = employees.filter(emloyee => emloyee.department === department)
   
   if (sort === "name")
      filtered.sort((a, b) => a.name.localeCompare(b.name))
   else
      filtered.sort((a, b) => b.name.localeCompare(a.name))

   return <div>
      {filtered.length ?
         <table border="1" cellPadding="10" style={{ borderCollapse: "collapse" }}>
            <thead>
               <tr>
                  <th>ID</th>
                  <th>Employee Name</th>
                  <th>Department</th>
               </tr>
            </thead>
            <tbody>
               {filtered.map((employee, i) => (
                  <tr key={i}>
                     <td>{employee.id}</td>
                     <td>{employee.name}</td>
                     <td>{employee.department}</td>
                  </tr>
               ))}
            </tbody>
         </table> :
         "No emloyee found"
      }
   </div>
}
