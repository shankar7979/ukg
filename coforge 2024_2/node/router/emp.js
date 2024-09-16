var express=require('express');

var emp=require('../data/employee.json');
var router=express.Router();
router.get("/emp", (req,res)=>{
 
    emp.employees.forEach(emp => {
        res.write(`<div>${emp.id} ${emp.name} ${emp.salary}</div>`);        
    });
});

module.exports = router;