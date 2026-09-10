public  class Main{
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    void main() {
        System.out.println("Ugeopgave 2: Kontrolstrukturer");
        System.out.println("Opgave 1: Shopping discount");
        double totalPrice=50;

        double finalDiscountPrice;
        if(totalPrice > 1000) {
            finalDiscountPrice = 80*totalPrice /100; //fordi vi betaler 80% hvis den koster mere end 1000
            System.out.println("the price is over 1000, so the new final discount price is: " +finalDiscountPrice + " kr");
        } else {
            System.out.println("the price is " + totalPrice +" under 1000, no discount");
        }
        System.out.println();

        System.out.println("Opgave 2: BMI calculator");
        int BMI;
        int weight = 53;
        int height =164;
        BMI = weight/ (height*height);
        { System.out.println(BMI);
        }
        if(BMI>=25) {
            System.out.println("Overveight");
        } else if (BMI<=25 && BMI<= 18) {
            System.out.println("normal weight");
        } else {
            System.out.println("underweight");
        }
        System.out.println();


        System.out.println("Betingelser med AND");
        System.out.println("Opgave 3: Time of day greeting");
        int time;
        time = 14;
        if (time<=0 && time<=11) {
            System.out.println("det er formiddag");
        } else if(time>=12 && time<=17) {
            System.out.println("det er eftermiddag");
        } else if(time>=18 && time <=21) {
            System.out.println("Det er aften");
        } else {
            System.out.println("det er night");
        }
        System.out.println();


        System.out.println("Opgave 4: Complete student report");
        int score = 88;
        char grade;
        if(score>90) {
            System.out.println("A");
            System.out.println("Excellent");
        } else if(score>70) {
            System.out.println("B");
            System.out.println("Good");
        } else if(score>50) {
            System.out.println("C");
            System.out.println("Satisfactory");
        } else if(score>30) {
            System.out.println("D");
            System.out.println("Needs improvement");
            } else {
            System.out.println("F");
            System.out.println("Failing");
        }
        System.out.println();


        System.out.println("Betingelser med OR");
        System.out.println("Opgave 5: Shipping eligibility");
        int ttotalPrice =350;
        boolean isMember = true;
        if(ttotalPrice>500 || (ttotalPrice>200 && isMember)) {
            System.out.println("Price "+ttotalPrice+ "kr, free shipping");
        } else {
            System.out.println("Price " + "kr and 50 kr shipping");
        }
        System.out.println();


        System.out.println("Kombinerede operatorer" +
                "Opgave 8: Insurance premium calculator");
        int basisPremie = 5000;
        int tillægRisiko = 2000;
        int age =22;
        boolean hasAccident= false;
        int accidents = 0;
        boolean hasRiskZone = false;
        if((age<25 || age>70) || ((hasAccident && hasAccident) || hasRiskZone)) {
            System.out.println("Premie "+ (basisPremie + tillægRisiko)+ " kr");
        } else {
            System.out.println(basisPremie +" kr");
        }
        System.out.println();












        }




    }

