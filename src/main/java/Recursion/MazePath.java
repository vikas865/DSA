package Recursion;

import java.util.ArrayList;

public class MazePath
{

    public static ArrayList<String> getMazePath(int sr, int sc, int r, int c ){

        if(sr==r && sc==c) {

            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> hpaths= new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc<c){
            hpaths =getMazePath(sr,sc+1,r,c);
        }

        if (sr<r) {
            vpaths= getMazePath(sr+1,sc,r,c);
        }

        ArrayList<String> paths = new ArrayList<>();
        for(String hpath:hpaths)
        {
            paths.add("h"+hpath);
        }

        for(String vpath:vpaths)
        {
            paths.add("v"+vpath);
        }

        return paths;
    }

    public static void main(String[] args) {

       ArrayList<String> res= getMazePath(1,1,3,3);
        System.out.println(res);
    }
}
