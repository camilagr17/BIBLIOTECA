import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../components/Home'
import libros from '../components/libros'
import biblioteca from '../components/Bibliotecas'
import LogIn from '../components/LogIn'
import SignUp from '../components/signUp'

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/libros',
    name: 'libros',
    component: libros
  },
  {
    path: '/bibliotecas',
    name: 'biblioteca',
    component: biblioteca
  },
  {
    path: '/user/logIn',
    name: 'logIn',
    component: LogIn
  },
  {
    path: '/user/signUp',
    name: 'signUp',
    component: SignUp
  },
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router