<template>

  <div id="app" class="app">

    <div class="header">
      <h1>Biblioteca</h1>

      <button><router-link to="/" id="home">Inicio</router-link></button>
      <button><router-link to="/libros" id="libros">Libros</router-link> </button>
      <button><router-link to="" id="bib">Bibliotecas</router-link></button>

      <button v-if="is_auth" > Inicio </button>
      <button v-if="is_auth" > Cuenta </button>
      <button v-if="is_auth" > Cerrar Sesión </button>
      <button v-if="!is_auth" v-on:click="loadLogIn" > Iniciar Sesión </button>
      <button v-if="!is_auth" v-on:click="loadSignUp" > Registrarse </button>

    </div>
    <div class="main-component">
      <router-view
      v-on:completedLogIn="completedLogIn"
      v-on:completedSignUp="completedSignUp"
      >
      </router-view>
    </div>
    
    <div class="footer">
      <h2>Biblioteca</h2>
      <p>
        Direccion: <br>
        Telefono: <br>
        Correo: <br>
      </p>
    </div>
  </div>
  
</template>
<script>
export default {
  name: 'App',
  
  data: function(){
    return{
      is_auth: false
    }
  },

  components: {
  },

  methods:{
    verifyAuth: function() {
      if(this.is_auth == false)
        this.$router.push({name: "home"})
    },

    loadLogIn: function(){
      this.$router.push({name: "logIn"})
    },

    loadSignUp: function(){
      this.$router.push({name: "signUp"})
    },

    completedLogIn: function(data) {},

    completedSignUp: function(data) {},

    },

    created: function(){
      this.verifyAuth()
    }
}
</script>

<style>
body{
  
  margin: 0 0 0 0;
  font-family: 'Times New Roman';
}
.header{
  margin: 0px;
  padding: 0;
  width: 100%;
  height: 10vh;
  min-height: 100px;
  border-style: double;
  justify-content: space-around;
  
  background-color: #a0a0a0;
  display: flex;
  align-items: center;
}

.header button{
  font-size: 150%;
  background-color: #a0a0a0;
  border: 2px solid #a0a0a0;
}
.header button:hover{
  background-color: #4e76a0;
  color: black;
}

#home{
  text-decoration: none;
  color: black;
}
#libros{
  text-decoration: none;
  color: black;
}
#bib{
  text-decoration: none;
  color: black;
}


.main-component{
  background-color: #a0a0a0;
  min-height: 75vh;
  margin: 0%;
  padding: 0%;
}
.footer{

  margin: 0%;
  padding: 0;
  width: 100%;
  height: 10vh;
  min-height: 100px;
  border-style: double;

  background-color: #a0a0a0;
  color: black;
  display: list-item;
}
.footer h2{
  margin: 0%;
  
}

</style>