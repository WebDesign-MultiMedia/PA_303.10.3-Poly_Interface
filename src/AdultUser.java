public class AdultUser implements LibraryUser{
    protected int age;
    protected String bookType;

    public  AdultUser(String bookType, int age){

        this.bookType = bookType;
        this.age = age;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("... You have successfully registered under an Adult Account.");
        } else if (age <= 11) {
            System.out.println("... Sorry, age must be greater than 12 to register as an adult.");
        }
    }
        @Override
        public void requestBook() {
            if (bookType.equals("Fiction")){
                System.out.println(".... Book issued sucessfull, please return the book within 7 days.");
            }else {
                System.out.println(".... Oops, you are sucessfully allowed to take only adult Fiction books.");
            }
        }

    }

