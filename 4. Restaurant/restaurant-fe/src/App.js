// import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { Navbar } from './common/admin/navbar/Navbar';
import Login from './pages/login/Login';
import Regis from './pages/regis/Regis';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path='' element={<Navbar/>}/>
          <Route path='/admin' element={<Navbar/>}/>

          <Route path='/login' element={<Login/>}/>
          <Route path='/regis' element={<Regis/>}/>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
