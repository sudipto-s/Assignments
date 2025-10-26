import React, { useState, useEffect } from 'react'

export default function DigitalClock() {
   const [time, setTime] = useState({h:0,m:0,s:0,ac:"am"})

   useEffect(() => {
      let id = setInterval(() => {
         let t = new Date()
         let h = t.getHours(), m = t.getMinutes(), s = t.getSeconds(),
         ac = h >= 12 ? "pm" : "am"
         h = h % 12 || 12
         setTime({h,m,s,ac})
      }, 0)

      return () => clearInterval(id)
   }, [])

   return (
      <div>
         <h1>Digital Clock</h1>
         <span>{time.h}:{time.m}:{time.s} {time.ac}</span>
      </div>
   )
}
