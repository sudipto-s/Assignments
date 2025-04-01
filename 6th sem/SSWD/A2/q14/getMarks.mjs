export const calcAvg = marks => {
   const totalSubjects = marks.length
   const totalMarks = marks.reduce((sum, mark) => sum + mark, 0)
   return totalMarks / totalSubjects
}
