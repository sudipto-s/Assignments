const express = require('express')
const app = express()

const isNeon = n => {
   let sq = n * n, s = 0
   
   while (sq > 0) {
      s += sq % 10
      sq = Math.floor(sq / 10)
   }
   
   return s == n
}

app.get("/", (req, res) => {
   const n = req.query.n

   if(n) {
      res.send(`${n} is${isNeon(n) ? '' : ' not'} neon`)
   } else
      res.send("Provide a number as a query parameter: ?n=5")
})

app.listen(5000, () => {
   console.log(`Server running at http://localhost:5000`)
})