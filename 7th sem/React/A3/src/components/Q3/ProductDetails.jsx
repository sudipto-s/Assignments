import React from 'react'
import { useParams } from "react-router-dom"

const products = [
   { id: 1, title: "Chocolate" },
   { id: 2, title: "Cherry" },
]

export default function ProductDetails() {
   const params = useParams()
   const found = products.filter(product => product.id == params.productId)

   return (
      <div>{found.length ? found[0].title : "Product not found"}</div>
   )
}
