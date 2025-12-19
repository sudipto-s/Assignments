import withTimestamp from "./components/Q1/WithTimestamp"
import UserInfo from "./components/Q1/UserInfo"
import Q2 from "./components/Q2/Q2"
import Q3 from "./components/Q3/Q3"
import Q4 from "./components/Q4/Q4"
import Q5 from "./components/Q5/Q5"
import Q6 from "./components/Q6/Q6"
import Q7 from "./components/Q7/Q7"

const TUserInfo = withTimestamp(UserInfo)

function App() {
   return (
      <>
         {/* <TUserInfo username="sudipto" /> */}

         {/* <Q2 /> */}

         {/* <Q3 /> */}

         {/* <Q4 /> */}

         {/* <Q5 /> */}

         {/* <Q6 /> */}

         <Q7 />
      </>
   )
}

export default App
