import http from "http"
import url from "url"

http.createServer((req, res) => {
   res.writeHead(200, { "content-type": "text/plain" })
   const qS = url.parse(req.url, true).query
   const n = qS.n
   
   if (n) {
      const rev = n.toString().split("").reverse().join("")
      res.end(`${n} is${n === rev ? "" : " not"} a palindrome`)
   } else
      res.end("Provide a number as a query parameter: ?n=45")
})
.listen(5000, () => console.log('http://localhost:5000'))