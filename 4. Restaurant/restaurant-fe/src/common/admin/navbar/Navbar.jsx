import React from 'react'
import { Row, Col, Container } from 'react-bootstrap';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';

export const Navbar = () => {
    return (
        <div>
            <div className=''>
                <Container>
                    <Col className='container' xs={9}>
                        <div className="logo container">Restaurant</div>
                    </Col>
                    <Col className='bg-primary'>
                        <div className="info">
                            <Link to="">Home</Link>
                            <Link to="/login">Login</Link>
                        </div>
                    </Col>
                </Container>
            </div>
            <Row>
                <Col className="side-nav text-center">
                    <Col><Link className='py-3 fw-bold nav-link' to={""}>Home</Link></Col>
                    <Col><Link className='py-3 fw-bold nav-link' to={"/account"}>Admin</Link></Col>
                    <Col><Link className='py-3 fw-bold nav-link' to={"/food"}>Food</Link></Col>
                    <Col><Link className='py-3 fw-bold nav-link' to={"/order"}>Order</Link></Col>
                    <Col><Link className='py-3 fw-bold nav-link' to={"/booking"}>Booking</Link></Col>
                </Col>
                <Col className="content bg-secondary" xs={10}>
                    hello
                </Col>

            </Row >
        </div >
    )
}
