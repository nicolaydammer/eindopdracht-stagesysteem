import React from 'react';
import logo from './images/logo.png';
import Button from 'react-bootstrap/Button';
import './App.css';
import Login from './Auth/Login';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h2>
          StageSyteem
        </h2>
      </header>

      <body className="App-body"> 
     <h3>Login om je ideale stage of leerbaan te vinden!</h3>
     <br></br>
     <br></br>
     
     
        {/* <Button variant="primary" size="lg"><a href="./home.js" target="_blank">Login</a></Button>
        <p color="link" className="px-0">Forgot password?</p> */}
      <Login />
    </body>
    </div>
  
  );
}

export default App;

