import axios from 'axios';

const AxiosInstance = axios.create({
  baseURL: 'http://localhost:8989/api/v1',
});

export default AxiosInstance;