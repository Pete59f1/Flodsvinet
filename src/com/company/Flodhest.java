package com.company;

public class Flodhest {
    private String lugt;
    private Integer antalTænder;
    private Integer vægt;

    public Flodhest(String lugt, Integer antalTænder, Integer vægt){
        this.lugt = lugt;
        this.antalTænder = antalTænder;
        this.vægt = vægt;
    }

    public int FåVægt(String lugt){
        Integer vægt = 0;
        if (lugt.equals("Lort")){
            vægt = 600;
        }
        else if (lugt.equals("Pis")){
            vægt = 300;
        }
        else{
            vægt = 1000;
        }
        return vægt;
    }

}
