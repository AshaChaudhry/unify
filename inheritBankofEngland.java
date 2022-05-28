package UnifyProjects;

public class inheritBankofEngland {
    double interestrate=2.5;
    double interestrate1=1.7;
    class Natwest{
        public double interestrate(){
            return interestrate;

        }
    }

    class Barclays extends Natwest {
        public double interestrate1(){
            return interestrate1;
        }
    }}
    class Halifax{
        public static void main(String[] args) {
          inheritBankofEngland i=new inheritBankofEngland();
           System.out.println(i.interestrate);
            System.out.println(i.interestrate1);



        }
    }





