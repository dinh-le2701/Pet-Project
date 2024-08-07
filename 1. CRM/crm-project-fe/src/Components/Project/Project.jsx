import React, { useEffect, useState } from 'react'
import { Header } from '../Header/Header'
import Button from 'react-bootstrap/Button'
import Table from 'react-bootstrap/Table'
import Form from 'react-bootstrap/Form'
import Modal from 'react-bootstrap/Modal';
import AxiosInstance from '../../Config/AxiosInstance'

export const Project = () => {
  const [show, setShow] = useState(false);
  const handleShow = () => setShow(true);
  const handleClose = () => setShow(false)

  const [projects, setProjects] = useState([])
  useEffect(() => {
    AxiosInstance.get("/project")
    .then(res => setProjects(res.data))
      .catch(err => console.error("Error fetching products:", err))
  }, [])

  return (
    <div className='project'>
      <div className='header p-3 w-100 bg-white d-flex justify-content-between align-items-center'>
        <h3 className='m-0'>Danh Sách Dự Án</h3>
        <Button onClick={handleShow}>Thêm mới</Button>
      </div>

      <div className="table-content m-3 p-3 bg-white">
          <div className="func-table d-flex justify-content-between align-items-center py-3">
            <div className="select-group">
              Hiển thị
              <select name="" id=""  className='mx-2'> 
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
                <th>Tên Dự Án</th>
                <th>Ngày Bắt Đầu</th>
                <th>Ngày Kết Thúc</th>
                <th>Hành Động</th>
              </tr>
            </thead>
            <tbody>
              {projects.map((projects, id) => {
                return <tr>
                  <td>{projects.id}</td>
                  <td>{projects.project_name}</td>
                  <td>{projects.start_date}</td>
                  <td>{projects.end_date}</td>
                  <td>
                    <Button variant='warning'>Edit</Button>
                    <Button variant='danger'>Delete</Button>
                  </td>
                </tr>
              })}
            </tbody>
          </Table>
      </div>

      {/* modal add employee */}
      <Modal size="lg" aria-labelledby="contained-modal-title-vcenter" centered show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Thêm mới nhân viên</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Tên Dự Án</Form.Label>
              <Form.Control
                type="name"
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
