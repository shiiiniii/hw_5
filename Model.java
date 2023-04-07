package work.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import work.presenter.Presenter;

public class Model {
    
    private String str;
    private Scanner scanner;
    private static StringBuilder sb;
    private Presenter presenter;


    public Model() throws Exception{
        scanner = new Scanner(System.in);
        Model.sb = new StringBuilder();
        readerFile();
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }

    public void choice(int choice) throws IOException{
        start(choice);
    }

    private void start(int choice) throws IOException{
        if (choice == 1){
            record();
        }
        if (choice == 2){
            read();
        }
        if (choice == 3){
            
        }     
    }

    private void record() throws IOException {
        System.out.println("Enter the text: ");
        str = scanner.nextLine();
        sb.append(str + "\n");
        recordFile(str);
        back();
    }

    private void read() throws IOException{
        System.out.println(sb.toString());
        back();
    }

    private void back() throws IOException{
        presenter.back();
    }

    private void readerFile() throws Exception{
        FileReader fr = new FileReader("file.txt");
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()){
            sb.append(scan.nextLine() +"\n");
        }
        fr.close();
    }

    private void recordFile(String str) throws IOException{
        FileWriter fw = new FileWriter( "file.txt", true );
        fw.write(str + "\n");
        fw.close();
    }
}
