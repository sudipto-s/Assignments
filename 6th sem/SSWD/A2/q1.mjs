import fs from "fs"

fs.readdir(".", (e, files) => {
   if(e)
      console.log(e)
   else
      for(let f of files)
         console.log(f)
})
