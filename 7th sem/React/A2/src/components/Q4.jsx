import React, { useEffect } from 'react'

export default function StudentDemo() {
   useEffect(() => {
      console.log("Component Mounted!")
   }, [])

   return (
      <div>
         Student Demo - Check console
      </div>
   )
}
