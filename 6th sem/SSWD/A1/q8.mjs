import http from "http"
import url from "url"

http.createServer((req, res) => {
   res.writeHead(200, { "content-type": "text/plain" })
   const qS = url.parse(req.url, true).query
   const n = qS.n
   if (!isNaN(n)) {
      let sum = 0;
      const digits = n.toString().split("").map(Number);
      const power = digits.length;

      for (let digit of digits) {
         sum += Math.pow(digit, power);
      }

      res.end(`${n} is${n == sum ? "" : " not"} armstrong`)
   } else
      res.end("Provide a number as a query parameter: ?n=45")
})
.listen(8125, "127.0.0.2", () => console.log('http://127.0.0.2:8125'))