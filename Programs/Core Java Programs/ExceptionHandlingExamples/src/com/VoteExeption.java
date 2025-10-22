package com;

public class VoteExeption extends  Exception{
    VoteExeption(){
        super();
    }
    VoteExeption(String msg){
        super(msg);  // calling super class ie exception parameterized constructor to set the message
    }
}
