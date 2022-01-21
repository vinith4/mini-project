import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class library {

    public static Scanner sc=new Scanner(System.in);
    static List<String> username = new ArrayList<>();//username name
    static List<String> userpass = new ArrayList<>();//userpassword
    static List<Integer> userbal = new ArrayList<>();//userbalance
    static List<String> userid = new ArrayList<>();//userid
    static int usid=1002;



    static List<String> bookname = new ArrayList<>();//book name
    static List<String> bookauthor = new ArrayList<>();//book author
    static List<Integer> bookprice = new ArrayList<>();//book prize
    static List<Integer> bookquantity = new ArrayList<>();//book quantity
    static List<Integer> bookborrow = new ArrayList<>();//book borrow
    static List<String> bookid = new ArrayList<>();//book id
    static int book_id=1004;


    static List<String> cartbookname = new ArrayList<>();//cart book name
    static List<String> cartbookauthor = new ArrayList<>();//cart book author
    static List<Integer> cartbookprice = new ArrayList<>();//cart book prize
    static List<String> cartbookid = new ArrayList<>();//cart book name
    static List<String> cartusername =new ArrayList<>();//cart user name

     
    static List<String> purchasebookid = new ArrayList<>();//purchase book id
    static List<String> purchaseusername = new ArrayList<>();//purchase user name

    static List<String> reviewbookid = new ArrayList<>();//review book id
    static List<String> reviewusername = new ArrayList<>();//review user name
    static List<String> review = new ArrayList<>();//review

    

    
    public static void add(){
        username.add("vinith");
        userpass.add("1234");
        userbal.add(1000);
        userid.add("U1001");
        bookname.add("Vinith");
        bookauthor.add("Kumar");
        bookprice.add(1000);
        bookid.add("B1001");
        bookquantity.add(10);
        bookborrow.add(0);
        bookname.add("science");
        bookauthor.add("Kumar");
        bookprice.add(1000);
        bookid.add("B1002");
        bookquantity.add(10);
        bookborrow.add(0);
        bookname.add("social");
        bookauthor.add("Kumar");
        bookprice.add(1000);
        bookid.add("B1003");
        bookquantity.add(10);
        bookborrow.add(0);

    }
    public static void delay(){
        System.out.println("Press 1 to continue");
        int one =sc.nextInt();
        if(one==1){

        }
    } 
    public static void clearscreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void admin(){
        while(true){
        clearscreen();
         System.out.println("Welcome admin"); 
         System.out.println("1.Add a book");
         System.out.println("2.Modify book");
         System.out.println("3.Delete book");
         System.out.println("4.List of books");
         System.out.println("5.Add user");
         System.out.println("6.Review books");
         
         System.out.println("7.Exit");
         System.out.println("Enter your choice:");
         int admin_choice=sc.nextInt();

        if(admin_choice==1){
               addbook();
        }else if(admin_choice==2){
                editbook();
        }else if(admin_choice==3){
               removebook();
        }else if(admin_choice==4){
               listofbooks();
        }else if(admin_choice==5){
               user();
        }else if(admin_choice==6){
               showreview();
        }else if(admin_choice==7){
              break;
        }else{
            System.out.println("Invalid Input");
        }
         delay();
       }
    }
    public static void addbook(){
        clearscreen();
        System.out.println("Add book");
        System.out.println("Enter book title :");
        String book_name=sc.next();
        System.out.println("Enter book author :");
        String book_author=sc.next();
        System.out.println("Enter book price :");
        int book_price=sc.nextInt();
        System.out.println("Enter book quantity :");
        int book_quantity=sc.nextInt();
        bookname.add(book_name); 
        bookauthor.add(book_author);
        bookquantity.add(book_quantity);
        bookprice.add(book_price);
        String bid="B"+book_id;
        bookid.add(bid);
        book_id++;
        bookborrow.add(0);
        System.out.println("Book ID "+bid);
        System.out.println("Book Added...");
      

    }
    public static void listofbooks(){
        clearscreen();
        for(int i =0;i<bookid.size();i++){
            System.out.println("Book Number    :"+(i+1));
            System.out.println("Book Name      :"+bookname.get(i));
            System.out.println("Book Author    :"+bookauthor.get(i));
            System.out.println("Book Price     :"+bookprice.get(i));
            System.out.println("Book Quantity  :"+bookquantity.get(i));
            System.out.println("Book ID        :"+bookid.get(i));
            System.out.println();
        }
        
    }
    public static void user(){
        clearscreen();
        System.out.println("ADD new User");
        a1:while(true){
        System.out.println("Enter User name:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<username.size();i++){                    
           if(check.equals(username.get(i)) ){
               System.out.println("name is alerdy in use try another name");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             username.add(check);
             break a1;
            }
                              
        }
        a1:while(true){
        System.out.println("Enter password:");
        String check=sc.next();
        sc.nextLine();
        int check1=0;
        for(int i=0;i<userpass.size();i++){                    
           if(check.equals(userpass.get(i)) ){
               System.out.println("password is alerdy in use try another password");
                  check1=1;
                   break ;
            }
        }
        if(check1==0){
             userpass.add(check);
             break a1;
            }
                              
        }
        
        a1:while(true){
        System.out.println("Enter atleast 1500 for initial installment");
        int sfr = sc.nextInt();
        int check1=0;

        if(sfr>=1500)
        {
        
        System.out.println("Your membership card is issued");
        System.out.println("Your membership id is "+"U"+usid);
        System.out.println("Note it for future purpose");
        String bid="U"+usid;
        userid.add(bid);
        userbal.add(sfr);
        usid++;
        check1=1;
        }
        else 
        {
        System.out.println("You should deposit 1500 during registration");
        }

        if(check1==1){
            break a1;
           }                     
        }

        
        System.out.println("User Created..");
       
       
    }
    public static void newuser(){
        System.out.println("Enter username :");
        String usrname=sc.next();
        sc.nextLine();
        System.out.println("Enter user password:");
        String usrpass=sc.next();
        sc.nextLine();   
        int check=0;
        a:while(true){
            for(int i =0;i<username.size();++i){
                if(username.get(i).equals(usrname) && userpass.get(i).equals(usrpass) ){
                    check=1;
                    while(true){
                        clearscreen();
                        System.out.println("Welcome "+username.get(i));
                        System.out.println("1.Purchase books");
                        System.out.println("2.View cart");
                        System.out.println("3.Wallet");
                        System.out.println("4.Your Review");
                        System.out.println("5.Your books");
                        System.out.println("6.Exit");
                        System.out.println("Enter your choice:");
                        int userchoice=sc.nextInt(); 

                        if(userchoice==1){
                            book(i);
                        }else if(userchoice==2){
                           cart(i);
                        }else if(userchoice==3){
                            wallet(i);
                        }else if(userchoice==4){
                            yourreview(i);
                        }else if(userchoice==5){
                            history(i);
                        }else if(userchoice==6){
                               break a;
                        }else{
                            System.out.println("Invalid Input...");
                        }
                        delay();
                       
                        
                    }
                }}if(check==0){
                    System.out.println("Invalid username or password");
                    delay();
                    break a;
                   
                }

            
        }
    }
    public static void wallet(int a){
        while(true){
        clearscreen();
        System.out.println("\tWallet");
        System.out.println("Your current balance:"+userbal.get(a));
        System.out.println("1.Add money\n2.Back\nEnter choice:");
        int wallet=sc.nextInt();
        if(wallet==1){
            System.out.println("Enter Amount:");
            int amount =sc.nextInt();
            userbal.set(a,(userbal.get(a)+amount));
            System.out.println("Amount Added");
            System.out.println();
            System.out.println("Your current balance:"+userbal.get(a));
            System.out.println();
            delay();
        }else if(wallet==2){
            break;
        }else{
           System.out.println("Invalid input...");
        }
    }
    }
    public static void book(int a){
        
            clearscreen();
            System.out.println("Welcome "+username.get(a));
            for(int i =0;i<bookid.size();i++){
            System.out.println("Book Number    :"+(i+1));
            System.out.println("Book Name      :"+bookname.get(i));
            System.out.println("Book Author    :"+bookauthor.get(i));
            System.out.println("Book Price     :"+bookprice.get(i));
            System.out.println("Book Quantity  :"+bookquantity.get(i));
            System.out.println("Book ID        :"+bookid.get(i));
            System.out.println();
        }
        while(true){
        System.out.println("1.Add to cart");
        System.out.println("2.Purchase using wallet");
        System.out.println("3.Exit");
        System.out.println("Enter Choice :");
        int bookchoice=sc.nextInt();
        if(bookchoice==1){
            System.out.println("Enter book ID");
            String cart=sc.next();
            sc.nextLine();
            int check=0;
            for(int i =0;i<bookid.size();i++){
                if(cart.equals(bookid.get(i)) && bookquantity.get(i)>0){
                    check=1;
                   cartbookname.add(bookname.get(i));
                   cartbookauthor.add(bookauthor.get(i));
                   cartbookid.add(bookid.get(i));
                   cartbookprice.add(bookprice.get(i));
                   cartusername.add(username.get(a));
                   System.out.println("Added to cart..");
                }
            }
            if(check==0){
                System.out.println("Invalid book id..");
                delay();
            }
            

        }else if(bookchoice==2){
            System.out.println("Enter book ID");
            String cart=sc.next();
            sc.nextLine();
            int check=0;
            int check1=0;
            int pur=0;
            for(int i=0;i<purchasebookid.size();i++){
                if(username.get(a).equals(purchaseusername.get(i))){
                      pur++;
                }
                if(cart.equals(purchasebookid.get(i))){
                    check1=1;
                }
            }
            if(userbal.get(a)>=500){
            if(pur<3){
            for(int i =0;i<bookid.size();i++){
                if(check1==0){
                if(cart.equals(bookid.get(i)) && bookquantity.get(i)>0){
                   check=1;
                   purchasebookid.add(bookid.get(i));
                   purchaseusername.add(username.get(a));
                   int quantity=bookquantity.get(i);
                   bookquantity.set(i,quantity--);
                   int borrow = bookborrow.get(i);
                   bookborrow.set(i,borrow++);
                   int balance = userbal.get(a);
                   userbal.set(a,balance-500);
                   System.out.println("book borrowed..");
                }
                }else{
                    System.out.println("Alerdy You having this book");
                    break;
                }
            }
            if(check==0){
                System.out.println("Invalid book id..");
                delay();
            }}else{
                System.out.println("one user can borrow only 3 books in a row");
            }}else{
                System.out.println("User balance must be grater than 500");
            }
            

        }else if (bookchoice==3){
            break;
        }else{
        System.out.println("Invalid input...");
        delay();
        }
    }
    }
    public static void cart(int a){
            clearscreen();
            System.out.println("Welcome "+username.get(a));
            for(int i =0;i<cartbookid.size();i++){
                if(username.get(a).equals(cartusername.get(i))){
                System.out.println("Book Number    :"+(i+1));
                System.out.println("Book Name      :"+cartbookname.get(i));
                System.out.println("Book Author    :"+cartbookauthor.get(i));
                System.out.println("Book Price     :"+cartbookprice.get(i));
                System.out.println("Book ID        :"+cartbookid.get(i));
                System.out.println();
                }
            }
    }
    public static void history(int a){
        while(true){
        clearscreen();
        System.out.println("Welcome "+username.get(a));
        for(int i =0;i<purchasebookid.size();i++){
            if(username.get(a).equals(purchaseusername.get(i))){
                for(int j=0;j<bookid.size();j++){
                    if(purchasebookid.get(i).equals(bookid.get(j)) && bookquantity.get(j)>0){

                        System.out.println("Book Number    :"+(i+1));
                        System.out.println("Book Name      :"+bookname.get(j));
                        System.out.println("Book Author    :"+bookauthor.get(j));
                        System.out.println("Book Price     :"+bookprice.get(j));
                        System.out.println("Book Quantity  :"+bookquantity.get(j));
                        System.out.println("Book ID        :"+bookid.get(j));
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("1. Return Book");
        System.out.println("2. Review books");
        System.out.println("3. Exit");
        System.out.println("Enter Chioce:");
        int histroy1=sc.nextInt();
        if(histroy1==1){
            System.out.println("Enter Book Id:");
            String id=sc.next();
            sc.nextLine();
            int check=0;
            for(int i =0;i<purchasebookid.size();i++){
                if(purchasebookid.get(i).equals(id)){
                    check=1;
                    purchasebookid.remove(i);
                    purchaseusername.remove(i);
                    int quantity=bookquantity.get(i);
                     bookquantity.set(i,quantity++);
                    int borrow = bookborrow.get(i);
                    bookborrow.set(i,borrow--);
                    int balance = userbal.get(a);
                    userbal.set(a,balance+500);
                    System.out.println("Book returned..");
                    delay();
                    break;
                }
            }
            if(check==0){
                System.out.println("Invalid Book id...");
                delay();
            }

        }
        else if(histroy1==2){
            System.out.println("Enter Book Id:");
            String id=sc.next();
            sc.nextLine();
            int check=0;
            for(int i =0;i<purchasebookid.size();i++){
                if(purchasebookid.get(i).equals(id)){
                    check=1;
                    System.out.println("1.Excellent");
                    System.out.println("2.Good");
                    System.out.println("3.Poor");
                    reviewbookid.add(purchasebookid.get(i));
                    reviewusername.add(username.get(a));
                    System.out.println("Enter Choice");
                    int re=sc.nextInt();
                    if(re==1){
                        review.add("Excellent");
                    }else if(re==2){
                        review.add("Good");
                    }else {
                        review.add("Poor");
                    }
                    System.out.println("Review Added..");
                    delay();

                }
            }
            if(check==0){
                System.out.println("Invalid Book id...");
                delay();
            }
        }else if(histroy1==3){
              break;
        }else{
            System.out.println("Invalid input");
            delay(); 
        }
       

        
    }
    }
    public static void editbook(){
        clearscreen();
        System.out.println("Enter Book Id:");
        String id=sc.next();
        sc.nextLine();
        int check=0;
        System.out.println("Edit Book");
        for (int j=0;j<bookid.size();j++){
            if(id.equals(bookid.get(j))){
                
                
                System.out.println("Book Name     :"+bookname.get(j));
                System.out.println("Enter new Name   :");
                String newname=sc.next();sc.nextLine();
                bookname.set(j,newname);
                System.out.println("Book Author Name :"+bookauthor.get(j));
                System.out.println("Enter new Name   :");
                String newnameauth=sc.next();sc.nextLine();
                bookauthor.set(j,newnameauth);
                System.out.println("book Price    :"+bookprice.get(j));
                System.out.println("Enter new Price  :");
                int productprice=sc.nextInt();
                bookprice.set(j,productprice);
                System.out.println("Book Quantity :"+bookquantity.get(j));
                System.out.println("Enter new count  :");
                int productquan=sc.nextInt();
                bookquantity.set(j,productquan);
               
                System.out.println("----------------------------------------");
                check=1;
                System.out.println();

            }  
        }
        if(check==0){
            System.out.println("Invalid Book id...");
        }
    }
    public static void removebook(){
        clearscreen();
      
        System.out.println("Remove Book");
        System.out.println("Enter Book ID");
        String book_id=sc.next();
        sc.nextLine();
        int id=0;
        
        for (int j=0;j<bookid.size();j++){
            if(book_id.equals(bookid.get(j))){

                bookid.remove(j);
                bookname.remove(j);
                bookauthor.remove(j);
                bookprice.remove(j);
                bookquantity.remove(j);
                bookborrow.remove(j);
               
                System.out.println("Book Removed...");
                id=1;

            }
            
           
        }if(id==0){
            System.out.println("Book Id not found...");
        }

       
    }
    public static void showreview(){
        clearscreen();
        for(int i =0;i<reviewbookid.size();i++){
            System.out.println("Book Number    :"+(i+1));
            System.out.println("Book ID        :"+reviewbookid.get(i));
            System.out.println("Book review    :"+review.get(i));
            System.out.println("User Name      :"+reviewusername.get(i));
            System.out.println();
        }

    }
    public static void yourreview(int a){
        System.out.println("Welcome "+username.get(a));
        clearscreen();
        for(int i =0;i<reviewbookid.size();i++){
            if(username.get(a).equals(reviewusername.get(i))){
            System.out.println("Book Number    :"+(i+1));
            System.out.println("Book ID        :"+reviewbookid.get(i));
            System.out.println("Book review    :"+review.get(i));
            System.out.println();
            }
        }

    }
    public static void main(String[] args){
        add();
      while(true){
        clearscreen();
        System.out.println("Library");
        System.out.println("1.Admin login");
        System.out.println("2.User login");
        System.out.println("3.Exit");
        System.out.println("Enter your choice");
        int input = sc.nextInt();
        if(input==1){

             System.out.println("Admin login");
             System.out.println("Enter Username :");
             String s1 = sc.next();
             System.out.println("Enter Password :");
             String s2=sc.next();
               if(s1.equals("admin") && s2.equals("1234"))
               {
                  admin();
               }
               else 
               {
                  System.out.println("Incorrect username or password");
               }
        }else if(input==2){
            while(true){
            clearscreen();
            System.out.println("\tWelcome");
            System.out.println("1.Create account");
            System.out.println("2.login ");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int userchoie = sc.nextInt();
            if(userchoie==1){
                user();
            }else if(userchoie==2){
                newuser();
            }else if(userchoie==3){
                break;
            }else{
                System.out.println("Invalid input");
                delay();
            }

        }
        }else if(input==3){
             break ;
        }else{
            System.out.println("Invalid input");
            delay();
        }
      }
    }
}
