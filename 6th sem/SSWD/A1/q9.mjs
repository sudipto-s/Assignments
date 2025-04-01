import http from "http"
import url from "url"

function fact(n) {
   let fact = 1
   for (let i = 1; i <= n; i++)
       fact *= i
   return fact
}

function numFacts(n) {
   let c = 0
   for (let i = 1; i <= n; i++)
      if (n % i === 0)
         c++
   return c
}

http.createServer((req, res) => {
   res.writeHead(200, { "content-type": "text/plain" })
   const qS = url.parse(req.url, true).query
   const n = qS.n
   
   if (!isNaN(n)) {
      const fct = fact(n)
      const factors = numFacts(n)
      
      res.end(`Factorial: ${fct}\nNumber of factors: ${factors}`)
   } else
      res.end("Provide a number as a query parameter: ?n=45")
})
.listen(8125, "127.0.0.2", () => console.log('http://127.0.0.2:8125'))