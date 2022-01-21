import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  


class atm{

    public static int amount[]={2000,500,200,100};
    public static int note[]={0,0,0,0};
    public static int addnote[] = new int[4];
    public static String usrname[]={"vinith","kumar"};
    public static String usrmin[][] = new String[usrname.length][7]; 
    public static String usrpass[]={"1234","4321"};
    public static String useid[]={"a001","a002"};
    public static int usrbal[]={16000,10000};
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    public static Date date = new Date();  
    public static Scanner sc=new Scanner(System.in);
   
    public static void depositmoney(){
        clearScreen();
        System.out.println("\tWelcome Admin");
        System.out.println("2000 notes  :");
        addnote[0]=addnote[0]+sc.nextInt();
        System.out.println("500 notes   :");
        addnote[1]=addnote[1]+sc.nextInt();
        System.out.println("200 notes   :");
        addnote[2]=addnote[2]+sc.nextInt();
        System.out.println("100 notes   :");
        addnote[3]=addnote[3]+sc.nextInt();
        System.out.println("Amount deposited ...");
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }

       // delay(2000);


    }
    
    public static void pingeneration(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("Enter new Pin:");
        String newpin=sc.next();
        sc.nextLine();
        System.out.println("Confirm new Pin:");
        String repin=sc.next();
        sc.nextLine();
        if(newpin.equals(repin)){
            usrpass[i]=newpin;
            System.out.println("Pin changed Succesfully...");
        }else{
            System.out.println("Pin mismatch...");
        }

    }

    public static void usrdepositmoney(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("2000 notes  :");
        int two=sc.nextInt();
        addnote[0]=addnote[0]+two;
        System.out.println("500 notes   :");
        int five=sc.nextInt();
        addnote[1]=addnote[1]+five;
        System.out.println("200 notes   :");
        int two1=sc.nextInt();
        addnote[2]=addnote[2]+two1;
        System.out.println("100 notes   :");
        int one1=sc.nextInt();
        addnote[3]=addnote[3]+one1;
        int amount=(two*2000)+(five*500)+(two1*200)+(one1*100);
        usrbal[i]=usrbal[i]+amount;
        
        System.out.println("Amount deposited ...");
        System.out.println("Press 1 to continue");
          usrmin[i][0]=usrmin[i][1];
            usrmin[i][1]=usrmin[i][2];
            usrmin[i][2]=usrmin[i][3];
            usrmin[i][3]=usrmin[i][4];
            usrmin[i][4]=usrmin[i][5];
            usrmin[i][5]=formatter.format(date) + " Rs: "+amount+" deposited ";
        int one=sc.nextInt();
        if(one==1){

        }

       // delay(2000);


    }

    public static void transaction(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("Enter bank id to transfer :");
        String bank_id=sc.next();
        sc.nextLine();
       
      //  System.out.println(bank_id);
        int toperson=0;
        int flag=0;
       // System.out.println(useid.length);
        for(int t=0;t<useid.length;t++){
          
            if(bank_id.equals(useid[t])){
                
               toperson=t;
               flag=1;
               break;
            }
        }
        if(flag==1){

        System.out.println("Enter Amount transfer to "+usrname[toperson]);
        int amount=sc.nextInt();
        if(usrbal[i]>=amount){
            usrbal[i]-=amount;
            usrbal[toperson]+=amount;
            System.out.println("Amount transfered...");
           
            
            usrmin[i][0]=usrmin[i][1];
            usrmin[i][1]=usrmin[i][2];
            usrmin[i][2]=usrmin[i][3];
            usrmin[i][3]=usrmin[i][4];
            usrmin[i][4]=usrmin[i][5];
            usrmin[i][5]=formatter.format(date) + " Rs: "+amount+" transfered to "+bank_id+"";

            

        }else{
            System.out.println("Insufficient balance...");
        }}
        
         else{
            System.out.println("Invalid ID");
        }
       
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }


    }

    public static void minstatement(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("Mini Statement :");
            
            for(int j=0;j<7;j++){
                String null1=usrmin[i][6];
              
                if(usrmin[i][j]!=null1){
                System.out.println(usrmin[i][j]);}
            }
            System.out.println("Press 1 to continue");
            int one=sc.nextInt();
            if(one==1){

            }
    }

    public static void balance(){
        clearScreen();
        System.out.println("\tWelcome Admin");
        int t2000=addnote[0];
        int t500=addnote[1];
        int t200=addnote[2];
        int t100=addnote[3];
        System.out.println("2000 notes  :"+t2000);
        System.out.println("500 notes   :"+t500);
        System.out.println("200 notes   :"+t200);
        System.out.println("100 notes   :"+t100);
        System.out.println("Amount displayed ...");
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }
    }

    public static void usrbalance(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("Amount :"+usrbal[i]);
        System.out.println("Amount displayed ...");
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }
    }

    public static void withdraw(int i){
        clearScreen();
        System.out.println("\tWelcome "+usrname[i]);
        System.out.println("Enter Amount :");
        int withamount=sc.nextInt();
       int  withamount1=withamount;
       int withamount2=withamount;
      int countnote[]=new int [4];
      int countnote1[]=new int [4];
      int count3=0;
      for(int j=0;j<4;j++){
          countnote1[j]=addnote[j];
          count3+=addnote[j];
      } 
      
      

      int amount=(addnote[0]*2000)+(addnote[1]*500)+(addnote[2]*200)+(addnote[3]*100);
       if(withamount%10==0 && withamount<=amount  ){
        v:while(withamount1>0){
            if(count3!=0){
               
        if(withamount1>=2000 && countnote1[0]!=0){
           countnote[0]++;   
           countnote1[0]--;    
           withamount1=withamount1-2000;
        }else if(withamount1>=500 && countnote1[1]!=0){
            countnote[1]++;     
            countnote1[1]--;     
            withamount1=withamount1-500;
        }else if(withamount1>=200 && countnote1[2]!=0){
            countnote[2]++;           
            countnote1[2]--;
            withamount1=withamount1-200;
        }else if(withamount1>=100 && countnote1[3]!=0){
            countnote1[3]--;
           countnote[3]++;
           withamount1=withamount1-100;
        }
    count3--;}else{
        
        break v;
    }
}  }
   
   
  
    int amount1=(countnote[0]*2000)+(countnote[1]*500)+(countnote[2]*200)+(countnote[3]*100);
   
     int count =0;
     int count1=0;
     int count2=0;
            for(int j=0;j<4;j++){
                  count2+=countnote[j];
                if(countnote[j]!=0){
                    count1++;
                    if(countnote[j]<=addnote[j])
                    count+=1;
                }
            }
            
       
        int two_thousand=0,five_hundred=0,two_hundred=0,one_hundred=0;
       
        if(withamount<=amount && withamount<=usrbal[i] && count==count1 ){
           if(withamount%10==0  ){
                while(withamount>0){
                if(withamount>=2000 && countnote[0]!=0){
                   two_thousand++;
                   addnote[0]--;
                   countnote[0]--;
                   withamount=withamount-2000;
                }else if(withamount>=500 && countnote[1]!=0){
                    five_hundred++;
                    addnote[1]--;
                    countnote[1]--;
                    withamount=withamount-500;
                }else if(withamount>=200 && countnote[2]!=0){
                    two_hundred++;
                    addnote[2]--;
                    countnote[2]--;
                    withamount=withamount-200;
                }else if(withamount>=100 && countnote[3]!=0){
                   one_hundred++;
                   addnote[3]--;
                   countnote[3]--;
                   withamount=withamount-100;
                }
            }
            System.out.println("2000 notes :"+two_thousand);
            System.out.println("500 notes  :"+five_hundred);
            System.out.println("200 notes  :"+two_hundred);
            System.out.println("100 notes  :"+one_hundred);
            System.out.println("\tThanks for visiting");
            usrbal[i]=usrbal[i]-withamount2;


        }else{
            System.out.println("Enter amount only in hundreds");
        }}else{
            System.out.println("Insufficient money in atm visit near by atm ....");
        }
        System.out.println("Press 1 to continue");
        int one=sc.nextInt();
        if(one==1){

        }
       
      
       
    }

    public static void delay(int delay){

        try{
            Thread.sleep(delay);
        }
        catch(InterruptedException ex ){
             Thread.currentThread().interrupt();
        }
        }
        
    public static void clearScreen(){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

    public static void main(String[] args){
       
        int block=0;
        while(true){
            
            System.out.println("Welcome to ATM\nAdmin : 1\nUser  : 2\nExit  : 3");
            int input=sc.nextInt();
            if(input==1){
                a:while(true){
                clearScreen();
                System.out.println("Welcome to ATM\nAdmin : 1\nUser  : 2\nExit  : 3\n"+input);
                System.out.println("Enter the admin username :");
                String usrname1=sc.next();
                sc.nextLine();
                System.out.println("Enter the admin password :");
                String usrpass1=sc.nextLine();
                if(usrname1.equals("admin") && usrpass1.equals("1234")){
                    
                    while(true){
                       clearScreen();
                        System.out.println("\tWelcome Admin\nDeposit money : 1\nBalance : 2\nHome  :3");
                        int admin =sc.nextInt();
                        if(admin==1){
                               depositmoney();
                        }else if(admin==2){
                               balance();
                        }else if(admin==3){
                             break a;
                        }else {
                            System.out.println("Invalid input");
                            delay(2000);
                          
                        }    
                    }

                }else{
                    System.out.println("invalid user name password");
                    delay(2000);
                   
                    
                }}

            }else if(input==2){
                System.out.println("Enter the  username :");
                        String usrname2=sc.next();
                        sc.nextLine();
                        System.out.println("Enter the  password :");
                        String usrpass2=sc.next();
                        sc.nextLine();
                        for(int i=0;i<usrname.length;i++){
                          //  System.out.println(usrname[i]+"  "+usrpass[i]);
                          if(block!=3){
                            if(usrname2.equals(usrname[i]) && usrpass2.equals(usrpass[i])){
                                block=0;
                while(true){
                    clearScreen();
                    System.out.println("\tWelcome "+usrname[i]);
                     System.out.println("Deposit money : 1\nWithdraw money:2\nBalance : 3\nMini Statement  :4\nPin Generation :5\nTransaction :6\nHome  :7");
                     int user =sc.nextInt();
                     if(user==1){
                       
                        
                                     usrdepositmoney(i);
                            
                        
                     }else if(user==2){
                       
                                     withdraw(i);
                            
                        
                     }
                     else if(user==3){
                        
                                     usrbalance(i);
                            
                        
                     }
                     else if(user==4){
                       minstatement(i);
                     }
                         else if(user==5){
                        
                                     pingeneration(i);
                         
                     }else if(user==6){
                                  transaction(i);
                     }
                     else if(user==7){
                          break ;
                     }else {
                         System.out.println("Invalid input");
                         delay(2000);
                       
                     }    
                 }}}else{System.out.println("Your card blocked");}

            }}else if(input==3){
                System.out.println("Thanks for Coming....");
                break;
            }else{
                System.out.println("Invalid input");
                delay(2000);
                //1continue;
            }
            
            clearScreen();      
        }
    }
}