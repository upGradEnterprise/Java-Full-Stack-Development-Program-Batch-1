import axios from 'axios';

const axiosInstance = axios.create();
axiosInstance.defaults.baseURL = '/../';

export default axiosInstance;
