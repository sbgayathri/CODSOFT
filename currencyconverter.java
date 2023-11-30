import java.util.Scanner;
public class currencyconverter {
    double basecurrency,targetcurrency;
    double amt;
   void INR_TO_USD(double basecurrency){
    targetcurrency=basecurrency*0.0120001495 ;
    System.out.println("$ "+targetcurrency);
   }
   void INR_TO_EUR(double basecurrency){
    targetcurrency=basecurrency*0.0109361;
    System.out.println("€  "+targetcurrency);
   }
   void INR_TO_GBP(double basecurrency){
        targetcurrency=basecurrency*0.00945002;
        System.out.println("£ "+targetcurrency);
   }
   void USD_TO_INR(double basecurrency){
    targetcurrency=basecurrency*83.353;
    System.out.println("₹ "+targetcurrency);
   }
   void USD_TO_EUR(double basecurrency){
    targetcurrency=basecurrency*0.91090 ;
     System.out.println("€ "+targetcurrency);
   }
   void USD_TO_GBP(double basecurrency){
      targetcurrency=basecurrency*0.787433;
      System.out.println("£ "+targetcurrency);
   }
   void EUR_TO_INR(double basecurrency){
    targetcurrency=basecurrency*91.4003;
    System.out.println("₹ "+targetcurrency);
   }
   void EUR_TO_USD(double basecurrency){
    targetcurrency=basecurrency*1.0969;
    System.out.println("$ "+targetcurrency);
   }
   void EUR_TO_GBP(double basecurrency){
    targetcurrency=basecurrency*0.8637;
    System.out.println("£ "+targetcurrency);
   }
   void GBP_TO_INR(double basecurrency){
    targetcurrency=basecurrency*105.82;
    System.out.println("₹ "+targetcurrency);
   }
    void GBP_TO_USD(double basecurrency){
    targetcurrency=basecurrency*1.26995;
    System.out.println("$ "+targetcurrency);
    }
    void GBP_TO_EUR(double basecurrency){
        targetcurrency=basecurrency*1.15781;
        System.out.println("€ "+targetcurrency);
    }
    public static void main(String[] args) {
        currencyconverter a=new currencyconverter();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Currency Conversion");
        while(true){
            System.out.println("1.INR");
            System.out.println("2.USD");
            System.out.println("3.EUR");
            System.out.println("4.GBP");
            System.out.println("Press 0 to exit the program");
            System.out.println("Enter the base currency from the above list");
            int bc=sc.nextInt();
            if (bc==0) {
            System.exit(bc);
        }
           System.out.println("Enter the amount of the base currency");
            double basecurrency=sc.nextInt();
            System.out.println("Enter the target currency from the above list");
            int tc=sc.nextInt();
            while(bc!=tc){
            if(bc==1){
                if(tc==2){
                    a.INR_TO_USD(basecurrency);
                    break;
                }else if(tc==3){
                    a.INR_TO_EUR(basecurrency);
                    break;
                }else if(tc==4){
                    a.INR_TO_GBP(basecurrency);
                    break;
                }
            }
            if(bc==2){
                if(tc==1){
                    a.USD_TO_INR(basecurrency);
                    break;
                }else if(tc==3){
                    a.USD_TO_EUR(basecurrency);
                    break;
                }else if(tc==4){
                    a.USD_TO_GBP(basecurrency);
                    break;
                } 
            }if(bc==3){
                if(tc==1){
                    a.EUR_TO_INR(basecurrency);
                    break;
                }else if(tc==2){
                    a.EUR_TO_USD(basecurrency);
                    break;
                }else if(tc==4){
                    a.EUR_TO_GBP(basecurrency);
                    break;
                }
            }if(bc==4){
                if(tc==1){
                    a.GBP_TO_INR(basecurrency);
                    break;
                }else if(tc==2){
                    a.GBP_TO_USD(basecurrency);
                    break;
                }else if(tc==3){
                    a.GBP_TO_EUR(basecurrency);
                    break;
                }
            }   
        }if(bc==tc){
        System.out.println("Invalid Target Currency");
        }   
    }
}
}

