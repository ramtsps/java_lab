
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class menu_10 extends Application {

    public void start(Stage s)
    {
        s.setTitle("Notepade");

        Menu m = new Menu("Menu");
        Menu file= new Menu("File");
        Menu edit=new Menu("Edit");
        Menu Formate=new Menu("Formate");
        Menu View=new Menu("View");
        Menu Help=new Menu("Help");



        MenuItem m1 = new MenuItem("menu item 1");
        MenuItem m2 = new MenuItem("menu item 2");
        MenuItem m3 = new MenuItem("menu item 3");


        MenuItem new_w=new MenuItem("New");
        MenuItem w=new MenuItem("New Window");
        MenuItem open=new MenuItem("Open");
        MenuItem seve=new MenuItem("Save");
        MenuItem save_as=new MenuItem("Save as");
        MenuItem exit=new MenuItem("Exit");

        MenuItem copy=new MenuItem("Copy");
        MenuItem past=new MenuItem("Past");
        MenuItem cut=new MenuItem("Cut");
        MenuItem undo=new MenuItem("undo");
        MenuItem Find=new MenuItem("Find");

        MenuItem word_warp=new MenuItem("Word Wrap");
        MenuItem Font=new MenuItem("Font");

        m.getItems().add(m1);
        m.getItems().add(m2);
        m.getItems().add(m3);

        file.getItems().add(new_w);
        file.getItems().add(w);
        file.getItems().add(open);
        file.getItems().add(seve);
        file.getItems().add(save_as);
        file.getItems().add(exit);

        edit.getItems().add(copy);
        edit.getItems().add(past);
        edit.getItems().add(cut);
        edit.getItems().add(undo);
        edit.getItems().add(Find);

        Formate.getItems().add(word_warp);
        Formate.getItems().add(Font);



        MenuBar mb = new MenuBar();


        mb.getMenus().add(file);
        mb.getMenus().add(edit);
        mb.getMenus().add(Formate);
        mb.getMenus().add(View);
        mb.getMenus().add(Help);
        TextArea txt=new TextArea();
        BorderPane vb = new BorderPane();

        Scene sc = new Scene(vb, 500, 300);
        vb.setTop(mb);
        vb.setCenter(txt);
        s.setScene(sc);

        s.show();
    }

    public static void main(String args[])
    {
        launch(args);
    }
}