const express = require('express')
const app = express()
const port = 3000
const bodyParser = require('body-parser');
const {user} = require("./models/User");
//application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({extended: true}));
//application/json
app.use(bodyParser.json());

const mongoose = require('mongoose')

mongoose.connect('mongodb+srv://injae:kCvPefh2aDP17ZaZ@cluster0.nyzmmqy.mongodb.net/?retryWrites=true&w=majority').then(()=>console.log('MongoDB Connected...'))
.catch(err=>console.log(err))

app.get('/', (req, res) => res.send('Hello World!')) //get 라우터

app.post('/register', (req, res) => {
    const user = new User(req.body)
    
    user.save((err, userInfo) =>{
      if (err) return res.json({success:false, err})
      return res.status(200).json({
        success : true
      })
    })
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))