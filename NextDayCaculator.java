public  class NextDayCaculator {
    public static String showNextDay(int ngay, int thang, int nam){
        int CUOITHANG =31;
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                CUOITHANG = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                CUOITHANG =30;
                break;
            case 2:
                CUOITHANG=28;
        }
        if(ngay==CUOITHANG) {
            ngay = 1;
            thang += 1;
        }else {
            ngay += 1;
        }
        return ngay + "/" + thang + "/" + nam ;

        }
    }

