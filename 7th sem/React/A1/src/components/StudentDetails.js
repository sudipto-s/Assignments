import React from "react"
import PropTypes from "prop-types"

function StudentDetails({ name, roll, course }) {
   return (
      <div>
         <h3>Name: {name}</h3>
         <p>Roll: {roll}</p>
         <p>Course: {course}</p>
      </div>
   )
}

StudentDetails.propTypes = {
   name: PropTypes.string.isRequired,
   roll: PropTypes.number.isRequired,
   course: PropTypes.string.isRequired
}

export default StudentDetails