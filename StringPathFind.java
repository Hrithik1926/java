public class StringPathFind {
    public static float shortestPath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char direction=path.charAt(i);
            //South
            if (direction=='E'){
                x++;
            } else if (direction=='W') {
                x--;
            } else if (direction=='N') {
                y++;
            }else {
                y--;
            }

        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
//        String path="WNEENESENNN"; Anser is :  5
        String path="WENS";
        System.out.println(shortestPath(path));
    }
}
