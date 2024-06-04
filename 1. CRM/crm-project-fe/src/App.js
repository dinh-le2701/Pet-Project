import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Row from 'react-bootstrap/Row'
import Col from 'react-bootstrap/Col'
import { SideBar } from './Components/SideBar/SideBar';
import { Dashboard } from './Components/Dashboard/Dashboard';
import { Employee } from './Components/Employee/Employee'
import { Role } from './Components/Role/Role'
import { Project } from './Components/Project/Project'
import { Task } from './Components/Tasks/Task'
import { Blank } from './Components/Pages/BlankPage/Blank'
import { Error } from './Components/Pages/Error/Error'
import { Login } from './Components/Pages/Login/Login'

import { BrowserRouter, Routes, Route } from 'react-router-dom'
function App() {
  return (
    <div className="App">
      <Row className='w-100'>
        <Col xs lg="2" className='p-0'>
          <SideBar />
        </Col>
        <Col className='p-0'>
          <BrowserRouter>
            <Routes>
              <Route path='/login' element={<Login/>}/>
              <Route path='/' element={<Dashboard/>}/>
              <Route path='/employee' element={<Employee/>}/>
              <Route path='/role' element={<Role/>}/>
              <Route path='/project' element={<Project/>}/>
              <Route path='/task' element={<Task/>}/>
              <Route path='/blank' element={<Blank/>}/>
              <Route path='/error' element={<Error/>}/>
            </Routes>
          </BrowserRouter>
        </Col>
      </Row>
    </div>
  );
}

export default App;
