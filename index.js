var app = require('express')();
var express = require('express');
var sys = require('sys');

    http = require('http');
    fs = require('fs');
    mainpage=0;
    linux=0;
    mozilla=0;
    contact=0;
    wordpress=0;
    apache=0;


fs.readFile('./mainpage.html',function(err,data){
	if(err){
		throw err;
	}
	mainpage=data;
});
fs.readFile('./linux.html',function(err,data){
	if(err){
		throw err;
	}
	linux=data;
});
fs.readFile('./mozilla.html',function(err,data){
	if(err){
		throw err;
	}
	mozilla=data;
});
fs.readFile('./contact.html',function(err,data){
	if(err){
		throw err;
	}
	contact=data;
});
fs.readFile('./wordpress.html',function(err,data){
	if(err){
		throw err;
	}
	wordpress=data;
});
fs.readFile('./apache.html',function(err,data){
	if(err){
		throw err;
	}
	apache=data;
});
app.get('/',function(req,res){
	res.writeHeader(200,{"Content-Type":"mainpage.html"});
	res.write(mainpage);
	res.end();
});
app.get('/linux',function(req,res){
res.writeHeader(200,{"Content-Type":"linux.html"});
	res.write(linux);
	res.end();
});
app.get('/mozilla',function(req,res){
res.writeHeader(200,{"Content-Type":"mozilla.html"});
	res.write(mozilla);
	res.end();
})
app.get('/wordpress',function(req,res){
	res.writeHeader(200,{"Content-Type":"wordpress.html"});
	res.write(wordpress);
	res.end();
});
app.get('/apache',function(req,res){
	res.writeHeader(200,{"Content-Type":"apache.html"});
	res.write(apache);
	res.end();
});
app.get('/contact',function(req,res){
	res.writeHeader(200,{"Content-Type":"contact.html"});
	res.write(contact);
	res.end();
}).listen(8000);