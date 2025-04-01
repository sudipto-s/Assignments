import http from "http"
import url from "url"

http.createServer((req, res) => {
   res.writeHead(200, { "content-type": "text/plain" })
   const qS = url.parse(req.url, true).query
   const r = qS.r

   if (r) {
      res.end(`Volume of sphere with radius ${r} is: ${(4/3)*Math.PI*r**3}`)
   } else
      res.end("Provide radius as a query parameter: ?r=2.5")
})
.listen(5000, () => console.log('http://localhost:5000'))