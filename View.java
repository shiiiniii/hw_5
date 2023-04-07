package work.view;

import java.io.IOException;
import java.util.Scanner;

import work.presenter.Presenter;

public class View {
    private Presenter presenter;
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public void setPresenter(Presenter presenter){
        this.presenter = presenter;
    }
    

    public void start() throws IOException{
        int choice = scan();
        presenter.onClick(choice);
    }

    private int scan(){
        System.out.println("1. Вход\n 2. Посмотреть все записи\n 3.Выход");
        int choice = scanner.nextInt();
        return choice;
    }
}
