public class Main {
    public static void main(String args[]){
        Products system = new Products();
        int options =0;
        int choice = 0;
        system.LandingBlock();
        if (system.a){
            do{

                    
                    system.DisplayMenu();
                    if (system.scanner.hasNextInt()) {
                       choice = system.scanner.nextInt();
                    } else {
                            System.out.println("Invalid option, only numbers (1-6) are permitted!");
                            system.scanner.nextLine();
                            continue;      
                    };
                     switch (choice){
                    case 1:
                        system.CaptureProduct();
                        break;
                    case 2:
                        system.SearchProduct();
                        break;
                    case 3:
                        system.UpdateProduct();
                        break;
                    case 4:
                        system.DeleteProduct();
                        break;
                    case 5:
                        system.PrintReport();
                        break;
                    case 6:
                        system.ExitApplication();
                        options = system.exitInt;
                        break;
                    default:
                         System.out.println("Invalid option!!");
                         system.DisplayMenu();
                         break;
                        };

        } while(options !=6);
     } else{
        system.ExitApplication();
     }
        
  }
};
   