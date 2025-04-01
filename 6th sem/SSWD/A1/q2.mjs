import http from "http"
import url from "url"

http.createServer((req, res) => {
   res.writeHead(200, { "content-type": "text/plain" })
   const qS = url.parse(req.url, true).query
   const str = qS.s
   
   if (str) {
      const rev = str.split("").reverse().join("")
      res.end(`${str} is${str === rev ? "" : " not"} a palindrome`)
   } else
      res.end("Provide a name as a query parameter: ?s=johri")
})
.listen(5000, () => console.log('http://localhost:5000'))