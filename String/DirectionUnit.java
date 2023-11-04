package String;

public class DirectionUnit {
    public static float getShortetPath(String path){
        int x=0,y=0;

            for(int i=0; i<path.length(); i++){
                char dir = path.charAt(i);
                if(dir == 'N') y++;
                else if (dir == 'E') x++;
                else if (dir == 'S') y--;
                else x-- ;
            }

            return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNNS";
        System.out.println(getShortetPath(path));
    }
}