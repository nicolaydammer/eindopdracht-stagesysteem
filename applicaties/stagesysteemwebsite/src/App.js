import React from 'react';
import logo from './images/logo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          StageSyteem
        </p>
      </header>

      <body className="App-body"> 
     <h3>Login om je ideale stage of leerbaan te vinden!</h3>
     <br></br>
     <br></br>
     
     <form>
        <label>
         Email
         <br></br>
         <input type="text" name="name" />
        </label>
        <br></br>
        <br></br>
        <label>
         Password 
         <br></br>
         <input type="text" name="name" />
        </label>
        <br></br>
        <br></br>
        <input className="submit" type="submit" value="Login"/>
      </form>
    </body>
    </div>
  
  );
}

export default App;

