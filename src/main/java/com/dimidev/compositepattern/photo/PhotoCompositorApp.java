package com.dimidev.compositepattern.photo;

public class PhotoCompositorApp {
    public static void main(String[] args) {
        Location root = new Location("root");

        Location belgie = new Location("België");
        root.add(belgie);

        Location brussel = new Location("Brussel");
        belgie.add(brussel);
        Location antwerpen = new Location("Antwerpen");
        belgie.add(antwerpen);

        Location anderlecht = new Location("DT, Anderlecht");
        brussel.add(anderlecht);
        anderlecht.add(new Photo("img10.jpg"));
        anderlecht.add(new Photo("img11.jpg"));

        Location zebra = new Location("Zebra, Sint-Goriks");
        brussel.add(zebra);
        zebra.add(new Photo("img12.jpg"));


        antwerpen.add(new Photo("img9.jpg"));
        antwerpen.add(new Photo("img8.jpg"));

        Location frankrijk = new Location("Frankrijk");
        root.add(frankrijk);
        Location paris = new Location("Parijs");
        frankrijk.add(paris);
        paris.add(new Photo("img7.jpg"));
        paris.add(new Photo("img2.jpg"));

        Location spanje = new Location("Spanje");
        root.add(spanje);
        spanje.add(new Photo("img2.jpg"));
        spanje.add(new Photo("img1.jpg"));

        Location brazil = new Location("Brazilië");
        brazil.add(new Photo("imgBrazil.jpg"));
        root.add(brazil);

        root.print();
    }

//            if (! (root.getChild(0) instanceof Photo) ) {
//
//                System.out.print(root.getChild(0).getName()); // België
//            }
//            else System.out.print(root.getChild(0) );

//        int i = 0;
//        do {
//            int j = 0;
//            do  {
//                root.getChild(i).getChild(j).print();
//                j++;
//            } while (root.getChild(i).getChild(j).toString().trim().length()>0);
//            i++;
//        } while (root.getChild(i).toString().trim().length()>0);
//
//
//        }

    }

