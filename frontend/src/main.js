import { createApp } from 'vue'
import App from './App.vue'
import axios from 'axios'
//import store from './store'
//import router from './router'
import 'bootstrap/dist/css/bootstrap.min.css'

const app = createApp(App)

// axiosを使用できるように定義
app.config.globalProperties.$axios = axios.create({
  baseURL: 'http://localhost:9000/'
})

//app.use(router)
//app.use(store)
app.mount('#app')