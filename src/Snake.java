    /**
     * @author Joaki
     */
    import java.io.*;
    import java.util.Scanner;

    public class Snake {
    private Blocks[][] map;
    private Scanner scanner;

    /**
     * Constructor to read testfile, create map and adds blocks on invalid tiles
     */

    public Snake() throws IOException{
        scanner = new Scanner(new FileReader("C:/Users/Joaki/Desktop/snaketest.txt"));
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        map = new Blocks[a][b];

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map.length; j++){
                map[i][j] = new Blocks();
            }
        }
        while (scanner.hasNext()) {
            String rad = scanner.nextLine();
            String[] blocks = rad.split(",");
            map[Integer.parseInt(blocks[0])][Integer.parseInt(blocks[1])].setBooleanInFlag(false);
        }
        map[0][0].setBooleanIn();
        move(0,0);
    }
    /**
     * Traverse the map through recursion in the following order: down, right, up, left then prints the path.
     */
    	
    public void move(int q,int w){
        System.out.println(q+","+w);

        if(w+1< map.length && map[q][w+1].getVisitable()==true && map[q][w+1].getBooleanIn()==false){
            map[q][w+1].setBooleanIn();
            move(q,w+1);
        }
        else if(q+1< map.length && map[q+1][w].getVisitable()==true && map[q+1][w].getBooleanIn()==false){
            map[q+1][w].setBooleanIn();
            move(q+1,w);
        }
        else if(w-1>=0 && map[q][w-1].getVisitable()==true && map[q][w-1].getBooleanIn()==false){
            map[q][w-1].setBooleanIn();
            move(q,w-1);
        }
        else if(q-1>=0 && map[q-1][w].getVisitable()==true && map[q-1][w].getBooleanIn()==false){
            map[q-1][w].setBooleanIn();
            move(q-1,w);
        }
        else{
            int hit = 0;
            for(int i = 0; i < map.length; i++){
                for(int u = 0; u < map.length; u++){
                    if(map[i][u].getBooleanIn()==true){
                        hit++;
                    }
                }
            }
            System.out.println(hit);
        }
    }
    public static void main(String[] args) throws IOException{
        new Snake();
    }
}