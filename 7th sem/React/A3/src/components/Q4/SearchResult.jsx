import React from 'react'
import { useLocation } from "react-router-dom"

const products = [
   { id: 1, name: "iPhone 15", category: "mobile", price: 1200 },
   { id: 2, name: "Samsung Galaxy S23", category: "mobile", price: 1000 },
   { id: 3, name: "MacBook Pro", category: "laptop", price: 2500 }
]

export default function SearchResult() {
   const location = useLocation()
   
   const queryParams = new URLSearchParams(location.search)
   
   const category = queryParams.get("category")
   const sort = queryParams.get("sort")

   const filtered = products.filter(product => product.category === category)
   
   if (sort === "asc")
      filtered.sort((a, b) => a.price - b.price)
   else
      filtered.sort((a, b) => b.price - a.price)

   return <div>
      {filtered.length ?
         <table border="1" cellPadding="10" style={{ borderCollapse: "collapse" }}>
            <thead>
               <tr>
                  <th>ID</th>
                  <th>Product Name</th>
                  <th>Category</th>
                  <th>Price</th>
               </tr>
            </thead>
            <tbody>
               {filtered.map((product, i) => (
                  <tr key={i}>
                     <td>{product.id}</td>
                     <td>{product.name}</td>
                     <td>{product.category}</td>
                     <td>{product.price}</td>
                  </tr>
               ))}
            </tbody>
         </table> :
         "No product found"
      }
   </div>
}
