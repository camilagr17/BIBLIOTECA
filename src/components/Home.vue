<template>

  <body id="home">
    
    <div class="containerslider">

      <div class="slider" id="slider">

        <div class="slider selection">
          <img src="../assets/metamorfosis.jpeg" alt="" class="slider-img">
        </div>

        <div class="slider selection">
          <img src="../assets/hobbit.jpg" alt="" class="slider-img">
        </div>

        <div class="slider selection">
          <img src="../assets/divinacomedia.jpg" alt="" class="slider-img">
        </div>

      </div>

      <div class="slider__btn slider__btn--rigth" id="rigth"> &#62 </div>
      <div class="slider__btn slider__btn--left" id="left"> &#60 </div>

    </div>
    <div >
      <ul id="lista">
        <li class="li">
          <img src="../assets/escritura.jpg" alt="" class="pequeño">
           Talleres de escritura
        </li>
        <li class="li">
          <img src="../assets/genteleye.jpg" alt="" class="pequeño">
           Talleres de lectura
        </li>
        <li class="li">
          <img src="../assets/Biblioteca.jpg" alt="" class="pequeño">
           Bibliotecas
        </li>
    </ul>
    </div>
  </body>
  
    
 
</template>


<script>

</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

body{
  margin: 0 0 0 0;
  display: flex;
  min-height: 10vh;
  
  background-color: #a0a0a0;
}

.containerslider{
  margin: 100px 250px 250px 50px;
  width: 90%;
  max-width: 900px;
  overflow: hidden;
  box-shadow: 0 0 0 10px #090700, 0 15px 50px;
  position: relative;
}

.slider{
  display: flex;
  width: 300%;
  height: 500px;
  
}

.slider-selection{
 width: 100%;
}

.slider-img{
  display: block;
  width: 100%;
  height: 100%;
}

.slider__btn {
  position: absolute;
  width: 40px;
  height: 40px;
  background-color:black;
  color: white;
  top: 50%;
  transform: translateY(50%);
  font-size: 30px;
  font-weight: bold;
  font-family: monospace;
  text-align: center;
  border-radius: 50%;
}

.slider__btn:hover{
  background-color: #a0a0a0;
}

.slider__btn--rigth{
  right: 10px;
}

.slider__btn--left{
  left: 10px;
}
.pequeño{
  width: 200px;
  height: 150px;
  box-shadow: 0 0 0 0px #090700, 0 15px 50px;
}
#lista{
  line-height: 450%;
  font-size: 40px;
  list-style: none;
}
.li{
  justify-content: space-around;
}

.footer{
  background-color: #a0a0a0;
}
</style>
