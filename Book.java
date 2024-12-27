public class Book {
    static int totalBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;
    static {
    totalBooks=0;
    }
    {// object init
        totalBooks++;
    }

     Book(String isbn, String title, String author)
     {
         this.isbn= isbn;
         this.title= title;
         this.author= author;
     }
     Book(String isbn)
     {
         this(isbn,"Unknown"," Unknown");
     }
        static int getTotalBooks()
        {
            return totalBooks;
        }
        void borrowBook() {
            if (isBorrowed) {
                System.out.println("Book is already borrowed");
            } else {
                this.isBorrowed = true;
                System.out.println("Enjoy the "+ this.title );
            }
        }
        void returnBook()
            {
                if(isBorrowed)
                {
                    this.isBorrowed= false;
                    System.out.println("Hope you enjoyed, Please leave a review ");
                }
                else {
                    System.out.println("THis is already in library");
                }
            }

    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
    }
