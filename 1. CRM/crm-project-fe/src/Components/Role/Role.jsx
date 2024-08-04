import React, { useEffect, useState } from 'react'
import Button from 'react-bootstrap/Button'
import Table from 'react-bootstrap/Table'
import Form from 'react-bootstrap/Form'
import Modal from 'react-bootstrap/Modal';

export const Role = () => {
  const [show, setShow] = useState(false);
  const handleShow = () => setShow(true);
  const handleClose = () => setShow(false)

  // get api roles
  const [roles, setRoles] = useState([])
  useEffect(() => {
    fetch("http://localhost:8989/api/v1/role")
      .then(res => res.json())
      .then(data => setRoles(data))
      .catch(err => console.error("Error fetching products:", err))
  }, [])

  const [newRole, setNewRole] = useState({
    role_name: "",
    description: ""
  })
  const handleSubmit = (e) => {
    e.preventDefault();
    fetch("http://localhost:8989/api/v1/role", {
        method: "POST",
        headers: {
            'Content-Type': "application/json"
        },
        body: JSON.stringify(newRole)
    })
        .then(res => res.json())
        .then(data => {
          setNewRole([...roles, data]);
            handleClose();
        })
}
const handleChange = (e) => {
    const { name, value } = e.target;
    setNewRole(prevProduct => ({
        ...prevProduct,
        [name]: value
    }));
};

  return (
    <div className='role'>
      <div className='header p-3 w-100 bg-white d-flex justify-content-between align-items-center'>
        <h3 className='m-0'>Danh Sách Quyền</h3>
        <Button onClick={handleShow}>Thêm mới</Button>
      </div>

      <div className="table-content m-3 p-3 bg-white">
        <div className="func-table d-flex justify-content-between align-items-center py-3">
          <div className="select-group">
            Hiển thị
            <select name="" id="" className='mx-2'>
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
              <th>Tên Quyền</th>
              <th>Mô Tả</th>
            </tr>
          </thead>
          <tbody>
            {roles.map((roles, id) => {
              return <tr key={id}>
                <th>{roles.role_id}</th>
                <th>{roles.role_name}</th>
                <th>{roles.description}</th>
              </tr>
            })}

          </tbody>
        </Table>
      </div>
      {/* modal add employee */}
      <Modal size="lg" aria-labelledby="contained-modal-title-vcenter" centered show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Thêm mới quyền</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Tên Quyền</Form.Label>
              <Form.Control
                type='text'
                name='role_name'
                value={newRole.name}
                onChange={handleChange}
              />
            </Form.Group>

            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
              <Form.Label>Mô tả</Form.Label>
              <Form.Control
                type='text'
                name='description'
                value={newRole.description}
                onChange={handleChange}
              />
            </Form.Group>
          </Form>
        </Modal.Body>
        <Modal.Footer>
          <Button variant="secondary" onClick={handleClose}>
            Đóng
          </Button>
          <Button variant="primary" onClick={handleSubmit}>
            Lưu
          </Button>
        </Modal.Footer>
      </Modal>
    </div>
  )
}
