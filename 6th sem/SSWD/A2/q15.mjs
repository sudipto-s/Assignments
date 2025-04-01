import http from 'http'
import util from 'util'
import os from 'os'

const server = http.createServer()

const listenOn = 'http://localhost:8124'

server.on('request', (req, res) => {
   var requrl = new URL(req.url, listenOn)
   if (requrl.pathname === '/') osInfo(req, res)
   else {
      res.writeHead(404, {'Content-Type': 'text/plain'})
      res.end("bad URL "+ req.url)
   }
})

server.listen(5000, () => console.log('http://localhost:5000'))

function osInfo(req, res) {
   res.writeHead(200, {'Content-Type': 'text/html'})
   res.end(
      `<html><head><title>Operating System Info</title></head>
      <body><h1>Operating System Info</h1>
      <table>
      <tr><th>TMP Dir</th><td>${os.tmpdir()}</td></tr>
      <tr><th>Host Name</th><td>${os.hostname()}</td></tr>
      <tr><th>OS Type</th><td>${os.type()} ${os.platform()}
            ${os.arch()} ${os.release()}</td></tr>
      <tr><th>Uptime</th><td>${os.uptime()}
      ${util.inspect(os.loadavg())}</td></tr>
      <tr><th>Memory</th><td>total: ${os.totalmem()} free:
      ${os.freemem()}</td></tr>
      <tr><th>Network</th><td><pre>${util.inspect(os.networkInterfaces())}</
      pre></td></tr>
      </table>
      </body></html>`)
}
