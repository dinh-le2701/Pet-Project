import React from 'react'
import { Container, Form } from 'react-bootstrap';

const Login = () => {
  return (
    <div className='login my-5'>
        <Container className='p-4 w-25'>
            <h1 className='text-center mb-4'>Login</h1>
            <Form action='http://localhost:6688/login' method='post'>
                <Form.Group className='mb-3'>
                    <Form.Control placeholder='Email'/>
                </Form.Group>

                <Form.Group className='mb-3'>
                    <Form.Control placeholder='Password' type='Password'/>
                </Form.Group>

                <Form.Group>
                    <Form.Control type='submit' value={"Login"} className='bg-primary text-light'/>
                </Form.Group>
            </Form>
        </Container>
    </div>
  )
}

export default Login