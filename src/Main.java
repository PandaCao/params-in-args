import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File vstup = new File("vstup.txt");
        FileWriter vystup = new FileWriter("vystup.txt");
        Scanner sc = new Scanner(vstup);

        Path path = Paths.get(String.valueOf(vstup));
        int i = (int) Files.lines(path).count();


        if (args[0].equals("input.txt")){
            if(args.length>1){
                if (args[1].equals("output.txt")){
                    try {
                        if(i%2==0){
                            while (sc.hasNextLine()) {
                                int data = sc.nextInt();
                                if(data%2==0){
                                    String s = Integer.toString(data);
                                    vystup.write(s+"\n");
                                    System.out.println("data ze zapsala do souboru vystup.txt");
                                    System.out.println(data);
                                }
                            }
                        }
                        if(i%2==1){
                            while (sc.hasNextLine()) {
                                int data = sc.nextInt();
                                if(data%2==1){
                                    String s = Integer.toString(data);
                                    vystup.write(s+"\n");
                                    System.out.println("data ze zapsala do souboru vystup.txt");
                                    System.out.println(data);
                                }
                            }
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            try {
                if(i%2==0){
                    while (sc.hasNextLine()) {
                        int data = sc.nextInt();
                        if(data%2==0){
                            System.out.println(data);
                        }
                    }
                }
                if(i%2==1){
                    while (sc.hasNextLine()) {
                        int data = sc.nextInt();
                        if(data%2==1){
                            System.out.println(data);
                        }
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            if(args.length%2==0){
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                }
            }
            if(args.length%2==1){
                for (String arg : args) {
                    int num = Integer.parseInt(arg);
                    if (num % 2 == 1) {
                        System.out.println(num);
                    }
                }
            }
        }
        sc.close();
        vystup.close();
    }
}
