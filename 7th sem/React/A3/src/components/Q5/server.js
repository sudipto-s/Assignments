import express from "express"
import React from "react"
import ReactDOMServer from "react-dom/server"
import { StaticRouter } from "react-router-dom/server"
import { SearchResult } from "./SearchResult.jsx"

const app = express()

app.get("*", (req, res) => {
   const context = {}

   const appHtml = ReactDOMServer.renderToString(
      <StaticRouter location={req.url} context={context}>
         <SearchResult />
      </StaticRouter>
   )

   const html = `
      <!DOCTYPE html>
      <html>
         <head>
         <title>React Router with Express</title>
         </head>
         <body>
         <div id="root">${appHtml}</div>
         </body>
      </html>
   `

   res.send(html)
})

app.listen(5000, () => {
   console.log("Server running at http://localhost:5000")
})
