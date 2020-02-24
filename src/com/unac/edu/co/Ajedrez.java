package com.unac.edu.co;

public class Ajedrez {
    static final int N = 8;
    static final int s = (N+1);
    final int  x0=5;
    final int  y0=8;
    public final int j=1;
    public int contador=0;
    boolean visitado[]= new boolean[9];
    public void ponerPeon(int z){
        boolean exito=true;
        visitado[z]=true;
        for(int i=1; i<9; i++){
            if(Math.abs(x0-i) == Math.abs(y0-z)){
                exito=false;
                break;
            }
       }
        if(z<8 && !visitado[z+1]) {
            ponerPeon(z + 1);

        }
        if(z>1&& !visitado[z-1]){
            ponerPeon(z-1);
        }
        if(exito){
            contador++;

        }

    }
}