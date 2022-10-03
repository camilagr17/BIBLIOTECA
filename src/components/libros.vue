<template>
    <div class="elementos">
        <h1 id="titulo">Libros</h1>
            <div>
                <table class="lista">
                    
                    <tr>
                        <th>Titulo</th>
                        <th>Autor</th>
                        <th>Cantidad</th>
                    </tr>
                    <tr v-for="name in name" :key="name.id">
                        <td>{{name.name}}</td>
                        <td>{{name.email}}</td>
                        <td>{{name.username}}</td>
                    </tr>
                </table>    
            </div>
        
    </div>
</template>

<script>
import axios from 'axios';

export default {
    created() {
        axios.get('https://jsonplaceholder.typicode.com/users').then(response => this.name = response.data);
    },
    data(){
        return {
            mostrar: false,
            name: []
        }
    },
    methods: {
        changeRender() {
            this.render = this.render;
        }
    }
}

</script>

<style>
    .elementos{
        
        padding: 0;
        height: 100%;
        width: 100%;
        display: table;
        min-height: 10vh;
    }
    
    .lista{
        margin-left: auto;
        margin-right: auto;
        border-collapse: collapse;
        font-style: oblique;
    }
    #titulo{
        text-align: center;
        margin: 2%;
    }
    .lista td{
        border: 2px solid rgb(37, 121, 160);
        padding-left: 20px;
        padding-right: 20px;
        padding-top: 10px;
        padding-bottom: 10px;
    }
    .lista th{
        border: 2px solid rgb(37, 121, 160);
        padding-left: 20px;
        padding-right: 20px;
        padding-top: 10px;
        padding-bottom: 10px;
        color:white;
        background-color: rgb(37, 121, 160);
    }
</style>