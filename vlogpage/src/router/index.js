import Vue from 'vue'
import Router from 'vue-router'
// eslint-disable-next-line no-unused-vars
import Login from '../views/Login'
// eslint-disable-next-line no-unused-vars
import Main from '../views/Main'

Vue.use(Router)

export default new Router({
  routes: [
    {
      // 登录页
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      // 首页
      path: '/main',
      name: 'Main',
      component: Main
    }
  ]
})
