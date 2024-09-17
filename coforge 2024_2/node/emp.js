var emp = require('./data/emp.js');

var express = require('express');
var app = express();
app.use(express.json());

app.get("/", (req, resp) => {
    resp.write('hello');
    resp.end();
});
// get method
app.get("/employee", (req, resp) => {
    console.log('get method called')
    resp.json(emp)
});

// search using get 
app.get("/employee/:eid", (req, resp) => {
    if (!req.params.eid || isNaN(req.params.eid)) {
        return resp.status(404).send('invalid id')
    }
    var e = emp.find((a) => {
        return a.eid === parseInt(req.params.eid)
    })
    if (!e) {
        resp.status(404).send('employee not found with id ' + req.params.eid)
    }
    else
        return resp.status(201).send(e)
})

app.listen(3000)    