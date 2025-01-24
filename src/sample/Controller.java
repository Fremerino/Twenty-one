package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
public class Controller<count> {
    public Random rand = new Random();
    public ImageView bank1;
    public ImageView bank2;
    public ImageView hrac1;
    public ImageView hrac2;
    public ImageView hrac3;
    public ImageView hrac4;
    public ImageView hrac5;
    public ImageView hrac6;
    public ImageView hrac7;
    public ImageView hrac8;
    public ImageView hrac9;
    public ImageView hrac10;
    public ImageView hrac11;
    public ImageView hrac12;
    public Label hrac;
    public Label banker;
    public Label konec2;
    public ArrayList<File> list = new ArrayList<File>();
    public int[] body = {10,9,11,2,8,7,1,1,10,9,11,2,8,7,1,1,10,9,11,2,8,7,1,1,10,9,11,2,8,7,1,1};
    public ArrayList<Integer> pes = new ArrayList<Integer>();
    public int pocet = 0;
    public int vysledek = 0;
    public int bankerbody = 0;

    public ArrayList<ImageView> list2 = new ArrayList<ImageView>();
    public void dal1(ActionEvent actionEvent) {
        int rand_int1 = rand.nextInt(32);
        for (int a = 0; a < pes.size(); a++) {
            while (rand_int1 == pes.get(a)) {
                rand_int1 = rand.nextInt(32);
            }
        }

        Image a = new Image(list.get(rand_int1).toURI().toString());
        list2.get(pocet).setImage(a);
        pocet++;
        vysledek = vysledek + body[rand_int1];
        if(vysledek>21) {
            konec2.setText("Prohra");
              pocet = 0;
            Image b1 = new Image(list.get(pes.get(0)).toURI().toString());
            Image b2 = new Image(list.get(pes.get(1)).toURI().toString());
            bank1.setImage(b1);
            bank2.setImage(b2);
            banker.setText(""+bankerbody);
            pes.clear();


        }
        hrac.setText(""+vysledek);

    }





    public void kon1(ActionEvent actionEvent) {
        if(vysledek>bankerbody && vysledek<=21)
        {
            konec2.setText("Vyhrál si");
            Image b1 = new Image(list.get(pes.get(0)).toURI().toString());
            Image b2 = new Image(list.get(pes.get(1)).toURI().toString());
            bank1.setImage(b1);
            bank2.setImage(b2);
            pocet = 0;
            pes.clear();
        }
        else {
            konec2.setText("prohra");
            Image b1 = new Image(list.get(pes.get(0)).toURI().toString());
            Image b2 = new Image(list.get(pes.get(1)).toURI().toString());
            bank1.setImage(b1);
            bank2.setImage(b2);
            pocet = 0;
            pes.clear();
        }
        banker.setText(""+bankerbody);

    }

    public void nov1(ActionEvent actionEvent) {
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_desitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_devitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_eso.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_kral.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_osma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_sedma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_spodek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\c_svrsek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_desitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_devitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_eso.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_kral.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_osma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_sedma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_spodek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\e_svrsek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_desitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_devitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_eso.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_kral.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_osma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_sedma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\k_spodek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_svrsek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_desitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_devitka.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_eso.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_kral.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_osma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_sedma.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_spodek.jpg"));
        list.add(new File("D:\\Oko bere\\src\\sample\\image\\z_svrsek.jpg"));

        list2.add(hrac3);
        list2.add(hrac4);
        list2.add(hrac5);
        list2.add(hrac6);
        list2.add(hrac7);
        list2.add(hrac8);
        list2.add(hrac9);
        list2.add(hrac10);
        list2.add(hrac11);
        list2.add(hrac12);




        Image a = new Image(new File("D:\\Oko bere\\src\\sample\\image\\rub.jpg").toURI().toString());
        int rand_int1 = rand.nextInt(32);
        pes.add(rand_int1);

        int rand_int2 = rand.nextInt(32);
        while(rand_int2== pes.get(0)) {
             rand_int2 = rand.nextInt(32);
        }
        pes.add(rand_int2);
        int rand_int3 = rand.nextInt(32);
        while(rand_int3== pes.get(0) || rand_int3== pes.get(1)) {
            rand_int3 = rand.nextInt(32);
        }
        pes.add(rand_int3);

        int rand_int4 = rand.nextInt(32);
        while(rand_int4== pes.get(0) || rand_int4== pes.get(1) || rand_int4== pes.get(2)) {
            rand_int4 = rand.nextInt(32);
        }
        pes.add(rand_int4);
        vysledek = body[rand_int3]+  body[rand_int4];
        bankerbody = body[rand_int1]+  body[rand_int2];
        hrac.setText(""+vysledek);
        banker.setText("");
        konec2.setText("");
        Image b1 = new Image(list.get(rand_int1).toURI().toString());
        Image b2 = new Image(list.get(rand_int2).toURI().toString());

        Image h1 = new Image(list.get(rand_int3).toURI().toString());
        Image h2 = new Image(list.get(rand_int4).toURI().toString());
        bank1.setImage(a);
        bank2.setImage(a);

        hrac1.setImage(h1);
        hrac2.setImage(h2);
        hrac3.setImage(a);
        hrac4.setImage(a);
        hrac5.setImage(a);
        hrac6.setImage(a);
        hrac7.setImage(a);
        hrac8.setImage(a);
        hrac9.setImage(a);
        hrac10.setImage(a);
        hrac11.setImage(a);
        hrac12.setImage(a);
    }
}
