import fs from "fs"

fs.readdir(".", (e, files) => {
   console.log(e || `Total number of files: ${files.length}`)
})
