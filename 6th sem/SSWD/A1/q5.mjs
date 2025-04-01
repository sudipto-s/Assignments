import fs from "fs"

fs.readFile("./t.txt", "utf-8", (e, d) => {
   if(e)
      throw new Error("404 - File not found!")
   console.log(d)
})
