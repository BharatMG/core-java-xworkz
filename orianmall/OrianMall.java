package com.forloop.orianmall;

public class OrianMall {
        static String alcohol[]={ "IB", "Black & White", "Old Monk", "100 papers",
                "Teacher's", "Tuborg", "Royal Stag", "Signature"};

        static String iceCreams[]={ "cone", "gudbud", "black current", "chocobar", "candy",
                "Ben & Jerry's","Haagen-Dazs","Blue Bunny","Edy's / Dreyer's","Bluebell",
                "Talenti","Magnum","Tillamoo"};

        static String chatsName[]={ "bhel puri", "sukha bhel", "chakna", "girmitti",
                "mirchi", "tooth vade", "pav baji", "pani puri", "bread omlet", "foxnuts",
                "popcorn"};

        static String perfumeNames[]={ "denver", "shoots", "park avenue", "signature",
                "wild stone", "engage", "sun shine", "vilan", "axis", "dior", "calvin",
                "brut","stay with me", "cool & breezy"};

        public static void main(String mall[]){
            System.out.println("Main Started");
            myAlcohol();
            myIcecreams();
            myChatsName();
            myPerfumeNames();
            System.out.println("Main Ended");
        }
        public static void myAlcohol(){
            System.out.println("List of alcohols:"+alcohol.length);
            for(int h=0;h<alcohol.length;h++){
                System.out.println(alcohol[h]);
            }
            return;
        }
        public static void myIcecreams(){
            System.out.println("List of Ice-creams:"+iceCreams.length);
            for(int m=0;m<iceCreams.length;m++){
                System.out.println(iceCreams[m]);
            }
            return;
        }
        public static void myChatsName(){
            System.out.println("List of chat names:"+ chatsName.length);
            for(int n=0;n<chatsName.length; n++){
                System.out.println(chatsName[n]);
            }
            return;
        }
        public static void myPerfumeNames(){
            System.out.println("List of perfume brands:"+ perfumeNames.length);
            for(int p=0;p<perfumeNames.length;p++){
                System.out.println(perfumeNames[p]);
            }
            return;
        }
    }
