

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        String date = "";
        date += day + "/";
        date += month + "/";
        date += year;

        try {
            SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
            Date dt1;
            dt1 = format1.parse(date);
            DateFormat format2 = new SimpleDateFormat("EEEE");
            String finalDay = format2.format(dt1);
            String ans = finalDay.toUpperCase();
            
            return ans;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "";
       
    }

}

