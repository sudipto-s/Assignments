((a, b, c) => {
   let discriminant = b * b - 4 * a * c
   let realPart = -b / (2 * a)

   if (discriminant > 0) {
      let root1 = (-b + Math.sqrt(discriminant)) / (2 * a)
      let root2 = (-b - Math.sqrt(discriminant)) / (2 * a)
      console.log(`Real Roots: ${root1}, ${root2}`)
   } else if (discriminant === 0)
      console.log(`Repeated Real Root: ${realPart}`)
   else {
      let imaginaryPart = Math.sqrt(-discriminant) / (2 * a)
      console.log(`Imaginary Roots: ${realPart} ± ${imaginaryPart}i`)
   }
})(2, 6, 2)
