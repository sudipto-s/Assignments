import '@babel/polyfill'

import register from '@babel/register'
register({ presets: ['@babel/preset-env', '@babel/preset-react'], })

import './server.js'
