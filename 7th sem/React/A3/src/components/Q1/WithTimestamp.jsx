import React from 'react'

export default function withTimestamp(WrapperComponent) {
   return function(props) {
      return <>
         <WrapperComponent {...props} timestamp={new Date().toLocaleString()} />
      </>
   }
}
