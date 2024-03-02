package Recursion;

import java.util.ArrayList;

public class MazePathWithJump {

    public static ArrayList<String> getJumpPath(int sr, int sc, int dr, int dc) {

        if (sc == dc && sr == dr) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        for (int h = 1; h <= dc - sc; h++) {

                hpaths = getJumpPath(sr, sc + h, dr, dc);
                for (String hpath : hpaths) {
                    paths.add("h" +h+ hpath);
                }

        }
        for (int v = 1; v <= dr - sr; v++) {

                vpaths = getJumpPath(sr + v, sc, dr, dc);
                for (String vpath : vpaths) {
                    paths.add("v" +v+ vpath);
                }

        }






        return paths;

    }

    public static void main(String[] args) {

        ArrayList<String> res = new ArrayList<>();

        res = getJumpPath(1, 1, 3, 3);
        System.out.println(res);


    }

}
