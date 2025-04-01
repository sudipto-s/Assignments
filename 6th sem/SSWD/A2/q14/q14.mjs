import { calcAvg } from './getMarks.mjs'

const students = [
   { name: 'Alice', marks: [85, 90, 78, 92, 88, 76] },
   { name: 'Bob', marks: [80, 85, 79, 89, 84, 82] },
   { name: 'Charlie', marks: [75, 80, 70, 85, 79, 90] }
]

students.forEach(s => {
   const avg = calcAvg(s.marks)
   console.log(`${s.name}'s avg marks: ${avg}`)
})
