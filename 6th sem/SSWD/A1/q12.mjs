import util from "util"

const university = {
   name: "Global Tech University",
   location: {
      city: "New York",
      country: "USA",
      address: "123 Tech Street, NY 10001"
   },
   departments: [
      {
         name: "Electrical Engineering",
         head: {
            name: "Dr. Michael Green",
            experience: 18
         },
         courses: [
            {
               courseName: "Circuit Analysis",
               code: "EE101",
               professor: "Dr. Sarah Lee",
               studentsEnrolled: [
                  { id: 105, name: "Charlie Davis", age: 22, grades: { midterm: 87, final: 89 } }
               ]
            }
         ]
      }
   ],
   facilities: {
      library: {
         totalBooks: 50000,
         digitalAccess: true
      },
      labs: ["AI Lab", "Robotics Lab", "IoT Lab"],
      sportsComplex: {
         available: true,
         sports: ["Basketball", "Soccer", "Tennis"]
      }
   }
}

console.log(util.inspect(university))