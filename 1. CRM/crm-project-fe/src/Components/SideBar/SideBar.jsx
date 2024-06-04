import React from 'react'
import '../SideBar/SideBar.css'
import Navbar from 'react-bootstrap/Navbar';
import Nav from 'react-bootstrap/Nav';
import Container from 'react-bootstrap/Container'
import { MdOutlineDashboard } from "react-icons/md";
import { FaRegUser } from "react-icons/fa";
import { PiPinwheelLight } from "react-icons/pi";
import { FaProjectDiagram } from "react-icons/fa";
import { FaTasks } from "react-icons/fa";
import { RiCheckboxMultipleBlankLine } from "react-icons/ri";
import { MdErrorOutline } from "react-icons/md";

export const SideBar = () => {
    return (
        <div className='sidebar'>
            <Navbar.Brand href="/"><img width={"90%"} height={"90px"} src="https://qph.cf2.quoracdn.net/main-qimg-e0bcb6a4c82f58cbe3e52b577303f8e2" alt="" /></Navbar.Brand>
            <Container className="p-3">
                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/">
                        <MdOutlineDashboard className='me-3'/>
                        <span>Trang Chủ</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/employee">
                        <FaRegUser className='me-3'/>
                        <span>Nhân Viên</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/role">
                        <PiPinwheelLight className='me-3'/>
                        <span>Quyền</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/project">
                        <FaProjectDiagram className='me-3'/>
                        <span>Dự Án</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/task">
                        <FaTasks className='me-3'/>
                        <span>Công Việc</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/blank">
                        <RiCheckboxMultipleBlankLine className='me-3'/>
                        <span>Blank Page</span>
                    </Nav.Link>
                </Nav>

                <Nav className="me-auto mb-3">
                    <Nav.Link className='form-control d-flex align-items-center text-dark' href="/error">
                        <MdErrorOutline className='me-3'/>
                        <span>Error Page</span>
                    </Nav.Link>
                </Nav>
            </Container>
        </div>
    )
}
