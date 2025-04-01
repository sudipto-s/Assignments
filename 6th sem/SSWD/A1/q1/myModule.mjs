import {fName, mName, lName, dob} from "./q1.mjs"

console.log(`${fName} ${mName} ${lName}`)

const [day, month, year] = dob.split("-").map(num => +num)
const birthDate = new Date(year, month - 1, day)

const today = new Date()
let age = today.getFullYear() - birthDate.getFullYear()

if (today.getMonth() < birthDate.getMonth() || 
   (today.getMonth() === birthDate.getMonth() && today.getDate() < birthDate.getDate())) {
   age--
}

console.log("Current age:", age)
console.log("Age after 24 years:", age+24)