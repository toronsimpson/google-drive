
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UploadManager from "./components/listers/UploadCards"
import UploadDetail from "./components/listers/UploadDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"

import VideoManager from "./components/listers/VideoCards"
import VideoDetail from "./components/listers/VideoDetail"




export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/uploads',
                name: 'UploadManager',
                component: UploadManager
            },
            {
                path: '/uploads/:id',
                name: 'UploadDetail',
                component: UploadDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },

            {
                path: '/videos',
                name: 'VideoManager',
                component: VideoManager
            },
            {
                path: '/videos/:id',
                name: 'VideoDetail',
                component: VideoDetail
            },





    ]
})
