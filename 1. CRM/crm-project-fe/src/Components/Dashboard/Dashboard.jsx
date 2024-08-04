import React from 'react'
import { Container, Col, Row, Card, ProgressBar } from 'react-bootstrap';

export const Dashboard = () => {
  return (
    <div className='dashboard'>
      <div className='header p-3 w-100 bg-white d-flex justify-content-between align-items-center'>
        <h3 className='m-0'>Trang Chủ</h3>
      </div>

      <div className='p-3'>
        <Row>
          <Col lg={4} md={4} sm={12} xs={12}>
            <Card className="white-box">
              <Card.Body>
                <Row>
                  <Col md={6} sm={6} xs={6}>
                    <i data-icon="E" className="linea-icon linea-basic"></i>
                    <h5 className="text-muted vb">CHƯA BẮT ĐẦU</h5>
                  </Col>
                  <Col md={6} sm={6} xs={6}>
                    <h3 className="counter text-right mt-3 text-danger">23</h3>
                  </Col>
                  <Col md={12} sm={12} xs={12}>
                    <ProgressBar now={29}
                      variant="secondary"
                      className="progress-bar-danger"
                    />
                  </Col>
                </Row>
              </Card.Body>
            </Card>
          </Col>

          <Col lg={4} md={4} sm={12} xs={12}>
            <Card className="white-box">
              <Card.Body>
                <Row>
                  <Col md={6} sm={6} xs={6}>
                    <i data-icon="E" className="linea-icon linea-basic"></i>
                    <h5 className="text-muted vb">ĐANG THỰC HIỆN</h5>
                  </Col>
                  <Col md={6} sm={6} xs={6}>
                    <h3 className="counter text-right mt-3 text-danger">23</h3>
                  </Col>
                  <Col md={12} sm={12} xs={12}>
                    <ProgressBar now={40}
                      variant="warning"
                      className="progress-bar-danger"
                    />
                  </Col>
                </Row>
              </Card.Body>
            </Card>
          </Col>

          <Col lg={4} md={4} sm={12} xs={12}>
            <Card className="white-box">
              <Card.Body>
                <Row>
                  <Col md={6} sm={6} xs={6}>
                    <i data-icon="E" className="linea-icon linea-basic"></i>
                    <h5 className="text-muted vb">ĐÃ HOÀN THÀNH</h5>
                  </Col>
                  <Col md={6} sm={6} xs={6}>
                    <h3 className="counter text-right mt-3 text-danger">23</h3>
                  </Col>
                  <Col md={12} sm={12} xs={12}>
                    <ProgressBar now={40}
                      variant="success"
                      className="progress-bar-danger"
                    />
                  </Col>
                </Row>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </div>


    </div>
  )
}
