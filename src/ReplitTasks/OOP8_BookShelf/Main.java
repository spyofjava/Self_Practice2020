package ReplitTasks.OOP8_BookShelf;

public class Main {


    public static void main(String[] args) {


        Book book1=new Book();
        Book book2=new Book();
        Shelf.addBook(book1);

        book1 = new Book(123, "ali" ,"the yuki the",300);
        book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);
        Shelf.addBook(book1);
        Shelf.addBook(book2);
//        System.out.println(book2.getAuthor());
      //  Shelf.addBook(434, "Dan Brown", "the da Vinci coDe", 1532);
//
        System.out.println(Shelf.getTheBooks());
        System.out.println(Shelf.findBookByPartialTitle("the"));
        // System.out.println(book2);
       // System.out.println(Shelf.isIDUnique(book2.getId()));
       // System.out.println(book2.getTitle());


        //System.out.println(Shelf.getTheBooks().size());


    }
}
