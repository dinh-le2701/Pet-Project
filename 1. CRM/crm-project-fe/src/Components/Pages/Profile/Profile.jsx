import React from 'react'
import { Form, Table, Image } from 'react-bootstrap';

export const Profile = () => {
    return (
        <div className='profile'>
            <div className='header p-3 w-100 bg-white d-flex justify-content-between align-items-center'>
                <h3 className='m-0'>Thông Tin Cá Nhân</h3>
            </div>

            <div className="p-3 d-flex justify-content-between align-items-center">
                <Image width={"300"} height={"300"} src='https://minhducpc.vn/uploads/images/hinh-cute01.png' roundedCircle/>
                <Form>

                </Form>
            </div>
        </div>
    )
}
