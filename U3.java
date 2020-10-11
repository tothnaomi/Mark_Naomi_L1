package com.company;

public class U3 {
    static int[] sum(int[] a, int[] b) {
        int[] c;
        int rest = 0,n=a.length;
        c = new int[n + 1];
        for (int i = 0; i < n; ++i)
        {
            c[n - i] = (a[n - i-1] + b[n - i-1]+ rest) % 10 ;
            rest = (a[n - i-1] + b[n - i-1]+ rest) / 10;
        }
        c[0]=rest;
        return c;
    }

    static int[] diff(int[] a, int[] b) { //a>b
        int n=a.length;
        int[] c = new int[n];
        for (int i=0;i<n;++i){
            if(a[n-i-1]-b[n-i-1]<0)
            {
                a[n-i-2]--;
                a[n-i-1]+=10;
            }
            c[n-i-1]=a[n-i-1]-b[n-i-1];
        }
        if(c[0]==0){
            int[] d=new int[n-1];
            for(int i=1;i<n;++i)
                d[i-1]=c[i];
            return d;
        }
        return c;
    }

    static int[] mul(int[] a,int b){
        int n=a.length;
        int[] rezultat=new int[n+1];
        //multiplicam a cu b
        int r=0;
        for (int i=n-1;i>=0;--i) {
            rezultat[i+1] = (a[i] * b) % 10 + r;
            r = (a[i] * b) / 10;//overflow
            a[i]=rezultat[i+1];
        }
        if(r==0)
            return a;
        rezultat[0]+=r;
        return rezultat;
    }

    static int[] div(int[] a,int b){
        int[] rezultat;
        int n=a.length;
        rezultat=new int[n];
        //impartim a cu b
        int r=0;
        for (int i=0;i<n;++i) {
            rezultat[i]=(a[i]+r*10)/b;
            r=(a[i]+r*10)%b;
        }
        if(rezultat[0]==0){
            int[] d=new int[n-1];
            for (int i=1;i<n;++i)
                d[i-1]=rezultat[i];
            return d;
        }
        return rezultat;
    }
    
}
