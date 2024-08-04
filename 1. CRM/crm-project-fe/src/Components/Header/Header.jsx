import React from 'react'
import "../Header/Header.css"
import { Dropdown } from 'react-bootstrap';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

export const Header = () => {
  return (
    <Row className="header m-0 w-100 d-flex justify-content-between align-items-center">
    <Col className="search ps-4" xs={9}>
      <input
        type="text"
        placeholder="Search..."
        className="form-control w-75"
      />
    </Col>
    <Col className="user d-flex justify-content-end align-items-center" xs={3}>
    <div className="d-flex align-items-center">
      <Dropdown>
        <Dropdown.Toggle
          variant="link"
          id="dropdown-basic"
          className="d-flex align-items-center "
        >
          <img
            src="https://minhducpc.vn/uploads/images/hinh-cute01.png"
            alt="User"
            className="header-img"
          />
          <h4 className="mx-4">Dinh Le</h4>
        </Dropdown.Toggle>

        <Dropdown.Menu>
          <Dropdown.Item href="profile.html">Thông tin cá nhân</Dropdown.Item>
          <Dropdown.Item href="#">Thống kê công việc</Dropdown.Item>
          <Dropdown.Divider />
          <Dropdown.Item href="#">Đăng xuất</Dropdown.Item>
        </Dropdown.Menu>
      </Dropdown>
    </div>
    </Col>
  </Row>
  )
}
