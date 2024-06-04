import React, { useState } from 'react'
import { Header } from '../Header/Header'
import Button from 'react-bootstrap/Button'
import Table from 'react-bootstrap/Table'
import Form from 'react-bootstrap/Form'
import Modal from 'react-bootstrap/Modal';
import Container from 'react-bootstrap/esm/Container'

export const Task = () => {
  const [show, setShow] = useState(false);
  const handleShow = () => setShow(true);
  const handleClose = () => setShow(false)

  return (
    <div className='task'>
      <div className='header p-3 w-100 bg-white d-flex justify-content-between align-items-center'>
        <h3 className='m-0'>Danh Sách Công Việc</h3>
        <Button onClick={handleShow}>Thêm mới</Button>
      </div>

      <div className="table-content m-3 bg-white p-3">
        <Container>
          <div className="func-table d-flex justify-content-between align-items-center py-3">
            <div className="select-group">
              Hiển thị
              <select name="" id="">
                <option value="">10</option>
                <option value="">20</option>
                <option value="">30</option>
                <option value="">50</option>
              </select>
              mục
            </div>

          </div>
          <Table hover striped bordered className='w-100'>
            <thead>
              <tr>
                <th>STT</th>
                <th>Tên Công Việc</th>
                <th>Tên Dự Án</th>
                <th>Người Thực Hiện</th>
                <th>Ngày Bắt Đầu</th>
                <th>Ngày Kết Thúc</th>
                <th>Trạng Thái</th>
                <th>Hành Động</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
              </tr>
            </tbody>
          </Table>
        </Container>
      </div>

      {/* modal add employee */}
      <Modal size="lg" aria-labelledby="contained-modal-title-vcenter" centered show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Thêm mới công việc</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Tên Dự Án</Form.Label>
              <Form.Select aria-label="Default select example">
                <option>Chọn Dự Án</option>
                <option value="1">Đã hoàn thành</option>
                <option value="2">Đang thực hiện</option>
                <option value="3">Chưa thực hiện</option>
              </Form.Select>
            </Form.Group>
            
            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Tên Công Việc</Form.Label>
              <Form.Control
                type="text"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Người Thực Hiện</Form.Label>
              <Form.Control
                type="text"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Ngày Bắt Đầu</Form.Label>
              <Form.Control
                type="date"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Ngày Kết Thúc</Form.Label>
              <Form.Control
                type="date"
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Trạng Thái</Form.Label>
              <Form.Select aria-label="Default select example">
                <option>Chọn Trạng Thái</option>
                <option value="1">Đã hoàn thành</option>
                <option value="2">Đang thực hiện</option>
                <option value="3">Chưa bắt đầu</option>
              </Form.Select>
            </Form.Group>
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Đóng
          </Button>
          <Button variant="primary" onClick={handleClose}>
            Lưu
          </Button>
        </Modal.Footer>
      </Modal>
    </div>
  )
}
